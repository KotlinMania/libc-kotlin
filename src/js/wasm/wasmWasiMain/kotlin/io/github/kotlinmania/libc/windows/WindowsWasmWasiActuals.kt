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
    0

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun isalnum(c: CInt): CInt =
    0

public actual fun isalpha(c: CInt): CInt =
    0

public actual fun iscntrl(c: CInt): CInt =
    0

public actual fun isdigit(c: CInt): CInt =
    0

public actual fun isgraph(c: CInt): CInt =
    0

public actual fun islower(c: CInt): CInt =
    0

public actual fun isprint(c: CInt): CInt =
    0

public actual fun ispunct(c: CInt): CInt =
    0

public actual fun isspace(c: CInt): CInt =
    0

public actual fun isupper(c: CInt): CInt =
    0

public actual fun isxdigit(c: CInt): CInt =
    0

public actual fun isblank(c: CInt): CInt =
    0

public actual fun tolower(c: CInt): CInt =
    0

public actual fun toupper(c: CInt): CInt =
    0

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
}

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?) {
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    null

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    null

public actual fun fflush(file: FILE?): CInt =
    0

public actual fun fclose(file: FILE?): CInt =
    0

public actual fun remove(filename: String?): CInt =
    0

public actual fun rename(oldname: String?, newname: String?): CInt =
    0

public actual fun tmpfile(): FILE? =
    null

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    0

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
}

public actual fun getchar(): CInt =
    0

public actual fun putchar(c: CInt): CInt =
    0

public actual fun fgetc(stream: FILE?): CInt =
    0

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    null

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    0

public actual fun fputs(s: String?, stream: FILE?): CInt =
    0

public actual fun puts(s: String?): CInt =
    0

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    0

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    0

public actual fun ftell(stream: FILE?): CLong =
    0L

public actual fun rewind(stream: FILE?) {
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun feof(stream: FILE?): CInt =
    0

public actual fun ferror(stream: FILE?): CInt =
    0

public actual fun perror(s: String?) {
}

public actual fun atof(s: String?): CDouble =
    0.0

public actual fun atoi(s: String?): CInt =
    0

public actual fun atol(s: String?): CLong =
    0L

public actual fun atoll(s: String?): CLonglong =
    0L

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    0.0

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    0.0f

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    0L

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    0L

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    0uL

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    0uL

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun malloc(size: SizeT): COpaquePointer? =
    null

public actual fun msize(p: COpaquePointer?): SizeT =
    0uL

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun free(p: COpaquePointer?) {
}

public actual fun abort(): Nothing =
    error("Unreachable noreturn C function abort")

public actual fun exit(status: CInt): Nothing =
    error("Unreachable noreturn C function exit")

public actual fun atexit(cb: AtexitCbCallback): CInt =
    0

public actual fun system(s: String?): CInt =
    0

public actual fun getenv(s: String?): COpaquePointer? =
    null

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    null

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    null

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strcmp(cs: String?, ct: String?): CInt =
    0

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    0

public actual fun strcoll(cs: String?, ct: String?): CInt =
    0

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    null

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    null

public actual fun strspn(cs: String?, ct: String?): SizeT =
    0uL

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    0uL

public actual fun strdup(cs: String?): COpaquePointer? =
    null

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    null

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    null

public actual fun strlen(cs: String?): SizeT =
    0uL

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    0uL

public actual fun strerror(n: CInt): COpaquePointer? =
    null

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    null

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    0uL

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    0uL

public actual fun wcsnlen(str: COpaquePointer?, numberOfElements: SizeT): SizeT =
    0uL

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    0uL

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun abs(i: CInt): CInt =
    0

public actual fun labs(i: CLong): CLong =
    0L

public actual fun rand(): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    0uL

public actual fun raise(signum: CInt): CInt =
    0

public actual fun clock(): ClockT =
    0

public actual fun ctime(sourceTime: COpaquePointer?): COpaquePointer? =
    null

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    0.0

public actual fun gmtimeS(destTime: COpaquePointer?, srcTime: COpaquePointer?): CInt =
    0

public actual fun getDaylight(hours: COpaquePointer?): ErrnoT =
    0

public actual fun getDstbias(seconds: COpaquePointer?): ErrnoT =
    0

public actual fun getTimezone(seconds: COpaquePointer?): ErrnoT =
    0

public actual fun getTzname(pReturnValue: COpaquePointer?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    0

public actual fun localtimeS(tmDest: COpaquePointer?, sourceTime: COpaquePointer?): ErrnoT =
    0

public actual fun time(destTime: COpaquePointer?): TimeT =
    0L

public actual fun tzset() {
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    0

public actual fun wchmod(path: COpaquePointer?, mode: CInt): CInt =
    0

public actual fun mkdir(path: String?): CInt =
    0

public actual fun wrmdir(path: COpaquePointer?): CInt =
    0

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun wstat(path: COpaquePointer?, buf: COpaquePointer?): CInt =
    0

public actual fun wutime(file: COpaquePointer?, buf: COpaquePointer?): CInt =
    0

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun pclose(stream: FILE?): CInt =
    0

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    null

public actual fun fileno(stream: FILE?): CInt =
    0

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun wopen(path: COpaquePointer?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(path: String?, mode: CInt): CInt =
    0

public actual fun access(path: String?, amode: CInt): CInt =
    0

public actual fun chdir(dir: String?): CInt =
    0

public actual fun close(fd: CInt): CInt =
    0

public actual fun dup(fd: CInt): CInt =
    0

public actual fun dup2(src: CInt, dst: CInt): CInt =
    0

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
    0L

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    0

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun wexecv(prog: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    0L

public actual fun wexecve(prog: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    0L

public actual fun wexecvp(c: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    0L

public actual fun wexecvpe(c: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    0L

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    null

public actual fun getpid(): CInt =
    0

public actual fun isatty(fd: CInt): CInt =
    0

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    0L

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    0L

public actual fun pipe(fds: COpaquePointer?, psize: CUint, textmode: CInt): CInt =
    0

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    0

public actual fun rmdir(path: String?): CInt =
    0

public actual fun unlink(c: String?): CInt =
    0

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    0

public actual fun commit(fd: CInt): CInt =
    0

public actual fun getOsfhandle(fd: CInt): IntptrT =
    0L

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    0

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    null

public actual fun wsetlocale(category: CInt, locale: COpaquePointer?): COpaquePointer? =
    null

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    null

public actual fun alignedFree(ptr: COpaquePointer?) {
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    null

public actual fun putenv(envstring: String?): CInt =
    0

public actual fun wputenv(envstring: COpaquePointer?): CInt =
    0

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    0

public actual fun wputenvS(envstring: COpaquePointer?, valueString: COpaquePointer?): ErrnoT =
    0

public actual fun listen(s: Socket, backlog: CInt): CInt =
    0

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    0uL

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    0

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    0

public actual fun getpeername(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    0

public actual fun getsockname(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    0

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    0

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: COpaquePointer?, fromlen: COpaquePointer?): CInt =
    0

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: COpaquePointer?, tolen: CInt): CInt =
    0

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    0

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    0uL
