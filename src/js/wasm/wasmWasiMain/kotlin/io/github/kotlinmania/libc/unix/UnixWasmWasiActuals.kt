@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

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
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = In6Addr()

public actual val IN6ADDR_ANY: In6Addr
    get() = In6Addr()

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

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?): COpaquePointer? =
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

public actual fun clearerr(stream: FILE?): Unit =
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

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun free(p: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abort(): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exit(status: CInt): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getenv(s: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
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

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strlen(cs: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerror(n: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strsignal(sig: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpwnam(name: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rewinddir(dirp: DIR?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alarm(seconds: CUint): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fchdir(dirfd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fork(): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getegid(): GidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun geteuid(): UidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgid(): GidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getlogin(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpgid(pid: PidT): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpgrp(): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getppid(): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getuid(): UidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pipe(fds: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setsid(): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sleep(secs: CUint): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcgetpgrp(fd: CInt): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ttyname(fd: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wait(status: COpaquePointer?): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun umask(mask: ModeT): ModeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mlockall(flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun munlockall(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ifNametoindex(ifname: String?): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun times(buf: COpaquePointer?): ClockT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlerror(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeaddrinfo(res: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hstrerror(errcode: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resInit(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mktime(tm: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun time(time: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timegm(tm: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endservent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getservbyport(port: CInt, proto: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getservent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setservent(stayopen: CInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getprotobyname(name: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chroot(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun usleep(secs: UsecondsT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putenv(string: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localeconv(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semWait(sem: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semPost(sem: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigfillset(set: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigpending(set: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcdrain(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcgetsid(fd: CInt): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkstemp(template: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closelog(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setlogmask(maskpri: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nice(incr: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun grantpt(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixOpenpt(flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ptsname(fd: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unlockpt(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun adjtime(delta: COpaquePointer?, olddelta: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getsid(pid: PidT): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atexit(cb: AtexitCbCallback): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
