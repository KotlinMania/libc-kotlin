// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR not available on JVM — no C library access")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on JVM — no C library access")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET not available on JVM — no C library access")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO not available on JVM — no C library access")
}

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO not available on JVM — no C library access")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET not available on JVM — no C library access")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR not available on JVM — no C library access")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on JVM — no C library access")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL not available on JVM — no C library access")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum not available on JVM — no C library access")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha not available on JVM — no C library access")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl not available on JVM — no C library access")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit not available on JVM — no C library access")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph not available on JVM — no C library access")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower not available on JVM — no C library access")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint not available on JVM — no C library access")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct not available on JVM — no C library access")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace not available on JVM — no C library access")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper not available on JVM — no C library access")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit not available on JVM — no C library access")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank not available on JVM — no C library access")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower not available on JVM — no C library access")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper not available on JVM — no C library access")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on JVM — no C library access")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on JVM — no C library access")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush not available on JVM — no C library access")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose not available on JVM — no C library access")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove not available on JVM — no C library access")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename not available on JVM — no C library access")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on JVM — no C library access")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf not available on JVM — no C library access")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf not available on JVM — no C library access")
}

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar not available on JVM — no C library access")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar not available on JVM — no C library access")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc not available on JVM — no C library access")

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on JVM — no C library access")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc not available on JVM — no C library access")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs not available on JVM — no C library access")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts not available on JVM — no C library access")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc not available on JVM — no C library access")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on JVM — no C library access")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on JVM — no C library access")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek not available on JVM — no C library access")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell not available on JVM — no C library access")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind not available on JVM — no C library access")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos not available on JVM — no C library access")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos not available on JVM — no C library access")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof not available on JVM — no C library access")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror not available on JVM — no C library access")

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror not available on JVM — no C library access")
}

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi not available on JVM — no C library access")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol not available on JVM — no C library access")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll not available on JVM — no C library access")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol not available on JVM — no C library access")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll not available on JVM — no C library access")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul not available on JVM — no C library access")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull not available on JVM — no C library access")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on JVM — no C library access")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on JVM — no C library access")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on JVM — no C library access")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free not available on JVM — no C library access")
}

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system not available on JVM — no C library access")

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv not available on JVM — no C library access")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on JVM — no C library access")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on JVM — no C library access")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat not available on JVM — no C library access")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on JVM — no C library access")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp not available on JVM — no C library access")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp not available on JVM — no C library access")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll not available on JVM — no C library access")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr not available on JVM — no C library access")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr not available on JVM — no C library access")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn not available on JVM — no C library access")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on JVM — no C library access")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on JVM — no C library access")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on JVM — no C library access")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr not available on JVM — no C library access")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on JVM — no C library access")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on JVM — no C library access")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror not available on JVM — no C library access")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok not available on JVM — no C library access")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on JVM — no C library access")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen not available on JVM — no C library access")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on JVM — no C library access")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on JVM — no C library access")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr not available on JVM — no C library access")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp not available on JVM — no C library access")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on JVM — no C library access")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on JVM — no C library access")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on JVM — no C library access")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on JVM — no C library access")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on JVM — no C library access")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on JVM — no C library access")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on JVM — no C library access")
}

public actual fun getpwnam(name: String?): Passwd? =
    throw UnsupportedOperationException("getpwnam not available on JVM — no C library access")

public actual fun getpwuid(uid: UidT): Passwd? =
    throw UnsupportedOperationException("getpwuid not available on JVM — no C library access")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf not available on JVM — no C library access")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf not available on JVM — no C library access")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf not available on JVM — no C library access")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf not available on JVM — no C library access")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf not available on JVM — no C library access")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf not available on JVM — no C library access")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf not available on JVM — no C library access")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked not available on JVM — no C library access")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked not available on JVM — no C library access")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket not available on JVM — no C library access")

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("connect not available on JVM — no C library access")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("listen not available on JVM — no C library access")

public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept not available on JVM — no C library access")

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername not available on JVM — no C library access")

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname not available on JVM — no C library access")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt not available on JVM — no C library access")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    throw UnsupportedOperationException("socketpair not available on JVM — no C library access")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto not available on JVM — no C library access")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown not available on JVM — no C library access")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod not available on JVM — no C library access")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("fchmod not available on JVM — no C library access")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat not available on JVM — no C library access")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir not available on JVM — no C library access")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat not available on JVM — no C library access")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose not available on JVM — no C library access")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on JVM — no C library access")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno not available on JVM — no C library access")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open not available on JVM — no C library access")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat not available on JVM — no C library access")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl not available on JVM — no C library access")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on JVM — no C library access")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on JVM — no C library access")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR not available on JVM — no C library access")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir not available on JVM — no C library access")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir not available on JVM — no C library access")
}

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat not available on JVM — no C library access")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchmodat not available on JVM — no C library access")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("fchown not available on JVM — no C library access")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchownat not available on JVM — no C library access")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat not available on JVM — no C library access")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat not available on JVM — no C library access")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdirat not available on JVM — no C library access")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): SsizeT =
    throw UnsupportedOperationException("readlinkat not available on JVM — no C library access")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("renameat not available on JVM — no C library access")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat not available on JVM — no C library access")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat not available on JVM — no C library access")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access not available on JVM — no C library access")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir not available on JVM — no C library access")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("chown not available on JVM — no C library access")

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("lchown not available on JVM — no C library access")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close not available on JVM — no C library access")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("dup not available on JVM — no C library access")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 not available on JVM — no C library access")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execl not available on JVM — no C library access")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execle not available on JVM — no C library access")

public actual fun execlp(file: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execlp not available on JVM — no C library access")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execv not available on JVM — no C library access")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve not available on JVM — no C library access")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvp not available on JVM — no C library access")

public actual fun fork(): PidT =
    throw UnsupportedOperationException("fork not available on JVM — no C library access")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("fpathconf not available on JVM — no C library access")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on JVM — no C library access")

public actual fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt =
    throw UnsupportedOperationException("getgroups not available on JVM — no C library access")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin not available on JVM — no C library access")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt not available on JVM — no C library access")

public actual fun getpgid(pid: PidT): PidT =
    throw UnsupportedOperationException("getpgid not available on JVM — no C library access")

public actual fun getpgrp(): PidT =
    throw UnsupportedOperationException("getpgrp not available on JVM — no C library access")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid not available on JVM — no C library access")

public actual fun getppid(): PidT =
    throw UnsupportedOperationException("getppid not available on JVM — no C library access")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty not available on JVM — no C library access")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link not available on JVM — no C library access")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek not available on JVM — no C library access")

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("pathconf not available on JVM — no C library access")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("pause not available on JVM — no C library access")

public actual fun pipe(fds: CInt?): CInt =
    throw UnsupportedOperationException("pipe not available on JVM — no C library access")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign not available on JVM — no C library access")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read not available on JVM — no C library access")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir not available on JVM — no C library access")

public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("seteuid not available on JVM — no C library access")

public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("setegid not available on JVM — no C library access")

public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setgid not available on JVM — no C library access")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    throw UnsupportedOperationException("setpgid not available on JVM — no C library access")

public actual fun setsid(): PidT =
    throw UnsupportedOperationException("setsid not available on JVM — no C library access")

public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setuid not available on JVM — no C library access")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep not available on JVM — no C library access")

public actual fun tcgetpgrp(fd: CInt): PidT =
    throw UnsupportedOperationException("tcgetpgrp not available on JVM — no C library access")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    throw UnsupportedOperationException("tcsetpgrp not available on JVM — no C library access")

public actual fun ttyname(fd: CInt): String? =
    throw UnsupportedOperationException("ttyname not available on JVM — no C library access")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink not available on JVM — no C library access")

public actual fun wait(status: CInt?): PidT =
    throw UnsupportedOperationException("wait not available on JVM — no C library access")

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    throw UnsupportedOperationException("waitpid not available on JVM — no C library access")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write not available on JVM — no C library access")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pread not available on JVM — no C library access")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwrite not available on JVM — no C library access")

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("utime not available on JVM — no C library access")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("kill not available on JVM — no C library access")

public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock not available on JVM — no C library access")

public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock not available on JVM — no C library access")

public actual fun mlockall(flags: CInt): CInt =
    throw UnsupportedOperationException("mlockall not available on JVM — no C library access")

public actual fun munlockall(): CInt =
    throw UnsupportedOperationException("munlockall not available on JVM — no C library access")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on JVM — no C library access")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap not available on JVM — no C library access")

public actual fun ifIndextoname(ifindex: CUInt, ifname: String?): String? =
    throw UnsupportedOperationException("ifIndextoname not available on JVM — no C library access")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat not available on JVM — no C library access")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("fsync not available on JVM — no C library access")

public actual fun setenv(name: String?, `val`: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv not available on JVM — no C library access")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("unsetenv not available on JVM — no C library access")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink not available on JVM — no C library access")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate not available on JVM — no C library access")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath not available on JVM — no C library access")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    throw UnsupportedOperationException("flock not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times not available on JVM — no C library access")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin not available on JVM — no C library access")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit not available on JVM — no C library access")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on JVM — no C library access")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on JVM — no C library access")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach not available on JVM — no C library access")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield not available on JVM — no C library access")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete not available on JVM — no C library access")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on JVM — no C library access")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific not available on JVM — no C library access")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit not available on JVM — no C library access")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on JVM — no C library access")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock not available on JVM — no C library access")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on JVM — no C library access")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on JVM — no C library access")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on JVM — no C library access")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on JVM — no C library access")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on JVM — no C library access")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit not available on JVM — no C library access")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait not available on JVM — no C library access")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on JVM — no C library access")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal not available on JVM — no C library access")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on JVM — no C library access")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy not available on JVM — no C library access")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit not available on JVM — no C library access")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on JVM — no C library access")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit not available on JVM — no C library access")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy not available on JVM — no C library access")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock not available on JVM — no C library access")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock not available on JVM — no C library access")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock not available on JVM — no C library access")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock not available on JVM — no C library access")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock not available on JVM — no C library access")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit not available on JVM — no C library access")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy not available on JVM — no C library access")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on JVM — no C library access")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt not available on JVM — no C library access")

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("raise not available on JVM — no C library access")

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction not available on JVM — no C library access")

public actual fun utimes(filename: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("utimes not available on JVM — no C library access")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen not available on JVM — no C library access")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror not available on JVM — no C library access")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym not available on JVM — no C library access")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose not available on JVM — no C library access")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    throw UnsupportedOperationException("dladdr not available on JVM — no C library access")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo not available on JVM — no C library access")

public actual fun freeaddrinfo(res: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo not available on JVM — no C library access")
}

public actual fun gaiStrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror not available on JVM — no C library access")

public actual fun resInit(): CInt =
    throw UnsupportedOperationException("resInit not available on JVM — no C library access")

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on JVM — no C library access")

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on JVM — no C library access")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime not available on JVM — no C library access")

public actual fun time(time: TimeT?): TimeT =
    throw UnsupportedOperationException("time not available on JVM — no C library access")

public actual fun gmtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime not available on JVM — no C library access")

public actual fun localtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime not available on JVM — no C library access")

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknod not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

public actual fun gethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("gethostname not available on JVM — no C library access")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname not available on JVM — no C library access")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname not available on JVM — no C library access")

public actual fun getprotobynumber(proto: CInt): Protoent? =
    throw UnsupportedOperationException("getprotobynumber not available on JVM — no C library access")

public actual fun usleep(secs: CUInt): CInt =
    throw UnsupportedOperationException("usleep not available on JVM — no C library access")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send not available on JVM — no C library access")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv not available on JVM — no C library access")

public actual fun putenv(string: String?): CInt =
    throw UnsupportedOperationException("putenv not available on JVM — no C library access")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll not available on JVM — no C library access")

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    throw UnsupportedOperationException("select not available on JVM — no C library access")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on JVM — no C library access")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on JVM — no C library access")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semWait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semWait not available on JVM — no C library access")

public actual fun semTrywait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semTrywait not available on JVM — no C library access")

public actual fun semPost(sem: SemT?): CInt =
    throw UnsupportedOperationException("semPost not available on JVM — no C library access")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("statvfs not available on JVM — no C library access")

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("fstatvfs not available on JVM — no C library access")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): SsizeT =
    throw UnsupportedOperationException("readlink not available on JVM — no C library access")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset not available on JVM — no C library access")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset not available on JVM — no C library access")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset not available on JVM — no C library access")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset not available on JVM — no C library access")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember not available on JVM — no C library access")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask not available on JVM — no C library access")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending not available on JVM — no C library access")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm not available on JVM — no C library access")

public actual fun getsid(pid: PidT): PidT =
    throw UnsupportedOperationException("getsid not available on JVM — no C library access")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf not available on JVM — no C library access")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifo not available on JVM — no C library access")

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("pselect not available on JVM — no C library access")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko not available on JVM — no C library access")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello not available on JVM — no C library access")

public actual fun tcdrain(fd: CInt): CInt =
    throw UnsupportedOperationException("tcdrain not available on JVM — no C library access")

public actual fun cfmakeraw(termios: Termios?) {
    throw UnsupportedOperationException("cfmakeraw not available on JVM — no C library access")
}

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetispeed not available on JVM — no C library access")

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetospeed not available on JVM — no C library access")

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetspeed not available on JVM — no C library access")

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcgetattr not available on JVM — no C library access")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcsetattr not available on JVM — no C library access")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflow not available on JVM — no C library access")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflush not available on JVM — no C library access")

public actual fun tcgetsid(fd: CInt): PidT =
    throw UnsupportedOperationException("tcgetsid not available on JVM — no C library access")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    throw UnsupportedOperationException("tcsendbreak not available on JVM — no C library access")

public actual fun mkstemp(template: String?): CInt =
    throw UnsupportedOperationException("mkstemp not available on JVM — no C library access")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp not available on JVM — no C library access")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam not available on JVM — no C library access")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    throw UnsupportedOperationException("openlog not available on JVM — no C library access")
}

public actual fun closelog() {
    throw UnsupportedOperationException("closelog not available on JVM — no C library access")
}

public actual fun setlogmask(maskpri: CInt): CInt =
    throw UnsupportedOperationException("setlogmask not available on JVM — no C library access")

public actual fun syslog(priority: CInt, message: String?, vararg args: Any?) {
    throw UnsupportedOperationException("syslog not available on JVM — no C library access")
}

public actual fun grantpt(fd: CInt): CInt =
    throw UnsupportedOperationException("grantpt not available on JVM — no C library access")

public actual fun posixOpenpt(flags: CInt): CInt =
    throw UnsupportedOperationException("posixOpenpt not available on JVM — no C library access")

public actual fun ptsname(fd: CInt): String? =
    throw UnsupportedOperationException("ptsname not available on JVM — no C library access")

public actual fun unlockpt(fd: CInt): CInt =
    throw UnsupportedOperationException("unlockpt not available on JVM — no C library access")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync not available on JVM — no C library access")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on JVM — no C library access")

public actual fun setgroups(ngroups: ULong, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups not available on JVM — no C library access")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 not available on JVM — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs not available on JVM — no C library access")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs not available on JVM — no C library access")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on JVM — no C library access")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise not available on JVM — no C library access")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on JVM — no C library access")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on JVM — no C library access")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on JVM — no C library access")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on JVM — no C library access")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on JVM — no C library access")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale not available on JVM — no C library access")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fdopendir not available on JVM — no C library access")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat not available on JVM — no C library access")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on JVM — no C library access")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on JVM — no C library access")

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt =
    throw UnsupportedOperationException("accept4 not available on JVM — no C library access")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR not available on JVM — no C library access")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv not available on JVM — no C library access")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid not available on JVM — no C library access")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    throw UnsupportedOperationException("setreuid not available on JVM — no C library access")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    throw UnsupportedOperationException("setregid not available on JVM — no C library access")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid not available on JVM — no C library access")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid not available on JVM — no C library access")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct not available on JVM — no C library access")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk not available on JVM — no C library access")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid not available on JVM — no C library access")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid not available on JVM — no C library access")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe not available on JVM — no C library access")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve not available on JVM — no C library access")

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on JVM — no C library access")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes not available on JVM — no C library access")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent not available on JVM — no C library access")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent not available on JVM — no C library access")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on JVM — no C library access")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on JVM — no C library access")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget not available on JVM — no C library access")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on JVM — no C library access")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt not available on JVM — no C library access")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl not available on JVM — no C library access")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    throw UnsupportedOperationException("semget not available on JVM — no C library access")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop not available on JVM — no C library access")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl not available on JVM — no C library access")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl not available on JVM — no C library access")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget not available on JVM — no C library access")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv not available on JVM — no C library access")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on JVM — no C library access")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("fallocate not available on JVM — no C library access")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate not available on JVM — no C library access")

public actual fun readahead(fd: CInt, offset: Off64T, count: ULong): SsizeT =
    throw UnsupportedOperationException("readahead not available on JVM — no C library access")

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    throw UnsupportedOperationException("signalfd not available on JVM — no C library access")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate not available on JVM — no C library access")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime not available on JVM — no C library access")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime not available on JVM — no C library access")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on JVM — no C library access")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on JVM — no C library access")

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: String?): CInt =
    throw UnsupportedOperationException("quotactl not available on JVM — no C library access")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 not available on JVM — no C library access")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp not available on JVM — no C library access")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps not available on JVM — no C library access")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait not available on JVM — no C library access")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo not available on JVM — no C library access")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun reboot(howTo: CInt): CInt =
    throw UnsupportedOperationException("reboot not available on JVM — no C library access")

public actual fun setfsgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setfsgid not available on JVM — no C library access")

public actual fun setfsuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setfsuid not available on JVM — no C library access")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat not available on JVM — no C library access")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on JVM — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex not available on JVM — no C library access")
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUInt): CInt =
    throw UnsupportedOperationException("syncFileRange not available on JVM — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs not available on JVM — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs not available on JVM — no C library access")
}

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree not available on JVM — no C library access")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise not available on JVM — no C library access")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on JVM — no C library access")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir not available on JVM — no C library access")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir not available on JVM — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise not available on JVM — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on JVM — no C library access")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on JVM — no C library access")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps not available on JVM — no C library access")

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes not available on JVM — no C library access")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on JVM — no C library access")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on JVM — no C library access")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on JVM — no C library access")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on JVM — no C library access")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on JVM — no C library access")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on JVM — no C library access")

public actual fun getdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("getdomainname not available on JVM — no C library access")

public actual fun setdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("setdomainname not available on JVM — no C library access")

public actual fun vhangup(): CInt =
    throw UnsupportedOperationException("vhangup not available on JVM — no C library access")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("sendmmsg not available on JVM — no C library access")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg not available on JVM — no C library access")

public actual fun sync() {
    throw UnsupportedOperationException("sync not available on JVM — no C library access")
}

public actual fun syscall(num: CLong, vararg args: Any?): CLong =
    throw UnsupportedOperationException("syscall not available on JVM — no C library access")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity not available on JVM — no C library access")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity not available on JVM — no C library access")

public actual fun umount(target: String?): CInt =
    throw UnsupportedOperationException("umount not available on JVM — no C library access")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax not available on JVM — no C library access")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("tee not available on JVM — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday not available on JVM — no C library access")

public actual fun splice(fdIn: CInt, offIn: LoffT?, fdOut: CInt, offOut: LoffT?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("splice not available on JVM — no C library access")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd not available on JVM — no C library access")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval not available on JVM — no C library access")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait not available on JVM — no C library access")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue not available on JVM — no C library access")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam not available on JVM — no C library access")

public actual fun swapoff(puath: String?): CInt =
    throw UnsupportedOperationException("swapoff not available on JVM — no C library access")

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("vmsplice not available on JVM — no C library access")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount not available on JVM — no C library access")

public actual fun personality(persona: CULong): CInt =
    throw UnsupportedOperationException("personality not available on JVM — no C library access")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam not available on JVM — no C library access")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll not available on JVM — no C library access")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on JVM — no C library access")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler not available on JVM — no C library access")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep not available on JVM — no C library access")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on JVM — no C library access")

public actual fun sethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("sethostname not available on JVM — no C library access")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin not available on JVM — no C library access")

public actual fun umount2(target: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("umount2 not available on JVM — no C library access")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    throw UnsupportedOperationException("swapon not available on JVM — no C library access")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler not available on JVM — no C library access")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend not available on JVM — no C library access")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on JVM — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack not available on JVM — no C library access")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize not available on JVM — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on JVM — no C library access")

public actual fun initgroups(user: String?, group: GidT): CInt =
    throw UnsupportedOperationException("initgroups not available on JVM — no C library access")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on JVM — no C library access")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on JVM — no C library access")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel not available on JVM — no C library access")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill not available on JVM — no C library access")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on JVM — no C library access")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon not available on JVM — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR not available on JVM — no C library access")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR not available on JVM — no C library access")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on JVM — no C library access")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on JVM — no C library access")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on JVM — no C library access")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent not available on JVM — no C library access")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on JVM — no C library access")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist not available on JVM — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on JVM — no C library access")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat not available on JVM — no C library access")

