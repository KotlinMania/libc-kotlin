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

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rewind(stream: FILE?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perror(s: String?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atof(s: String?): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atoll(s: String?): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun malloc(size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msize(p: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun free(p: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abort(): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exit(status: CInt): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atexit(cb: AtexitCbCallback): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getenv(s: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strdup(cs: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strlen(cs: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerror(n: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsnlen(str: COpaquePointer?, numberOfElements: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand(seed: CUint): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ctime(sourceTime: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gmtimeS(destTime: COpaquePointer?, srcTime: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDaylight(hours: COpaquePointer?): ErrnoT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDstbias(seconds: COpaquePointer?): ErrnoT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTimezone(seconds: COpaquePointer?): ErrnoT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTzname(pReturnValue: COpaquePointer?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localtimeS(tmDest: COpaquePointer?, sourceTime: COpaquePointer?): ErrnoT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun time(destTime: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tzset(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chmod(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wchmod(path: COpaquePointer?, mode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdir(path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wrmdir(path: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wstat(path: COpaquePointer?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wutime(file: COpaquePointer?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wopen(path: COpaquePointer?, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun creat(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wexecl(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wexecle(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execlp(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wexeclp(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execlpe(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wexeclpe(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wexecv(prog: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wexecve(prog: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wexecvp(c: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wexecvpe(c: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpid(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pipe(fds: COpaquePointer?, psize: CUint, textmode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun commit(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getOsfhandle(fd: CInt): IntptrT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsetlocale(category: CInt, locale: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alignedFree(ptr: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putenv(envstring: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wputenv(envstring: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wputenvS(envstring: COpaquePointer?, valueString: COpaquePointer?): ErrnoT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun listen(s: Socket, backlog: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpeername(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getsockname(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: COpaquePointer?, fromlen: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: COpaquePointer?, tolen: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
