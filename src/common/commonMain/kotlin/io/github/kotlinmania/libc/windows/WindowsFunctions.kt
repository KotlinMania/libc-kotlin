package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>): CInt
}

public fun interface QsortSComparCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>, arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>): CInt
}

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

// Special handling for all print and scan type functions because of https://github.com/rust-lang/libc/issues/2860
public expect fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

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

public expect fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?)

public expect fun qsortS(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: MutPtr<CVoid>)

public expect fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE>

public expect fun fflush(file: MutPtr<FILE>): CInt

public expect fun fclose(file: MutPtr<FILE>): CInt

public expect fun remove(filename: ConstPtr<CChar>): CInt

public expect fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt

public expect fun tmpfile(): MutPtr<FILE>

public expect fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: MutPtr<FILE>): CInt

public expect fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar>

public expect fun fputc(c: CInt, stream: MutPtr<FILE>): CInt

public expect fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt

public expect fun puts(s: ConstPtr<CChar>): CInt

public expect fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt

public expect fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: MutPtr<FILE>): CLong

public expect fun rewind(stream: MutPtr<FILE>)

public expect fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt

public expect fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt

public expect fun feof(stream: MutPtr<FILE>): CInt

public expect fun ferror(stream: MutPtr<FILE>): CInt

public expect fun perror(s: ConstPtr<CChar>)

public expect fun atof(s: ConstPtr<CChar>): CDouble

public expect fun atoi(s: ConstPtr<CChar>): CInt

public expect fun atol(s: ConstPtr<CChar>): CLong

public expect fun atoll(s: ConstPtr<CChar>): CLonglong

public expect fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble

public expect fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat

public expect fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong

public expect fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong

public expect fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong

public expect fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong

public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun malloc(size: SizeT): MutPtr<CVoid>

public expect fun msize(p: MutPtr<CVoid>): SizeT

public expect fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid>

public expect fun free(p: MutPtr<CVoid>)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun system(s: ConstPtr<CChar>): CInt

public expect fun getenv(s: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt

public expect fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt

public expect fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt

public expect fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT

public expect fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT

public expect fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strlen(cs: ConstPtr<CChar>): SizeT

public expect fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr<CChar>

public expect fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun wcslen(buf: ConstPtr<WcharT>): SizeT

public expect fun wcsnlen(str: ConstPtr<WcharT>, numberOfElements: SizeT): SizeT

public expect fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun raise(signum: CInt): CInt

public expect fun clock(): ClockT

public expect fun ctime(sourceTime: ConstPtr<TimeT>): MutPtr<CChar>

public expect fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble

public expect fun gmtimeS(destTime: MutPtr<Tm>, srcTime: ConstPtr<TimeT>): CInt

public expect fun getDaylight(hours: MutPtr<CInt>): ErrnoT

public expect fun getDstbias(seconds: MutPtr<CLong>): ErrnoT

public expect fun getTimezone(seconds: MutPtr<CLong>): ErrnoT

public expect fun getTzname(pReturnValue: MutPtr<SizeT>, timeZoneName: MutPtr<CChar>, sizeInBytes: SizeT, index: CInt): ErrnoT

public expect fun localtimeS(tmDest: MutPtr<Tm>, sourceTime: ConstPtr<TimeT>): ErrnoT

public expect fun time(destTime: MutPtr<TimeT>): TimeT

public expect fun tzset()

public expect fun chmod(path: ConstPtr<CChar>, mode: CInt): CInt

public expect fun wchmod(path: ConstPtr<WcharT>, mode: CInt): CInt

public expect fun mkdir(path: ConstPtr<CChar>): CInt

public expect fun wrmdir(path: ConstPtr<WcharT>): CInt

public expect fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt

public expect fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

public expect fun wstat(path: ConstPtr<WcharT>, buf: MutPtr<Stat>): CInt

public expect fun wutime(file: ConstPtr<WcharT>, buf: MutPtr<Utimbuf>): CInt

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun pclose(stream: MutPtr<FILE>): CInt

public expect fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun fileno(stream: MutPtr<FILE>): CInt

public expect fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun wopen(path: ConstPtr<WcharT>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: ConstPtr<CChar>, mode: CInt): CInt

public expect fun access(path: ConstPtr<CChar>, amode: CInt): CInt

public expect fun chdir(dir: ConstPtr<CChar>): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT

public expect fun wexecl(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT

public expect fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT

public expect fun wexecle(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT

public expect fun execlp(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT

public expect fun wexeclp(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT

public expect fun execlpe(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT

public expect fun wexeclpe(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT

// DIFF(main): changed to `intptrT` in e77f551de9
public expect fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): IntptrT

public expect fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun execvpe(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun wexecv(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT

public expect fun wexecve(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT

public expect fun wexecvp(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT

public expect fun wexecvpe(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT

public expect fun getcwd(buf: MutPtr<CChar>, size: CInt): MutPtr<CChar>

public expect fun getpid(): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong

public expect fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong

public expect fun pipe(fds: MutPtr<CInt>, psize: CUint, textmode: CInt): CInt

public expect fun read(fd: CInt, buf: MutPtr<CVoid>, count: CUint): CInt

public expect fun rmdir(path: ConstPtr<CChar>): CInt

public expect fun unlink(c: ConstPtr<CChar>): CInt

public expect fun write(fd: CInt, buf: ConstPtr<CVoid>, count: CUint): CInt

public expect fun commit(fd: CInt): CInt

public expect fun getOsfhandle(fd: CInt): IntptrT

public expect fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar>

public expect fun wsetlocale(category: CInt, locale: ConstPtr<WcharT>): MutPtr<WcharT>

public expect fun alignedMalloc(size: SizeT, alignment: SizeT): MutPtr<CVoid>

public expect fun alignedFree(ptr: MutPtr<CVoid>)

public expect fun alignedRealloc(memblock: MutPtr<CVoid>, size: SizeT, alignment: SizeT): MutPtr<CVoid>

public expect fun putenv(envstring: ConstPtr<CChar>): CInt

public expect fun wputenv(envstring: ConstPtr<WcharT>): CInt

public expect fun putenvS(envstring: ConstPtr<CChar>, valueString: ConstPtr<CChar>): ErrnoT

public expect fun wputenvS(envstring: ConstPtr<WcharT>, valueString: ConstPtr<WcharT>): ErrnoT

public expect fun listen(s: Socket, backlog: CInt): CInt

public expect fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<CInt>): Socket

public expect fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt

public expect fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt

public expect fun getpeername(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt

public expect fun getsockname(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt

public expect fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: MutPtr<CChar>, optlen: MutPtr<CInt>): CInt

public expect fun recvfrom(s: Socket, buf: MutPtr<CChar>, len: CInt, flags: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<CInt>): CInt

public expect fun sendto(s: Socket, buf: ConstPtr<CChar>, len: CInt, flags: CInt, to: ConstPtr<Sockaddr>, tolen: CInt): CInt

public expect fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: ConstPtr<CChar>, optlen: CInt): CInt

public expect fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket
