package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr): CInt
}

public fun interface QsortSComparCallback {
    public operator fun invoke(arg0: MutPtr, arg1: ConstPtr, arg2: ConstPtr): CInt
}

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

// Special handling for all print and scan type functions because of https://github.com/rust-lang/libc/issues/2860
public expect fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

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

public expect fun qsort(base: MutPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?)

public expect fun qsortS(base: MutPtr, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: MutPtr)

public expect fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr

public expect fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr

public expect fun fflush(file: MutPtr): CInt

public expect fun fclose(file: MutPtr): CInt

public expect fun remove(filename: ConstPtr): CInt

public expect fun rename(oldname: ConstPtr, newname: ConstPtr): CInt

public expect fun tmpfile(): MutPtr

public expect fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr, buf: MutPtr)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: MutPtr): CInt

public expect fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr

public expect fun fputc(c: CInt, stream: MutPtr): CInt

public expect fun fputs(s: ConstPtr, stream: MutPtr): CInt

public expect fun puts(s: ConstPtr): CInt

public expect fun ungetc(c: CInt, stream: MutPtr): CInt

public expect fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: MutPtr): CLong

public expect fun rewind(stream: MutPtr)

public expect fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt

public expect fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt

public expect fun feof(stream: MutPtr): CInt

public expect fun ferror(stream: MutPtr): CInt

public expect fun perror(s: ConstPtr)

public expect fun atof(s: ConstPtr): CDouble

public expect fun atoi(s: ConstPtr): CInt

public expect fun atol(s: ConstPtr): CLong

public expect fun atoll(s: ConstPtr): CLonglong

public expect fun strtod(s: ConstPtr, endp: MutPtr): CDouble

public expect fun strtof(s: ConstPtr, endp: MutPtr): CFloat

public expect fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong

public expect fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong

public expect fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong

public expect fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong

public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr

public expect fun malloc(size: SizeT): MutPtr

public expect fun msize(p: MutPtr): SizeT

public expect fun realloc(p: MutPtr, size: SizeT): MutPtr

public expect fun free(p: MutPtr)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun system(s: ConstPtr): CInt

public expect fun getenv(s: ConstPtr): MutPtr

public expect fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun strcat(s: MutPtr, ct: ConstPtr): MutPtr

public expect fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr

public expect fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt

public expect fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt

public expect fun strchr(cs: ConstPtr, c: CInt): MutPtr

public expect fun strrchr(cs: ConstPtr, c: CInt): MutPtr

public expect fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT

public expect fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT

public expect fun strdup(cs: ConstPtr): MutPtr

public expect fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strlen(cs: ConstPtr): SizeT

public expect fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr

public expect fun strtok(s: MutPtr, t: ConstPtr): MutPtr

public expect fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT

public expect fun wcslen(buf: ConstPtr): SizeT

public expect fun wcsnlen(str: ConstPtr, numberOfElements: SizeT): SizeT

public expect fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun raise(signum: CInt): CInt

public expect fun clock(): ClockT

public expect fun ctime(sourceTime: ConstPtr): MutPtr

public expect fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble

public expect fun gmtimeS(destTime: MutPtr, srcTime: ConstPtr): CInt

public expect fun getDaylight(hours: MutPtr): ErrnoT

public expect fun getDstbias(seconds: MutPtr): ErrnoT

public expect fun getTimezone(seconds: MutPtr): ErrnoT

public expect fun getTzname(pReturnValue: MutPtr, timeZoneName: MutPtr, sizeInBytes: SizeT, index: CInt): ErrnoT

public expect fun localtimeS(tmDest: MutPtr, sourceTime: ConstPtr): ErrnoT

public expect fun time(destTime: MutPtr): TimeT

public expect fun tzset()

public expect fun chmod(path: ConstPtr, mode: CInt): CInt

public expect fun wchmod(path: ConstPtr, mode: CInt): CInt

public expect fun mkdir(path: ConstPtr): CInt

public expect fun wrmdir(path: ConstPtr): CInt

public expect fun fstat(fildes: CInt, buf: MutPtr): CInt

public expect fun stat(path: ConstPtr, buf: MutPtr): CInt

public expect fun wstat(path: ConstPtr, buf: MutPtr): CInt

public expect fun wutime(file: ConstPtr, buf: MutPtr): CInt

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun pclose(stream: MutPtr): CInt

public expect fun fdopen(fd: CInt, mode: ConstPtr): MutPtr

public expect fun fileno(stream: MutPtr): CInt

public expect fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun wopen(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: ConstPtr, mode: CInt): CInt

public expect fun access(path: ConstPtr, amode: CInt): CInt

public expect fun chdir(dir: ConstPtr): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): IntptrT

public expect fun wexecl(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): IntptrT

public expect fun execle(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): IntptrT

public expect fun wexecle(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): IntptrT

public expect fun execlp(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): IntptrT

public expect fun wexeclp(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): IntptrT

public expect fun execlpe(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): IntptrT

public expect fun wexeclpe(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): IntptrT

// DIFF(main): changed to `intptrT` in e77f551de9
public expect fun execv(prog: ConstPtr, argv: ConstPtr): IntptrT

public expect fun execve(prog: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun execvp(c: ConstPtr, argv: ConstPtr): CInt

public expect fun execvpe(c: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun wexecv(prog: ConstPtr, argv: ConstPtr): IntptrT

public expect fun wexecve(prog: ConstPtr, argv: ConstPtr, envp: ConstPtr): IntptrT

public expect fun wexecvp(c: ConstPtr, argv: ConstPtr): IntptrT

public expect fun wexecvpe(c: ConstPtr, argv: ConstPtr, envp: ConstPtr): IntptrT

public expect fun getcwd(buf: MutPtr, size: CInt): MutPtr

public expect fun getpid(): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong

public expect fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong

public expect fun pipe(fds: MutPtr, psize: CUint, textmode: CInt): CInt

public expect fun read(fd: CInt, buf: MutPtr, count: CUint): CInt

public expect fun rmdir(path: ConstPtr): CInt

public expect fun unlink(c: ConstPtr): CInt

public expect fun write(fd: CInt, buf: ConstPtr, count: CUint): CInt

public expect fun commit(fd: CInt): CInt

public expect fun getOsfhandle(fd: CInt): IntptrT

public expect fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr): MutPtr

public expect fun wsetlocale(category: CInt, locale: ConstPtr): MutPtr

public expect fun alignedMalloc(size: SizeT, alignment: SizeT): MutPtr

public expect fun alignedFree(ptr: MutPtr)

public expect fun alignedRealloc(memblock: MutPtr, size: SizeT, alignment: SizeT): MutPtr

public expect fun putenv(envstring: ConstPtr): CInt

public expect fun wputenv(envstring: ConstPtr): CInt

public expect fun putenvS(envstring: ConstPtr, valueString: ConstPtr): ErrnoT

public expect fun wputenvS(envstring: ConstPtr, valueString: ConstPtr): ErrnoT

public expect fun listen(s: Socket, backlog: CInt): CInt

public expect fun accept(s: Socket, addr: MutPtr, addrlen: MutPtr): Socket

public expect fun bind(s: Socket, name: ConstPtr, namelen: CInt): CInt

public expect fun connect(s: Socket, name: ConstPtr, namelen: CInt): CInt

public expect fun getpeername(s: Socket, name: MutPtr, nameln: MutPtr): CInt

public expect fun getsockname(s: Socket, name: MutPtr, nameln: MutPtr): CInt

public expect fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt

public expect fun recvfrom(s: Socket, buf: MutPtr, len: CInt, flags: CInt, from: MutPtr, fromlen: MutPtr): CInt

public expect fun sendto(s: Socket, buf: ConstPtr, len: CInt, flags: CInt, to: ConstPtr, tolen: CInt): CInt

public expect fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: ConstPtr, optlen: CInt): CInt

public expect fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket
