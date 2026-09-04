// port-lint: source fuchsia/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires manual FFI bridge — not yet implemented")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")
}

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires manual FFI bridge — not yet implemented")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum requires manual FFI bridge — not yet implemented")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha requires manual FFI bridge — not yet implemented")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl requires manual FFI bridge — not yet implemented")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit requires manual FFI bridge — not yet implemented")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph requires manual FFI bridge — not yet implemented")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower requires manual FFI bridge — not yet implemented")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint requires manual FFI bridge — not yet implemented")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct requires manual FFI bridge — not yet implemented")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace requires manual FFI bridge — not yet implemented")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper requires manual FFI bridge — not yet implemented")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit requires manual FFI bridge — not yet implemented")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank requires manual FFI bridge — not yet implemented")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower requires manual FFI bridge — not yet implemented")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper requires manual FFI bridge — not yet implemented")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen requires manual FFI bridge — not yet implemented")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires manual FFI bridge — not yet implemented")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires manual FFI bridge — not yet implemented")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires manual FFI bridge — not yet implemented")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove requires manual FFI bridge — not yet implemented")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename requires manual FFI bridge — not yet implemented")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires manual FFI bridge — not yet implemented")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires manual FFI bridge — not yet implemented")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")
}

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar requires manual FFI bridge — not yet implemented")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar requires manual FFI bridge — not yet implemented")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires manual FFI bridge — not yet implemented")

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires manual FFI bridge — not yet implemented")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires manual FFI bridge — not yet implemented")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts requires manual FFI bridge — not yet implemented")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires manual FFI bridge — not yet implemented")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires manual FFI bridge — not yet implemented")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek requires manual FFI bridge — not yet implemented")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell requires manual FFI bridge — not yet implemented")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind requires manual FFI bridge — not yet implemented")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof requires manual FFI bridge — not yet implemented")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires manual FFI bridge — not yet implemented")

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror requires manual FFI bridge — not yet implemented")
}

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi requires manual FFI bridge — not yet implemented")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol requires manual FFI bridge — not yet implemented")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires manual FFI bridge — not yet implemented")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol requires manual FFI bridge — not yet implemented")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires manual FFI bridge — not yet implemented")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires manual FFI bridge — not yet implemented")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires manual FFI bridge — not yet implemented")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free requires manual FFI bridge — not yet implemented")
}

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system requires manual FFI bridge — not yet implemented")

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires manual FFI bridge — not yet implemented")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires manual FFI bridge — not yet implemented")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires manual FFI bridge — not yet implemented")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires manual FFI bridge — not yet implemented")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires manual FFI bridge — not yet implemented")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp requires manual FFI bridge — not yet implemented")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires manual FFI bridge — not yet implemented")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll requires manual FFI bridge — not yet implemented")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires manual FFI bridge — not yet implemented")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires manual FFI bridge — not yet implemented")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn requires manual FFI bridge — not yet implemented")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn requires manual FFI bridge — not yet implemented")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires manual FFI bridge — not yet implemented")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires manual FFI bridge — not yet implemented")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires manual FFI bridge — not yet implemented")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen requires manual FFI bridge — not yet implemented")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires manual FFI bridge — not yet implemented")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror requires manual FFI bridge — not yet implemented")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires manual FFI bridge — not yet implemented")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires manual FFI bridge — not yet implemented")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen requires manual FFI bridge — not yet implemented")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires manual FFI bridge — not yet implemented")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires manual FFI bridge — not yet implemented")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires manual FFI bridge — not yet implemented")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires manual FFI bridge — not yet implemented")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires manual FFI bridge — not yet implemented")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs requires manual FFI bridge — not yet implemented")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs requires manual FFI bridge — not yet implemented")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires manual FFI bridge — not yet implemented")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun getpwnam(name: String?): Passwd? =
    throw UnsupportedOperationException("getpwnam requires manual FFI bridge — not yet implemented")

public actual fun getpwuid(uid: UidT): Passwd? =
    throw UnsupportedOperationException("getpwuid requires manual FFI bridge — not yet implemented")

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

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket requires manual FFI bridge — not yet implemented")

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("connect requires manual FFI bridge — not yet implemented")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("listen requires manual FFI bridge — not yet implemented")

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

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown requires manual FFI bridge — not yet implemented")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod requires manual FFI bridge — not yet implemented")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("fchmod requires manual FFI bridge — not yet implemented")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir requires manual FFI bridge — not yet implemented")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose requires manual FFI bridge — not yet implemented")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires manual FFI bridge — not yet implemented")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno requires manual FFI bridge — not yet implemented")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat requires manual FFI bridge — not yet implemented")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR requires manual FFI bridge — not yet implemented")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir requires manual FFI bridge — not yet implemented")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir requires manual FFI bridge — not yet implemented")
}

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat requires manual FFI bridge — not yet implemented")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchmodat requires manual FFI bridge — not yet implemented")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("fchown requires manual FFI bridge — not yet implemented")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchownat requires manual FFI bridge — not yet implemented")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat requires manual FFI bridge — not yet implemented")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat requires manual FFI bridge — not yet implemented")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdirat requires manual FFI bridge — not yet implemented")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): SsizeT =
    throw UnsupportedOperationException("readlinkat requires manual FFI bridge — not yet implemented")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("renameat requires manual FFI bridge — not yet implemented")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat requires manual FFI bridge — not yet implemented")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat requires manual FFI bridge — not yet implemented")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access requires manual FFI bridge — not yet implemented")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir requires manual FFI bridge — not yet implemented")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("chown requires manual FFI bridge — not yet implemented")

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("lchown requires manual FFI bridge — not yet implemented")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close requires manual FFI bridge — not yet implemented")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("dup requires manual FFI bridge — not yet implemented")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 requires manual FFI bridge — not yet implemented")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execl requires manual FFI bridge — not yet implemented")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execle requires manual FFI bridge — not yet implemented")

public actual fun execlp(file: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execlp requires manual FFI bridge — not yet implemented")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execv requires manual FFI bridge — not yet implemented")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve requires manual FFI bridge — not yet implemented")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvp requires manual FFI bridge — not yet implemented")

public actual fun fork(): PidT =
    throw UnsupportedOperationException("fork requires manual FFI bridge — not yet implemented")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("fpathconf requires manual FFI bridge — not yet implemented")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

public actual fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt =
    throw UnsupportedOperationException("getgroups requires manual FFI bridge — not yet implemented")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin requires manual FFI bridge — not yet implemented")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun getpgid(pid: PidT): PidT =
    throw UnsupportedOperationException("getpgid requires manual FFI bridge — not yet implemented")

public actual fun getpgrp(): PidT =
    throw UnsupportedOperationException("getpgrp requires manual FFI bridge — not yet implemented")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid requires manual FFI bridge — not yet implemented")

public actual fun getppid(): PidT =
    throw UnsupportedOperationException("getppid requires manual FFI bridge — not yet implemented")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty requires manual FFI bridge — not yet implemented")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link requires manual FFI bridge — not yet implemented")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek requires manual FFI bridge — not yet implemented")

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("pathconf requires manual FFI bridge — not yet implemented")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("pause requires manual FFI bridge — not yet implemented")

public actual fun pipe(fds: CInt?): CInt =
    throw UnsupportedOperationException("pipe requires manual FFI bridge — not yet implemented")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign requires manual FFI bridge — not yet implemented")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read requires manual FFI bridge — not yet implemented")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir requires manual FFI bridge — not yet implemented")

public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("seteuid requires manual FFI bridge — not yet implemented")

public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("setegid requires manual FFI bridge — not yet implemented")

public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setgid requires manual FFI bridge — not yet implemented")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    throw UnsupportedOperationException("setpgid requires manual FFI bridge — not yet implemented")

public actual fun setsid(): PidT =
    throw UnsupportedOperationException("setsid requires manual FFI bridge — not yet implemented")

public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setuid requires manual FFI bridge — not yet implemented")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires manual FFI bridge — not yet implemented")

public actual fun tcgetpgrp(fd: CInt): PidT =
    throw UnsupportedOperationException("tcgetpgrp requires manual FFI bridge — not yet implemented")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    throw UnsupportedOperationException("tcsetpgrp requires manual FFI bridge — not yet implemented")

public actual fun ttyname(fd: CInt): String? =
    throw UnsupportedOperationException("ttyname requires manual FFI bridge — not yet implemented")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink requires manual FFI bridge — not yet implemented")

public actual fun wait(status: CInt?): PidT =
    throw UnsupportedOperationException("wait requires manual FFI bridge — not yet implemented")

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    throw UnsupportedOperationException("waitpid requires manual FFI bridge — not yet implemented")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write requires manual FFI bridge — not yet implemented")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pread requires manual FFI bridge — not yet implemented")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwrite requires manual FFI bridge — not yet implemented")

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("utime requires manual FFI bridge — not yet implemented")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("kill requires manual FFI bridge — not yet implemented")

public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock requires manual FFI bridge — not yet implemented")

public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock requires manual FFI bridge — not yet implemented")

public actual fun mlockall(flags: CInt): CInt =
    throw UnsupportedOperationException("mlockall requires manual FFI bridge — not yet implemented")

public actual fun munlockall(): CInt =
    throw UnsupportedOperationException("munlockall requires manual FFI bridge — not yet implemented")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap requires manual FFI bridge — not yet implemented")

public actual fun ifIndextoname(ifindex: CUInt, ifname: String?): String? =
    throw UnsupportedOperationException("ifIndextoname requires manual FFI bridge — not yet implemented")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("fsync requires manual FFI bridge — not yet implemented")

public actual fun setenv(name: String?, `val`: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv requires manual FFI bridge — not yet implemented")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("unsetenv requires manual FFI bridge — not yet implemented")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink requires manual FFI bridge — not yet implemented")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires manual FFI bridge — not yet implemented")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath requires manual FFI bridge — not yet implemented")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    throw UnsupportedOperationException("flock requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires manual FFI bridge — not yet implemented")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times requires manual FFI bridge — not yet implemented")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt requires manual FFI bridge — not yet implemented")

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("raise requires manual FFI bridge — not yet implemented")

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction requires manual FFI bridge — not yet implemented")

public actual fun utimes(filename: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("utimes requires manual FFI bridge — not yet implemented")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires manual FFI bridge — not yet implemented")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror requires manual FFI bridge — not yet implemented")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires manual FFI bridge — not yet implemented")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose requires manual FFI bridge — not yet implemented")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    throw UnsupportedOperationException("dladdr requires manual FFI bridge — not yet implemented")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun freeaddrinfo(res: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo requires manual FFI bridge — not yet implemented")
}

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

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknod requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires manual FFI bridge — not yet implemented")

public actual fun gethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("gethostname requires manual FFI bridge — not yet implemented")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires manual FFI bridge — not yet implemented")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires manual FFI bridge — not yet implemented")

public actual fun getprotobynumber(proto: CInt): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires manual FFI bridge — not yet implemented")

public actual fun usleep(secs: CUInt): CInt =
    throw UnsupportedOperationException("usleep requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("setlocale requires manual FFI bridge — not yet implemented")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semWait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semWait requires manual FFI bridge — not yet implemented")

public actual fun semTrywait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semTrywait requires manual FFI bridge — not yet implemented")

public actual fun semPost(sem: SemT?): CInt =
    throw UnsupportedOperationException("semPost requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("statvfs requires manual FFI bridge — not yet implemented")

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("fstatvfs requires manual FFI bridge — not yet implemented")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): SsizeT =
    throw UnsupportedOperationException("readlink requires manual FFI bridge — not yet implemented")

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

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm requires manual FFI bridge — not yet implemented")

public actual fun getsid(pid: PidT): PidT =
    throw UnsupportedOperationException("getsid requires manual FFI bridge — not yet implemented")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf requires manual FFI bridge — not yet implemented")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifo requires manual FFI bridge — not yet implemented")

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("pselect requires manual FFI bridge — not yet implemented")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko requires manual FFI bridge — not yet implemented")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello requires manual FFI bridge — not yet implemented")

public actual fun tcdrain(fd: CInt): CInt =
    throw UnsupportedOperationException("tcdrain requires manual FFI bridge — not yet implemented")

public actual fun cfmakeraw(termios: Termios?) {
    throw UnsupportedOperationException("cfmakeraw requires manual FFI bridge — not yet implemented")
}

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetispeed requires manual FFI bridge — not yet implemented")

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetospeed requires manual FFI bridge — not yet implemented")

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetspeed requires manual FFI bridge — not yet implemented")

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcgetattr requires manual FFI bridge — not yet implemented")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcsetattr requires manual FFI bridge — not yet implemented")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflow requires manual FFI bridge — not yet implemented")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflush requires manual FFI bridge — not yet implemented")

public actual fun tcgetsid(fd: CInt): PidT =
    throw UnsupportedOperationException("tcgetsid requires manual FFI bridge — not yet implemented")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    throw UnsupportedOperationException("tcsendbreak requires manual FFI bridge — not yet implemented")

public actual fun mkstemp(template: String?): CInt =
    throw UnsupportedOperationException("mkstemp requires manual FFI bridge — not yet implemented")

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

public actual fun setlogmask(maskpri: CInt): CInt =
    throw UnsupportedOperationException("setlogmask requires manual FFI bridge — not yet implemented")

public actual fun syslog(priority: CInt, message: String?, vararg args: Any?) {
    throw UnsupportedOperationException("syslog requires manual FFI bridge — not yet implemented")
}

public actual fun grantpt(fd: CInt): CInt =
    throw UnsupportedOperationException("grantpt requires manual FFI bridge — not yet implemented")

public actual fun posixOpenpt(flags: CInt): CInt =
    throw UnsupportedOperationException("posixOpenpt requires manual FFI bridge — not yet implemented")

public actual fun ptsname(fd: CInt): String? =
    throw UnsupportedOperationException("ptsname requires manual FFI bridge — not yet implemented")

public actual fun unlockpt(fd: CInt): CInt =
    throw UnsupportedOperationException("unlockpt requires manual FFI bridge — not yet implemented")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires manual FFI bridge — not yet implemented")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires manual FFI bridge — not yet implemented")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires manual FFI bridge — not yet implemented")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires manual FFI bridge — not yet implemented")

public actual fun setgroups(ngroups: ULong, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires manual FFI bridge — not yet implemented")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires manual FFI bridge — not yet implemented")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fdopendir requires manual FFI bridge — not yet implemented")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    throw UnsupportedOperationException("setreuid requires manual FFI bridge — not yet implemented")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    throw UnsupportedOperationException("setregid requires manual FFI bridge — not yet implemented")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid requires manual FFI bridge — not yet implemented")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid requires manual FFI bridge — not yet implemented")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct requires manual FFI bridge — not yet implemented")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk requires manual FFI bridge — not yet implemented")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid requires manual FFI bridge — not yet implemented")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires manual FFI bridge — not yet implemented")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires manual FFI bridge — not yet implemented")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires manual FFI bridge — not yet implemented")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt requires manual FFI bridge — not yet implemented")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    throw UnsupportedOperationException("semget requires manual FFI bridge — not yet implemented")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop requires manual FFI bridge — not yet implemented")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl requires manual FFI bridge — not yet implemented")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl requires manual FFI bridge — not yet implemented")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget requires manual FFI bridge — not yet implemented")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv requires manual FFI bridge — not yet implemented")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires manual FFI bridge — not yet implemented")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("fallocate requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate requires manual FFI bridge — not yet implemented")

public actual fun readahead(fd: CInt, offset: Off64T, count: ULong): SsizeT =
    throw UnsupportedOperationException("readahead requires manual FFI bridge — not yet implemented")

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    throw UnsupportedOperationException("signalfd requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires manual FFI bridge — not yet implemented")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires manual FFI bridge — not yet implemented")

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: String?): CInt =
    throw UnsupportedOperationException("quotactl requires manual FFI bridge — not yet implemented")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp requires manual FFI bridge — not yet implemented")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps requires manual FFI bridge — not yet implemented")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun reboot(howTo: CInt): CInt =
    throw UnsupportedOperationException("reboot requires manual FFI bridge — not yet implemented")

public actual fun setfsgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setfsgid requires manual FFI bridge — not yet implemented")

public actual fun setfsuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setfsuid requires manual FFI bridge — not yet implemented")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires manual FFI bridge — not yet implemented")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires manual FFI bridge — not yet implemented")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires manual FFI bridge — not yet implemented")
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUInt): CInt =
    throw UnsupportedOperationException("syncFileRange requires manual FFI bridge — not yet implemented")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs requires manual FFI bridge — not yet implemented")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs requires manual FFI bridge — not yet implemented")
}

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise requires manual FFI bridge — not yet implemented")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires manual FFI bridge — not yet implemented")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir requires manual FFI bridge — not yet implemented")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise requires manual FFI bridge — not yet implemented")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps requires manual FFI bridge — not yet implemented")

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires manual FFI bridge — not yet implemented")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires manual FFI bridge — not yet implemented")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun getdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("getdomainname requires manual FFI bridge — not yet implemented")

public actual fun setdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("setdomainname requires manual FFI bridge — not yet implemented")

public actual fun vhangup(): CInt =
    throw UnsupportedOperationException("vhangup requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")
}

public actual fun syscall(num: CLong, vararg args: Any?): CLong =
    throw UnsupportedOperationException("syscall requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun umount(target: String?): CInt =
    throw UnsupportedOperationException("umount requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax requires manual FFI bridge — not yet implemented")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("tee requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday requires manual FFI bridge — not yet implemented")

public actual fun splice(fdIn: CInt, offIn: LoffT?, fdOut: CInt, offOut: LoffT?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("splice requires manual FFI bridge — not yet implemented")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun swapoff(puath: String?): CInt =
    throw UnsupportedOperationException("swapoff requires manual FFI bridge — not yet implemented")

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("vmsplice requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun personality(persona: CULong): CInt =
    throw UnsupportedOperationException("personality requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires manual FFI bridge — not yet implemented")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun sethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("sethostname requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin requires manual FFI bridge — not yet implemented")

public actual fun umount2(target: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("umount2 requires manual FFI bridge — not yet implemented")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    throw UnsupportedOperationException("swapon requires manual FFI bridge — not yet implemented")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize requires manual FFI bridge — not yet implemented")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun initgroups(user: String?, group: GidT): CInt =
    throw UnsupportedOperationException("initgroups requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires manual FFI bridge — not yet implemented")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill requires manual FFI bridge — not yet implemented")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink requires manual FFI bridge — not yet implemented")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon requires manual FFI bridge — not yet implemented")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid requires manual FFI bridge — not yet implemented")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires manual FFI bridge — not yet implemented")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires manual FFI bridge — not yet implemented")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires manual FFI bridge — not yet implemented")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires manual FFI bridge — not yet implemented")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat requires manual FFI bridge — not yet implemented")
