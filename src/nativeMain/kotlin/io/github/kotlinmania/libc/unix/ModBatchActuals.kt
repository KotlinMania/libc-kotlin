// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toLong
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toCPointer

public actual fun isalnum(c: CInt): CInt = libc.cinterop.libc_isalnum(c)
public actual fun isalpha(c: CInt): CInt = libc.cinterop.libc_isalpha(c)
public actual fun iscntrl(c: CInt): CInt = libc.cinterop.libc_iscntrl(c)
public actual fun isdigit(c: CInt): CInt = libc.cinterop.libc_isdigit(c)
public actual fun isgraph(c: CInt): CInt = libc.cinterop.libc_isgraph(c)
public actual fun islower(c: CInt): CInt = libc.cinterop.libc_islower(c)
public actual fun isprint(c: CInt): CInt = libc.cinterop.libc_isprint(c)
public actual fun ispunct(c: CInt): CInt = libc.cinterop.libc_ispunct(c)
public actual fun isspace(c: CInt): CInt = libc.cinterop.libc_isspace(c)
public actual fun isupper(c: CInt): CInt = libc.cinterop.libc_isupper(c)
public actual fun isxdigit(c: CInt): CInt = libc.cinterop.libc_isxdigit(c)
public actual fun isblank(c: CInt): CInt = libc.cinterop.libc_isblank(c)
public actual fun tolower(c: CInt): CInt = libc.cinterop.libc_tolower(c)
public actual fun toupper(c: CInt): CInt = libc.cinterop.libc_toupper(c)
public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen requires manual FFI bridge — type mismatch")
public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires manual FFI bridge — type mismatch")
public actual fun fflush(file: FILE?): CInt =
    libc.cinterop.libc_fflush(file?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fclose(file: FILE?): CInt =
    libc.cinterop.libc_fclose(file?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun remove(filename: String?): CInt =
    libc.cinterop.libc_remove(filename)
public actual fun rename(oldname: String?, newname: String?): CInt =
    libc.cinterop.libc_rename(oldname, newname)
public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires manual FFI bridge — type mismatch")
public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    libc.cinterop.libc_setvbuf(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), buffer, mode, size)
public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")
}

public actual fun getchar(): CInt = libc.cinterop.libc_getchar()
public actual fun putchar(c: CInt): CInt = libc.cinterop.libc_putchar(c)
public actual fun fgetc(stream: FILE?): CInt =
    libc.cinterop.libc_fgetc(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    libc.cinterop.libc_fputc(c, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fputs(s: String?, stream: FILE?): CInt =
    libc.cinterop.libc_fputs(s, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun puts(s: String?): CInt =
    libc.cinterop.libc_puts(s)
public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    libc.cinterop.libc_ungetc(c, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    libc.cinterop.libc_fwrite(ptr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), size, nobj, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    libc.cinterop.libc_fseek(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)
public actual fun ftell(stream: FILE?): CLong =
    libc.cinterop.libc_ftell(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind requires manual FFI bridge — not yet implemented")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun feof(stream: FILE?): CInt =
    libc.cinterop.libc_feof(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun ferror(stream: FILE?): CInt =
    libc.cinterop.libc_ferror(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun clearerr(stream: FILE?) {
    throw UnsupportedOperationException("clearerr requires manual FFI bridge — not yet implemented")
}

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror requires manual FFI bridge — not yet implemented")
}

public actual fun atoi(s: String?): CInt =
    libc.cinterop.libc_atoi(s)
public actual fun atol(s: String?): CLong =
    libc.cinterop.libc_atol(s)
public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires manual FFI bridge — type mismatch")
public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    libc.cinterop.libc_strtol(s, endp?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)
public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires manual FFI bridge — type mismatch")
public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires manual FFI bridge — type mismatch")
public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires manual FFI bridge — type mismatch")
public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free requires manual FFI bridge — not yet implemented")
}

public actual fun system(s: String?): CInt =
    libc.cinterop.libc_system(s)
public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires manual FFI bridge — type mismatch")
public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires manual FFI bridge — type mismatch")
public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires manual FFI bridge — type mismatch")
public actual fun stpcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("stpcpy requires manual FFI bridge — not yet implemented")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires manual FFI bridge — type mismatch")
public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires manual FFI bridge — type mismatch")
public actual fun strcmp(cs: String?, ct: String?): CInt =
    libc.cinterop.libc_strcmp(cs, ct)
public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    libc.cinterop.libc_strncmp(cs, ct, n)
public actual fun strcoll(cs: String?, ct: String?): CInt =
    libc.cinterop.libc_strcoll(cs, ct)
public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires manual FFI bridge — type mismatch")
public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires manual FFI bridge — type mismatch")
public actual fun strspn(cs: String?, ct: String?): ULong =
    libc.cinterop.libc_strspn(cs, ct)
public actual fun strcspn(cs: String?, ct: String?): ULong =
    libc.cinterop.libc_strcspn(cs, ct)
public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires manual FFI bridge — type mismatch")
public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup requires manual FFI bridge — not yet implemented")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires manual FFI bridge — type mismatch")
public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires manual FFI bridge — type mismatch")
public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    libc.cinterop.libc_strcasecmp(s1, s2)
public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    libc.cinterop.libc_strncasecmp(s1, s2, n)
public actual fun strlen(cs: String?): ULong =
    libc.cinterop.libc_strlen(cs)
public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    libc.cinterop.libc_strnlen(cs, maxlen)
public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror requires manual FFI bridge — type mismatch")
public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires manual FFI bridge — not yet implemented")

public actual fun strtokR(s: String?, t: String?, p: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR requires manual FFI bridge — not yet implemented")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    libc.cinterop.libc_strxfrm(s, ct, n)
public actual fun strsignal(sig: CInt): String? =
    throw UnsupportedOperationException("strsignal requires manual FFI bridge — not yet implemented")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen requires manual FFI bridge — not yet implemented")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires manual FFI bridge — type mismatch")
public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    libc.cinterop.libc_memcmp(cx?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ct?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), n)
public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires manual FFI bridge — type mismatch")
public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires manual FFI bridge — type mismatch")
public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires manual FFI bridge — type mismatch")
public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires manual FFI bridge — type mismatch")
public actual fun getpwnam(name: String?): Passwd? =
    libc.cinterop.libc_getpwnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwuid(uid: UidT): Passwd? =
    libc.cinterop.libc_getpwuid(uid.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt = libc.cinterop.libc_socket(domain, ty, protocol)
public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("connect requires manual FFI bridge — not yet implemented")

public actual fun listen(socket: CInt, backlog: CInt): CInt = libc.cinterop.libc_listen(socket, backlog)
public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept requires manual FFI bridge — not yet implemented")

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername requires manual FFI bridge — not yet implemented")

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname requires manual FFI bridge — not yet implemented")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt requires manual FFI bridge — not yet implemented")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    throw UnsupportedOperationException("socketpair requires manual FFI bridge — not yet implemented")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto requires manual FFI bridge — not yet implemented")

public actual fun shutdown(socket: CInt, how: CInt): CInt = libc.cinterop.libc_shutdown(socket, how)
public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod requires manual FFI bridge — type mismatch")
public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("fchmod requires manual FFI bridge — type mismatch")
public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    libc.cinterop.libc_mkdir(path, mode.toInt())
public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose requires manual FFI bridge — not yet implemented")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires manual FFI bridge — type mismatch")
public actual fun fileno(stream: FILE?): CInt =
    libc.cinterop.libc_fileno(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat requires manual FFI bridge — type mismatch")
public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun closedir(dirp: DIR?): CInt =
    libc.cinterop.libc_closedir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir requires manual FFI bridge — not yet implemented")
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchmodat requires manual FFI bridge — type mismatch")
public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("fchown requires manual FFI bridge — type mismatch")
public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchownat requires manual FFI bridge — not yet implemented")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat requires manual FFI bridge — not yet implemented")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    libc.cinterop.libc_linkat(olddirfd, oldpath, newdirfd, newpath, flags)
public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    libc.cinterop.libc_renameat(olddirfd, oldpath, newdirfd, newpath)
public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    libc.cinterop.libc_symlinkat(target, newdirfd, linkpath)
public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    libc.cinterop.libc_unlinkat(dirfd, pathname, flags)
public actual fun access(path: String?, amode: CInt): CInt =
    libc.cinterop.libc_access(path, amode)
public actual fun chdir(dir: String?): CInt =
    libc.cinterop.libc_chdir(dir)
public actual fun fchdir(dirfd: CInt): CInt = libc.cinterop.libc_fchdir(dirfd)
public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("chown requires manual FFI bridge — type mismatch")
public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("lchown requires manual FFI bridge — type mismatch")
public actual fun close(fd: CInt): CInt = libc.cinterop.libc_close(fd)
public actual fun dup(fd: CInt): CInt = libc.cinterop.libc_dup(fd)
public actual fun dup2(src: CInt, dst: CInt): CInt = libc.cinterop.libc_dup2(src, dst)
public actual fun execl(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execl requires manual FFI bridge — not yet implemented")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execle requires manual FFI bridge — not yet implemented")

public actual fun execlp(file: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execlp requires manual FFI bridge — not yet implemented")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    libc.cinterop.libc_execv(prog, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc.cinterop.libc_execve(prog, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), envp?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    libc.cinterop.libc_execvp(c, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fork(): PidT =
    libc.cinterop.libc_fork()
public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libc.cinterop.libc_fpathconf(filedes, name)
public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

public actual fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt =
    throw UnsupportedOperationException("getgroups requires manual FFI bridge — not yet implemented")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin requires manual FFI bridge — type mismatch")
public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun getpgid(pid: PidT): PidT =
    libc.cinterop.libc_getpgid(pid)
public actual fun getpgrp(): PidT =
    libc.cinterop.libc_getpgrp()
public actual fun getpid(): PidT =
    libc.cinterop.libc_getpid()
public actual fun getppid(): PidT =
    libc.cinterop.libc_getppid()
public actual fun isatty(fd: CInt): CInt = libc.cinterop.libc_isatty(fd)
public actual fun link(src: String?, dst: String?): CInt =
    libc.cinterop.libc_link(src, dst)
public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc.cinterop.libc_lseek(fd, offset, whence)
public actual fun pathconf(path: String?, name: CInt): CLong =
    libc.cinterop.libc_pathconf(path, name)
public actual fun pipe(fds: CInt?): CInt =
    throw UnsupportedOperationException("pipe requires manual FFI bridge — not yet implemented")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign requires manual FFI bridge — not yet implemented")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires manual FFI bridge — not yet implemented")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    libc.cinterop.libc_read(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count)
public actual fun rmdir(path: String?): CInt =
    libc.cinterop.libc_rmdir(path)
public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("seteuid requires manual FFI bridge — type mismatch")
public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("setegid requires manual FFI bridge — type mismatch")
public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setgid requires manual FFI bridge — type mismatch")
public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    libc.cinterop.libc_setpgid(pid, pgid)
public actual fun setsid(): PidT =
    libc.cinterop.libc_setsid()
public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setuid requires manual FFI bridge — type mismatch")
public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    throw UnsupportedOperationException("setreuid requires manual FFI bridge — type mismatch")
public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    throw UnsupportedOperationException("setregid requires manual FFI bridge — type mismatch")
public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires manual FFI bridge — not yet implemented")

public actual fun tcgetpgrp(fd: CInt): PidT =
    libc.cinterop.libc_tcgetpgrp(fd)
public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    libc.cinterop.libc_tcsetpgrp(fd, pgrp)
public actual fun ttyname(fd: CInt): String? =
    throw UnsupportedOperationException("ttyname requires manual FFI bridge — type mismatch")
public actual fun ttynameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ttynameR requires manual FFI bridge — not yet implemented")

public actual fun unlink(c: String?): CInt =
    libc.cinterop.libc_unlink(c)
public actual fun wait(status: CInt?): PidT =
    throw UnsupportedOperationException("wait requires manual FFI bridge — not yet implemented")

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    throw UnsupportedOperationException("waitpid requires manual FFI bridge — not yet implemented")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write requires manual FFI bridge — UInt/ULong type mismatch")
public actual fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    libc.cinterop.libc_pread(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count, offset)
public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    libc.cinterop.libc_pwrite(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count, offset)
public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("utime requires manual FFI bridge — not yet implemented")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    libc.cinterop.libc_kill(pid, sig)
public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    libc.cinterop.libc_killpg(pgrp, sig)
public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    libc.cinterop.libc_mlock(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    libc.cinterop.libc_munlock(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun mlockall(flags: CInt): CInt = libc.cinterop.libc_mlockall(flags)
public actual fun munlockall(): CInt = libc.cinterop.libc_munlockall()
public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    libc.cinterop.libc_munmap(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun ifIndextoname(ifindex: CUInt, ifname: String?): String? =
    throw UnsupportedOperationException("ifIndextoname requires manual FFI bridge — not yet implemented")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun fsync(fd: CInt): CInt = libc.cinterop.libc_fsync(fd)
public actual fun setenv(name: String?, `val`: String?, overwrite: CInt): CInt =
    libc.cinterop.libc_setenv(name, `val`, overwrite)
public actual fun unsetenv(name: String?): CInt =
    libc.cinterop.libc_unsetenv(name)
public actual fun symlink(path1: String?, path2: String?): CInt =
    libc.cinterop.libc_symlink(path1, path2)
public actual fun truncate(path: String?, length: OffT): CInt =
    libc.cinterop.libc_truncate(path, length)
public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc.cinterop.libc_ftruncate(fd, length)
public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    throw UnsupportedOperationException("getrusage requires manual FFI bridge — not yet implemented")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath requires manual FFI bridge — not yet implemented")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times requires manual FFI bridge — not yet implemented")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    libc.cinterop.libc_pthread_getspecific(key.toULong())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    libc.cinterop.libc_pthread_setspecific(key.toULong(), value?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadMutexInit(lock: PthreadMutexT, attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: PthreadCondT, attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: PthreadCondT, lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: PthreadCondT, lock: PthreadMutexT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT, attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt requires manual FFI bridge — not yet implemented")

public actual fun raise(signum: CInt): CInt = libc.cinterop.libc_raise(signum)
public actual fun utimes(filename: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("utimes requires manual FFI bridge — not yet implemented")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires manual FFI bridge — not yet implemented")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror requires manual FFI bridge — type mismatch")
public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires manual FFI bridge — not yet implemented")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    libc.cinterop.libc_dlclose(handle?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun freeaddrinfo(res: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo requires manual FFI bridge — not yet implemented")
}

public actual fun hstrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("hstrerror requires manual FFI bridge — not yet implemented")

public actual fun gaiStrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror requires manual FFI bridge — not yet implemented")

public actual fun resInit(): CInt =
    throw UnsupportedOperationException("resInit requires manual FFI bridge — not yet implemented")

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun time(time: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun gmtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun localtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm requires manual FFI bridge — not yet implemented")

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknod requires manual FFI bridge — not yet implemented")

public actual fun gethostname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_gethostname(name, len)
public actual fun endservent() {
    throw UnsupportedOperationException("endservent requires manual FFI bridge — not yet implemented")
}

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires manual FFI bridge — not yet implemented")

public actual fun getservbyport(port: CInt, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyport requires manual FFI bridge — not yet implemented")

public actual fun getservent(): Servent? =
    throw UnsupportedOperationException("getservent requires manual FFI bridge — not yet implemented")

public actual fun setservent(stayopen: CInt) {
    throw UnsupportedOperationException("setservent requires manual FFI bridge — not yet implemented")
}

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires manual FFI bridge — not yet implemented")

public actual fun getprotobynumber(proto: CInt): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires manual FFI bridge — not yet implemented")

public actual fun chroot(name: String?): CInt =
    libc.cinterop.libc_chroot(name)
public actual fun usleep(secs: UsecondsT): CInt =
    libc.cinterop.libc_usleep(secs)
public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send requires manual FFI bridge — not yet implemented")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv requires manual FFI bridge — not yet implemented")

public actual fun putenv(string: String?): CInt =
    throw UnsupportedOperationException("putenv requires manual FFI bridge — not yet implemented")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll requires manual FFI bridge — not yet implemented")

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    throw UnsupportedOperationException("select requires manual FFI bridge — not yet implemented")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires manual FFI bridge — type mismatch")
public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun semWait(sem: SemT): CInt =
    throw UnsupportedOperationException("semWait requires manual FFI bridge — not yet implemented")

public actual fun semTrywait(sem: SemT): CInt =
    throw UnsupportedOperationException("semTrywait requires manual FFI bridge — not yet implemented")

public actual fun semPost(sem: SemT): CInt =
    throw UnsupportedOperationException("semPost requires manual FFI bridge — not yet implemented")

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("statvfs requires manual FFI bridge — not yet implemented")

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("fstatvfs requires manual FFI bridge — not yet implemented")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset requires manual FFI bridge — not yet implemented")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset requires manual FFI bridge — not yet implemented")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset requires manual FFI bridge — not yet implemented")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset requires manual FFI bridge — not yet implemented")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember requires manual FFI bridge — not yet implemented")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask requires manual FFI bridge — not yet implemented")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending requires manual FFI bridge — not yet implemented")

public actual fun sysconf(name: CInt): CLong =
    libc.cinterop.libc_sysconf(name)
public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifo requires manual FFI bridge — type mismatch")
public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    libc.cinterop.libc_fseeko(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)
public actual fun ftello(stream: FILE?): OffT =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun tcdrain(fd: CInt): CInt =
    libc.cinterop.libc_tcdrain(fd)
public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetispeed requires manual FFI bridge — not yet implemented")

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetospeed requires manual FFI bridge — not yet implemented")

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcgetattr requires manual FFI bridge — not yet implemented")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcsetattr requires manual FFI bridge — not yet implemented")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    libc.cinterop.libc_tcflow(fd, action)
public actual fun tcflush(fd: CInt, action: CInt): CInt = libc.cinterop.libc_tcflush(fd, action)
public actual fun tcgetsid(fd: CInt): PidT =
    libc.cinterop.libc_tcgetsid(fd)
public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt = libc.cinterop.libc_tcsendbreak(fd, duration)
public actual fun mkstemp(template: String?): CInt =
    libc.cinterop.libc_mkstemp(template)
public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires manual FFI bridge — not yet implemented")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam requires manual FFI bridge — not yet implemented")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    throw UnsupportedOperationException("openlog requires manual FFI bridge — not yet implemented")
}

public actual fun closelog() {
    throw UnsupportedOperationException("closelog requires manual FFI bridge — not yet implemented")
}

public actual fun setlogmask(maskpri: CInt): CInt = libc.cinterop.libc_setlogmask(maskpri)
public actual fun syslog(priority: CInt, message: String?, vararg args: Any?) {
    throw UnsupportedOperationException("syslog requires manual FFI bridge — not yet implemented")
}

public actual fun nice(incr: CInt): CInt =
    libc.cinterop.libc_nice(incr)
public actual fun grantpt(fd: CInt): CInt =
    libc.cinterop.libc_grantpt(fd)
public actual fun posixOpenpt(flags: CInt): CInt =
    throw UnsupportedOperationException("posixOpenpt requires manual FFI bridge — not yet implemented")

public actual fun ptsname(fd: CInt): String? =
    throw UnsupportedOperationException("ptsname requires manual FFI bridge — not yet implemented")

public actual fun unlockpt(fd: CInt): CInt =
    libc.cinterop.libc_unlockpt(fd)
public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr requires manual FFI bridge — not yet implemented")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline requires manual FFI bridge — not yet implemented")

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    libc.cinterop.libc_lockf(fd, cmd, len)
public actual fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt =
    throw UnsupportedOperationException("adjtime requires manual FFI bridge — not yet implemented")

public actual fun stpncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("stpncpy requires manual FFI bridge — not yet implemented")


public actual fun confstr(name: CInt, buf: String?, len: ULong): ULong =
    libc.cinterop.libc_confstr(name, buf, len)
public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    throw UnsupportedOperationException("dladdr requires manual FFI bridge — not yet implemented")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    libc.cinterop.libc_flock(fd, operation)
public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openWmemstream requires manual FFI bridge — not yet implemented")

public actual fun getsid(pid: PidT): PidT =
    libc.cinterop.libc_getsid(pid)
public actual fun pause(): CInt = libc.cinterop.libc_pause()
public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdirat requires manual FFI bridge — type mismatch")
public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat requires manual FFI bridge — not yet implemented")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fdopendir requires manual FFI bridge — not yet implemented")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR requires manual FFI bridge — not yet implemented")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): CInt =
    throw UnsupportedOperationException("readlinkat requires manual FFI bridge — type mismatch")
public actual fun readlink(path: String?, buf: String?, bufsz: ULong): CInt =
    throw UnsupportedOperationException("readlink requires manual FFI bridge — type mismatch")
public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("pselect requires manual FFI bridge — not yet implemented")

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction requires manual FFI bridge — not yet implemented")

public actual fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE? =
    throw UnsupportedOperationException("fmemopen requires manual FFI bridge — not yet implemented")

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openMemstream requires manual FFI bridge — not yet implemented")

public actual fun cfmakeraw(termios: Termios?): CInt =
    throw UnsupportedOperationException("cfmakeraw requires manual FFI bridge — not yet implemented")

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetspeed requires manual FFI bridge — not yet implemented")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fnmatch requires manual FFI bridge — not yet implemented")

public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")

public actual fun atexit(cb: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("sigqueue requires manual FFI bridge for ambiguous type")
