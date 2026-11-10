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

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public fun interface QsortSComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

// Special handling for all print and scan type functions because of https://github.com/rust-lang/libc/issues/2860
public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun isalnum(c: CInt): CInt

public expect fun isalpha(c: CInt): CInt

public expect fun iscntrl(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun isgraph(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun ispunct(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun isupper(c: CInt): CInt

public expect fun isxdigit(c: CInt): CInt

public expect fun isblank(c: CInt): CInt

public expect fun tolower(c: CInt): CInt

public expect fun toupper(c: CInt): CInt

public expect fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?)

public expect fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?)

public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fflush(file: FILE?): CInt

public expect fun fclose(file: FILE?): CInt

public expect fun remove(filename: String?): CInt

public expect fun rename(oldname: String?, newname: String?): CInt

public expect fun tmpfile(): FILE?

public expect fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: FILE?, buf: COpaquePointer?)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: FILE?): CInt

public expect fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer?

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun puts(s: String?): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: FILE?): CLong

public expect fun rewind(stream: FILE?)

public expect fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun feof(stream: FILE?): CInt

public expect fun ferror(stream: FILE?): CInt

public expect fun perror(s: String?)

public expect fun atof(s: String?): CDouble

public expect fun atoi(s: String?): CInt

public expect fun atol(s: String?): CLong

public expect fun atoll(s: String?): CLonglong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong

public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun msize(p: COpaquePointer?): SizeT

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): COpaquePointer?

public expect fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer?

public expect fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer?

public expect fun strcmp(cs: String?, ct: String?): CInt

public expect fun strncmp(cs: String?, ct: String?, n: SizeT): CInt

public expect fun strcoll(cs: String?, ct: String?): CInt

public expect fun strchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strrchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strspn(cs: String?, ct: String?): SizeT

public expect fun strcspn(cs: String?, ct: String?): SizeT

public expect fun strdup(cs: String?): COpaquePointer?

public expect fun strpbrk(cs: String?, ct: String?): COpaquePointer?

public expect fun strstr(cs: String?, ct: String?): COpaquePointer?

public expect fun strlen(cs: String?): SizeT

public expect fun strnlen(cs: String?, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, t: String?): COpaquePointer?

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT

public expect fun wcslen(buf: COpaquePointer?): SizeT

public expect fun wcsnlen(str: COpaquePointer?, numberOfElements: SizeT): SizeT

public expect fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun raise(signum: CInt): CInt

public expect fun clock(): ClockT

public expect fun ctime(sourceTime: COpaquePointer?): COpaquePointer?

public expect fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble

public expect fun gmtimeS(destTime: COpaquePointer?, srcTime: COpaquePointer?): CInt

public expect fun getDaylight(hours: COpaquePointer?): ErrnoT

public expect fun getDstbias(seconds: COpaquePointer?): ErrnoT

public expect fun getTimezone(seconds: COpaquePointer?): ErrnoT

public expect fun getTzname(pReturnValue: COpaquePointer?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT

public expect fun localtimeS(tmDest: COpaquePointer?, sourceTime: COpaquePointer?): ErrnoT

public expect fun time(destTime: COpaquePointer?): TimeT

public expect fun tzset()

public expect fun chmod(path: String?, mode: CInt): CInt

public expect fun wchmod(path: COpaquePointer?, mode: CInt): CInt

public expect fun mkdir(path: String?): CInt

public expect fun wrmdir(path: COpaquePointer?): CInt

public expect fun fstat(fildes: CInt, buf: COpaquePointer?): CInt

public expect fun stat(path: String?, buf: COpaquePointer?): CInt

public expect fun wstat(path: COpaquePointer?, buf: COpaquePointer?): CInt

public expect fun wutime(file: COpaquePointer?, buf: COpaquePointer?): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun pclose(stream: FILE?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun wopen(path: COpaquePointer?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: String?, mode: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun chdir(dir: String?): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT

public expect fun wexecl(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT

public expect fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT

public expect fun wexecle(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT

public expect fun execlp(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT

public expect fun wexeclp(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT

public expect fun execlpe(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT

public expect fun wexeclpe(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT

// DIFF(main): changed to `intptrT` in e77f551de9
public expect fun execv(prog: String?, argv: COpaquePointer?): IntptrT

public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun execvp(c: String?, argv: COpaquePointer?): CInt

public expect fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun wexecv(prog: COpaquePointer?, argv: COpaquePointer?): IntptrT

public expect fun wexecve(prog: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT

public expect fun wexecvp(c: COpaquePointer?, argv: COpaquePointer?): IntptrT

public expect fun wexecvpe(c: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT

public expect fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer?

public expect fun getpid(): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong

public expect fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong

public expect fun pipe(fds: COpaquePointer?, psize: CUint, textmode: CInt): CInt

public expect fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt

public expect fun rmdir(path: String?): CInt

public expect fun unlink(c: String?): CInt

public expect fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt

public expect fun commit(fd: CInt): CInt

public expect fun getOsfhandle(fd: CInt): IntptrT

public expect fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun wsetlocale(category: CInt, locale: COpaquePointer?): COpaquePointer?

public expect fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer?

public expect fun alignedFree(ptr: COpaquePointer?)

public expect fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer?

public expect fun putenv(envstring: String?): CInt

public expect fun wputenv(envstring: COpaquePointer?): CInt

public expect fun putenvS(envstring: String?, valueString: String?): ErrnoT

public expect fun wputenvS(envstring: COpaquePointer?, valueString: COpaquePointer?): ErrnoT

public expect fun listen(s: Socket, backlog: CInt): CInt

public expect fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket

public expect fun bind(s: Socket, name: COpaquePointer?, namelen: CInt): CInt

public expect fun connect(s: Socket, name: COpaquePointer?, namelen: CInt): CInt

public expect fun getpeername(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt

public expect fun getsockname(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt

public expect fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt

public expect fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: COpaquePointer?, fromlen: COpaquePointer?): CInt

public expect fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: COpaquePointer?, tolen: CInt): CInt

public expect fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt

public expect fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket
