// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum not available on Android host — use androidNative target for FFI")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha not available on Android host — use androidNative target for FFI")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl not available on Android host — use androidNative target for FFI")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit not available on Android host — use androidNative target for FFI")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph not available on Android host — use androidNative target for FFI")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower not available on Android host — use androidNative target for FFI")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint not available on Android host — use androidNative target for FFI")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct not available on Android host — use androidNative target for FFI")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace not available on Android host — use androidNative target for FFI")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper not available on Android host — use androidNative target for FFI")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit not available on Android host — use androidNative target for FFI")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank not available on Android host — use androidNative target for FFI")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower not available on Android host — use androidNative target for FFI")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper not available on Android host — use androidNative target for FFI")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on Android host — use androidNative target for FFI")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on Android host — use androidNative target for FFI")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush not available on Android host — use androidNative target for FFI")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose not available on Android host — use androidNative target for FFI")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove not available on Android host — use androidNative target for FFI")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename not available on Android host — use androidNative target for FFI")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on Android host — use androidNative target for FFI")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf not available on Android host — use androidNative target for FFI")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf not available on Android host — use androidNative target for FFI")
}

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar not available on Android host — use androidNative target for FFI")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar not available on Android host — use androidNative target for FFI")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc not available on Android host — use androidNative target for FFI")

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on Android host — use androidNative target for FFI")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc not available on Android host — use androidNative target for FFI")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs not available on Android host — use androidNative target for FFI")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts not available on Android host — use androidNative target for FFI")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc not available on Android host — use androidNative target for FFI")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on Android host — use androidNative target for FFI")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on Android host — use androidNative target for FFI")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek not available on Android host — use androidNative target for FFI")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell not available on Android host — use androidNative target for FFI")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind not available on Android host — use androidNative target for FFI")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos not available on Android host — use androidNative target for FFI")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos not available on Android host — use androidNative target for FFI")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof not available on Android host — use androidNative target for FFI")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror not available on Android host — use androidNative target for FFI")

public actual fun clearerr(stream: FILE?) {
    throw UnsupportedOperationException("clearerr not available on Android host — use androidNative target for FFI")
}

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror not available on Android host — use androidNative target for FFI")
}

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi not available on Android host — use androidNative target for FFI")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol not available on Android host — use androidNative target for FFI")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll not available on Android host — use androidNative target for FFI")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol not available on Android host — use androidNative target for FFI")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll not available on Android host — use androidNative target for FFI")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul not available on Android host — use androidNative target for FFI")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull not available on Android host — use androidNative target for FFI")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on Android host — use androidNative target for FFI")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on Android host — use androidNative target for FFI")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on Android host — use androidNative target for FFI")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free not available on Android host — use androidNative target for FFI")
}

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system not available on Android host — use androidNative target for FFI")

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv not available on Android host — use androidNative target for FFI")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on Android host — use androidNative target for FFI")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on Android host — use androidNative target for FFI")

public actual fun stpcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("stpcpy not available on Android host — use androidNative target for FFI")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat not available on Android host — use androidNative target for FFI")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on Android host — use androidNative target for FFI")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp not available on Android host — use androidNative target for FFI")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp not available on Android host — use androidNative target for FFI")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll not available on Android host — use androidNative target for FFI")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr not available on Android host — use androidNative target for FFI")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr not available on Android host — use androidNative target for FFI")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn not available on Android host — use androidNative target for FFI")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on Android host — use androidNative target for FFI")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on Android host — use androidNative target for FFI")

public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup not available on Android host — use androidNative target for FFI")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on Android host — use androidNative target for FFI")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr not available on Android host — use androidNative target for FFI")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp not available on Android host — use androidNative target for FFI")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp not available on Android host — use androidNative target for FFI")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on Android host — use androidNative target for FFI")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on Android host — use androidNative target for FFI")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror not available on Android host — use androidNative target for FFI")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok not available on Android host — use androidNative target for FFI")

public actual fun strtokR(s: String?, t: String?, p: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR not available on Android host — use androidNative target for FFI")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on Android host — use androidNative target for FFI")

public actual fun strsignal(sig: CInt): String? =
    throw UnsupportedOperationException("strsignal not available on Android host — use androidNative target for FFI")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen not available on Android host — use androidNative target for FFI")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on Android host — use androidNative target for FFI")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on Android host — use androidNative target for FFI")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr not available on Android host — use androidNative target for FFI")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp not available on Android host — use androidNative target for FFI")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on Android host — use androidNative target for FFI")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on Android host — use androidNative target for FFI")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on Android host — use androidNative target for FFI")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy not available on Android host — use androidNative target for FFI")

public actual fun getpwnam(name: String?): Passwd? =
    throw UnsupportedOperationException("getpwnam not available on Android host — use androidNative target for FFI")

public actual fun getpwuid(uid: UidT): Passwd? =
    throw UnsupportedOperationException("getpwuid not available on Android host — use androidNative target for FFI")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf not available on Android host — use androidNative target for FFI")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf not available on Android host — use androidNative target for FFI")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf not available on Android host — use androidNative target for FFI")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf not available on Android host — use androidNative target for FFI")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf not available on Android host — use androidNative target for FFI")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf not available on Android host — use androidNative target for FFI")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf not available on Android host — use androidNative target for FFI")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked not available on Android host — use androidNative target for FFI")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked not available on Android host — use androidNative target for FFI")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket not available on Android host — use androidNative target for FFI")

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("connect not available on Android host — use androidNative target for FFI")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("listen not available on Android host — use androidNative target for FFI")

public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept not available on Android host — use androidNative target for FFI")

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername not available on Android host — use androidNative target for FFI")

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname not available on Android host — use androidNative target for FFI")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt not available on Android host — use androidNative target for FFI")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    throw UnsupportedOperationException("socketpair not available on Android host — use androidNative target for FFI")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto not available on Android host — use androidNative target for FFI")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown not available on Android host — use androidNative target for FFI")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod not available on Android host — use androidNative target for FFI")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("fchmod not available on Android host — use androidNative target for FFI")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat not available on Android host — use androidNative target for FFI")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir not available on Android host — use androidNative target for FFI")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat not available on Android host — use androidNative target for FFI")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose not available on Android host — use androidNative target for FFI")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on Android host — use androidNative target for FFI")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno not available on Android host — use androidNative target for FFI")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open not available on Android host — use androidNative target for FFI")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat not available on Android host — use androidNative target for FFI")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl not available on Android host — use androidNative target for FFI")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on Android host — use androidNative target for FFI")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on Android host — use androidNative target for FFI")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir not available on Android host — use androidNative target for FFI")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir not available on Android host — use androidNative target for FFI")
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchmodat not available on Android host — use androidNative target for FFI")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("fchown not available on Android host — use androidNative target for FFI")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchownat not available on Android host — use androidNative target for FFI")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat not available on Android host — use androidNative target for FFI")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat not available on Android host — use androidNative target for FFI")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("renameat not available on Android host — use androidNative target for FFI")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat not available on Android host — use androidNative target for FFI")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat not available on Android host — use androidNative target for FFI")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access not available on Android host — use androidNative target for FFI")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir not available on Android host — use androidNative target for FFI")

public actual fun fchdir(dirfd: CInt): CInt =
    throw UnsupportedOperationException("fchdir not available on Android host — use androidNative target for FFI")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("chown not available on Android host — use androidNative target for FFI")

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("lchown not available on Android host — use androidNative target for FFI")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close not available on Android host — use androidNative target for FFI")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("dup not available on Android host — use androidNative target for FFI")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 not available on Android host — use androidNative target for FFI")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execl not available on Android host — use androidNative target for FFI")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execle not available on Android host — use androidNative target for FFI")

public actual fun execlp(file: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execlp not available on Android host — use androidNative target for FFI")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execv not available on Android host — use androidNative target for FFI")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve not available on Android host — use androidNative target for FFI")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvp not available on Android host — use androidNative target for FFI")

public actual fun fork(): PidT =
    throw UnsupportedOperationException("fork not available on Android host — use androidNative target for FFI")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("fpathconf not available on Android host — use androidNative target for FFI")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on Android host — use androidNative target for FFI")

public actual fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt =
    throw UnsupportedOperationException("getgroups not available on Android host — use androidNative target for FFI")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin not available on Android host — use androidNative target for FFI")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt not available on Android host — use androidNative target for FFI")

public actual fun getpgid(pid: PidT): PidT =
    throw UnsupportedOperationException("getpgid not available on Android host — use androidNative target for FFI")

public actual fun getpgrp(): PidT =
    throw UnsupportedOperationException("getpgrp not available on Android host — use androidNative target for FFI")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid not available on Android host — use androidNative target for FFI")

public actual fun getppid(): PidT =
    throw UnsupportedOperationException("getppid not available on Android host — use androidNative target for FFI")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty not available on Android host — use androidNative target for FFI")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link not available on Android host — use androidNative target for FFI")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek not available on Android host — use androidNative target for FFI")

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("pathconf not available on Android host — use androidNative target for FFI")

public actual fun pipe(fds: CInt?): CInt =
    throw UnsupportedOperationException("pipe not available on Android host — use androidNative target for FFI")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign not available on Android host — use androidNative target for FFI")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on Android host — use androidNative target for FFI")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read not available on Android host — use androidNative target for FFI")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir not available on Android host — use androidNative target for FFI")

public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("seteuid not available on Android host — use androidNative target for FFI")

public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("setegid not available on Android host — use androidNative target for FFI")

public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setgid not available on Android host — use androidNative target for FFI")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    throw UnsupportedOperationException("setpgid not available on Android host — use androidNative target for FFI")

public actual fun setsid(): PidT =
    throw UnsupportedOperationException("setsid not available on Android host — use androidNative target for FFI")

public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setuid not available on Android host — use androidNative target for FFI")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    throw UnsupportedOperationException("setreuid not available on Android host — use androidNative target for FFI")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    throw UnsupportedOperationException("setregid not available on Android host — use androidNative target for FFI")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep not available on Android host — use androidNative target for FFI")

public actual fun tcgetpgrp(fd: CInt): PidT =
    throw UnsupportedOperationException("tcgetpgrp not available on Android host — use androidNative target for FFI")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    throw UnsupportedOperationException("tcsetpgrp not available on Android host — use androidNative target for FFI")

public actual fun ttyname(fd: CInt): String? =
    throw UnsupportedOperationException("ttyname not available on Android host — use androidNative target for FFI")

public actual fun ttynameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ttynameR not available on Android host — use androidNative target for FFI")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink not available on Android host — use androidNative target for FFI")

public actual fun wait(status: CInt?): PidT =
    throw UnsupportedOperationException("wait not available on Android host — use androidNative target for FFI")

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    throw UnsupportedOperationException("waitpid not available on Android host — use androidNative target for FFI")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write not available on Android host — use androidNative target for FFI")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pread not available on Android host — use androidNative target for FFI")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwrite not available on Android host — use androidNative target for FFI")

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("utime not available on Android host — use androidNative target for FFI")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("kill not available on Android host — use androidNative target for FFI")

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("killpg not available on Android host — use androidNative target for FFI")

public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock not available on Android host — use androidNative target for FFI")

public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock not available on Android host — use androidNative target for FFI")

public actual fun mlockall(flags: CInt): CInt =
    throw UnsupportedOperationException("mlockall not available on Android host — use androidNative target for FFI")

public actual fun munlockall(): CInt =
    throw UnsupportedOperationException("munlockall not available on Android host — use androidNative target for FFI")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on Android host — use androidNative target for FFI")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap not available on Android host — use androidNative target for FFI")

public actual fun ifIndextoname(ifindex: CUInt, ifname: String?): String? =
    throw UnsupportedOperationException("ifIndextoname not available on Android host — use androidNative target for FFI")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat not available on Android host — use androidNative target for FFI")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("fsync not available on Android host — use androidNative target for FFI")

public actual fun setenv(name: String?, `val`: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv not available on Android host — use androidNative target for FFI")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("unsetenv not available on Android host — use androidNative target for FFI")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink not available on Android host — use androidNative target for FFI")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("truncate not available on Android host — use androidNative target for FFI")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate not available on Android host — use androidNative target for FFI")

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    throw UnsupportedOperationException("getrusage not available on Android host — use androidNative target for FFI")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath not available on Android host — use androidNative target for FFI")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times not available on Android host — use androidNative target for FFI")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual not available on Android host — use androidNative target for FFI")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrInit(attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadAttrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on Android host — use androidNative target for FFI")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach not available on Android host — use androidNative target for FFI")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield not available on Android host — use androidNative target for FFI")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexInit(lock: PthreadMutexT, attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexLock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondInit(cond: PthreadCondT, attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondWait(cond: PthreadCondT, lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadCondWait not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondTimedwait(cond: PthreadCondT, lock: PthreadMutexT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondSignal(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondSignal not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondBroadcast(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondDestroy(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT, attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt not available on Android host — use androidNative target for FFI")

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("raise not available on Android host — use androidNative target for FFI")

public actual fun utimes(filename: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("utimes not available on Android host — use androidNative target for FFI")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen not available on Android host — use androidNative target for FFI")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror not available on Android host — use androidNative target for FFI")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym not available on Android host — use androidNative target for FFI")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose not available on Android host — use androidNative target for FFI")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo not available on Android host — use androidNative target for FFI")

public actual fun freeaddrinfo(res: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo not available on Android host — use androidNative target for FFI")
}

public actual fun hstrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("hstrerror not available on Android host — use androidNative target for FFI")

public actual fun gaiStrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror not available on Android host — use androidNative target for FFI")

public actual fun resInit(): CInt =
    throw UnsupportedOperationException("resInit not available on Android host — use androidNative target for FFI")

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on Android host — use androidNative target for FFI")

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on Android host — use androidNative target for FFI")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime not available on Android host — use androidNative target for FFI")

public actual fun time(time: TimeT?): TimeT =
    throw UnsupportedOperationException("time not available on Android host — use androidNative target for FFI")

public actual fun gmtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime not available on Android host — use androidNative target for FFI")

public actual fun localtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime not available on Android host — use androidNative target for FFI")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm not available on Android host — use androidNative target for FFI")

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknod not available on Android host — use androidNative target for FFI")

public actual fun gethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("gethostname not available on Android host — use androidNative target for FFI")

public actual fun endservent() {
    throw UnsupportedOperationException("endservent not available on Android host — use androidNative target for FFI")
}

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname not available on Android host — use androidNative target for FFI")

public actual fun getservbyport(port: CInt, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyport not available on Android host — use androidNative target for FFI")

public actual fun getservent(): Servent? =
    throw UnsupportedOperationException("getservent not available on Android host — use androidNative target for FFI")

public actual fun setservent(stayopen: CInt) {
    throw UnsupportedOperationException("setservent not available on Android host — use androidNative target for FFI")
}

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname not available on Android host — use androidNative target for FFI")

public actual fun getprotobynumber(proto: CInt): Protoent? =
    throw UnsupportedOperationException("getprotobynumber not available on Android host — use androidNative target for FFI")

public actual fun chroot(name: String?): CInt =
    throw UnsupportedOperationException("chroot not available on Android host — use androidNative target for FFI")

public actual fun usleep(secs: UsecondsT): CInt =
    throw UnsupportedOperationException("usleep not available on Android host — use androidNative target for FFI")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send not available on Android host — use androidNative target for FFI")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv not available on Android host — use androidNative target for FFI")

public actual fun putenv(string: String?): CInt =
    throw UnsupportedOperationException("putenv not available on Android host — use androidNative target for FFI")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll not available on Android host — use androidNative target for FFI")

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    throw UnsupportedOperationException("select not available on Android host — use androidNative target for FFI")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on Android host — use androidNative target for FFI")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on Android host — use androidNative target for FFI")

public actual fun semWait(sem: SemT): CInt =
    throw UnsupportedOperationException("semWait not available on Android host — use androidNative target for FFI")

public actual fun semTrywait(sem: SemT): CInt =
    throw UnsupportedOperationException("semTrywait not available on Android host — use androidNative target for FFI")

public actual fun semPost(sem: SemT): CInt =
    throw UnsupportedOperationException("semPost not available on Android host — use androidNative target for FFI")

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("statvfs not available on Android host — use androidNative target for FFI")

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("fstatvfs not available on Android host — use androidNative target for FFI")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset not available on Android host — use androidNative target for FFI")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset not available on Android host — use androidNative target for FFI")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset not available on Android host — use androidNative target for FFI")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset not available on Android host — use androidNative target for FFI")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember not available on Android host — use androidNative target for FFI")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask not available on Android host — use androidNative target for FFI")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending not available on Android host — use androidNative target for FFI")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf not available on Android host — use androidNative target for FFI")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifo not available on Android host — use androidNative target for FFI")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko not available on Android host — use androidNative target for FFI")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello not available on Android host — use androidNative target for FFI")

public actual fun tcdrain(fd: CInt): CInt =
    throw UnsupportedOperationException("tcdrain not available on Android host — use androidNative target for FFI")

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetispeed not available on Android host — use androidNative target for FFI")

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetospeed not available on Android host — use androidNative target for FFI")

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcgetattr not available on Android host — use androidNative target for FFI")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcsetattr not available on Android host — use androidNative target for FFI")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflow not available on Android host — use androidNative target for FFI")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflush not available on Android host — use androidNative target for FFI")

public actual fun tcgetsid(fd: CInt): PidT =
    throw UnsupportedOperationException("tcgetsid not available on Android host — use androidNative target for FFI")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    throw UnsupportedOperationException("tcsendbreak not available on Android host — use androidNative target for FFI")

public actual fun mkstemp(template: String?): CInt =
    throw UnsupportedOperationException("mkstemp not available on Android host — use androidNative target for FFI")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp not available on Android host — use androidNative target for FFI")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam not available on Android host — use androidNative target for FFI")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    throw UnsupportedOperationException("openlog not available on Android host — use androidNative target for FFI")
}

public actual fun closelog() {
    throw UnsupportedOperationException("closelog not available on Android host — use androidNative target for FFI")
}

public actual fun setlogmask(maskpri: CInt): CInt =
    throw UnsupportedOperationException("setlogmask not available on Android host — use androidNative target for FFI")

public actual fun syslog(priority: CInt, message: String?, vararg args: Any?) {
    throw UnsupportedOperationException("syslog not available on Android host — use androidNative target for FFI")
}

public actual fun nice(incr: CInt): CInt =
    throw UnsupportedOperationException("nice not available on Android host — use androidNative target for FFI")

public actual fun grantpt(fd: CInt): CInt =
    throw UnsupportedOperationException("grantpt not available on Android host — use androidNative target for FFI")

public actual fun posixOpenpt(flags: CInt): CInt =
    throw UnsupportedOperationException("posixOpenpt not available on Android host — use androidNative target for FFI")

public actual fun ptsname(fd: CInt): String? =
    throw UnsupportedOperationException("ptsname not available on Android host — use androidNative target for FFI")

public actual fun unlockpt(fd: CInt): CInt =
    throw UnsupportedOperationException("unlockpt not available on Android host — use androidNative target for FFI")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr not available on Android host — use androidNative target for FFI")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline not available on Android host — use androidNative target for FFI")

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    throw UnsupportedOperationException("lockf not available on Android host — use androidNative target for FFI")

public actual fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt =
    throw UnsupportedOperationException("adjtime not available on Android host — use androidNative target for FFI")

public actual fun stpncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("stpncpy not available on Android host — use androidNative target for FFI")


public actual fun confstr(name: CInt, buf: String?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr not available on Android host — use androidNative target for FFI")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    throw UnsupportedOperationException("dladdr not available on Android host — use androidNative target for FFI")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    throw UnsupportedOperationException("flock not available on Android host — use androidNative target for FFI")

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openWmemstream not available on Android host — use androidNative target for FFI")

public actual fun getsid(pid: PidT): PidT =
    throw UnsupportedOperationException("getsid not available on Android host — use androidNative target for FFI")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("pause not available on Android host — use androidNative target for FFI")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdirat not available on Android host — use androidNative target for FFI")

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat not available on Android host — use androidNative target for FFI")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fdopendir not available on Android host — use androidNative target for FFI")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR not available on Android host — use androidNative target for FFI")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): CInt =
    throw UnsupportedOperationException("readlinkat not available on Android host — use androidNative target for FFI")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): CInt =
    throw UnsupportedOperationException("readlink not available on Android host — use androidNative target for FFI")

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("pselect not available on Android host — use androidNative target for FFI")

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction not available on Android host — use androidNative target for FFI")

public actual fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE? =
    throw UnsupportedOperationException("fmemopen not available on Android host — use androidNative target for FFI")

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openMemstream not available on Android host — use androidNative target for FFI")

public actual fun cfmakeraw(termios: Termios?): CInt =
    throw UnsupportedOperationException("cfmakeraw not available on Android host — use androidNative target for FFI")

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetspeed not available on Android host — use androidNative target for FFI")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fnmatch not available on Android host — use androidNative target for FFI")


public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort not available on Android host — use androidNative target for FFI")
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch not available on Android host — use androidNative target for FFI")

public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadKeyCreate not available on Android host — use androidNative target for FFI")

public actual fun atexit(cb: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit not available on Android host — use androidNative target for FFI")

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("sigqueue not available on Android host — use androidNative target for FFI")
