// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank requires N-API addon")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen requires N-API addon")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires N-API addon")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires N-API addon")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires N-API addon")
}

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires N-API addon")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires N-API addon")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek requires N-API addon")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell requires N-API addon")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind requires N-API addon")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun clearerr(stream: FILE?) {
    throw UnsupportedOperationException("clearerr requires N-API addon")
}

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror requires N-API addon")
}

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi requires N-API addon")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol requires N-API addon")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires N-API addon")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires N-API addon")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires N-API addon")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free requires N-API addon")
}

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system requires N-API addon")

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires N-API addon")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun stpcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("stpcpy requires N-API addon")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp requires N-API addon")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires N-API addon")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires N-API addon")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires N-API addon")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn requires N-API addon")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn requires N-API addon")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires N-API addon")

public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup requires N-API addon")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires N-API addon")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires N-API addon")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp requires N-API addon")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp requires N-API addon")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen requires N-API addon")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strtokR(s: String?, t: String?, p: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR requires N-API addon")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun strsignal(sig: CInt): String? =
    throw UnsupportedOperationException("strsignal requires N-API addon")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen requires N-API addon")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires N-API addon")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr requires N-API addon")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires N-API addon")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires N-API addon")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires N-API addon")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires N-API addon")

public actual fun getpwnam(name: String?): Passwd? =
    throw UnsupportedOperationException("getpwnam requires N-API addon")

public actual fun getpwuid(uid: UidT): Passwd? =
    throw UnsupportedOperationException("getpwuid requires N-API addon")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires N-API addon")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires N-API addon")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires N-API addon")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked requires N-API addon")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked requires N-API addon")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket requires N-API addon")

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("connect requires N-API addon")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("listen requires N-API addon")

public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept requires N-API addon")

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername requires N-API addon")

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname requires N-API addon")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt requires N-API addon")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    throw UnsupportedOperationException("socketpair requires N-API addon")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto requires N-API addon")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown requires N-API addon")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("fchmod requires N-API addon")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose requires N-API addon")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires N-API addon")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir requires N-API addon")
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchmodat requires N-API addon")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("fchown requires N-API addon")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchownat requires N-API addon")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat requires N-API addon")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat requires N-API addon")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("renameat requires N-API addon")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat requires N-API addon")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat requires N-API addon")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access requires N-API addon")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun fchdir(dirfd: CInt): CInt =
    throw UnsupportedOperationException("fchdir requires N-API addon")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("chown requires N-API addon")

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("lchown requires N-API addon")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close requires N-API addon")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("dup requires N-API addon")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 requires N-API addon")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execl requires N-API addon")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execle requires N-API addon")

public actual fun execlp(file: String?, arg0: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("execlp requires N-API addon")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execv requires N-API addon")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve requires N-API addon")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvp requires N-API addon")

public actual fun fork(): PidT =
    throw UnsupportedOperationException("fork requires N-API addon")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("fpathconf requires N-API addon")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt =
    throw UnsupportedOperationException("getgroups requires N-API addon")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin requires N-API addon")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt requires N-API addon")

public actual fun getpgid(pid: PidT): PidT =
    throw UnsupportedOperationException("getpgid requires N-API addon")

public actual fun getpgrp(): PidT =
    throw UnsupportedOperationException("getpgrp requires N-API addon")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid requires N-API addon")

public actual fun getppid(): PidT =
    throw UnsupportedOperationException("getppid requires N-API addon")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty requires N-API addon")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link requires N-API addon")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek requires N-API addon")

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("pathconf requires N-API addon")

public actual fun pipe(fds: CInt?): CInt =
    throw UnsupportedOperationException("pipe requires N-API addon")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign requires N-API addon")

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read requires N-API addon")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("seteuid requires N-API addon")

public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("setegid requires N-API addon")

public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setgid requires N-API addon")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    throw UnsupportedOperationException("setpgid requires N-API addon")

public actual fun setsid(): PidT =
    throw UnsupportedOperationException("setsid requires N-API addon")

public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setuid requires N-API addon")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    throw UnsupportedOperationException("setreuid requires N-API addon")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    throw UnsupportedOperationException("setregid requires N-API addon")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires N-API addon")

public actual fun tcgetpgrp(fd: CInt): PidT =
    throw UnsupportedOperationException("tcgetpgrp requires N-API addon")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    throw UnsupportedOperationException("tcsetpgrp requires N-API addon")

public actual fun ttyname(fd: CInt): String? =
    throw UnsupportedOperationException("ttyname requires N-API addon")

public actual fun ttynameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ttynameR requires N-API addon")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink requires N-API addon")

public actual fun wait(status: CInt?): PidT =
    throw UnsupportedOperationException("wait requires N-API addon")

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    throw UnsupportedOperationException("waitpid requires N-API addon")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write requires N-API addon")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pread requires N-API addon")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwrite requires N-API addon")

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("utime requires N-API addon")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("kill requires N-API addon")

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("killpg requires N-API addon")

public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock requires N-API addon")

public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock requires N-API addon")

public actual fun mlockall(flags: CInt): CInt =
    throw UnsupportedOperationException("mlockall requires N-API addon")

public actual fun munlockall(): CInt =
    throw UnsupportedOperationException("munlockall requires N-API addon")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires N-API addon")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap requires N-API addon")

public actual fun ifIndextoname(ifindex: CUInt, ifname: String?): String? =
    throw UnsupportedOperationException("ifIndextoname requires N-API addon")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires N-API addon")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("fsync requires N-API addon")

public actual fun setenv(name: String?, `val`: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv requires N-API addon")

public actual fun unsetenv(name: String?): CInt =
    throw UnsupportedOperationException("unsetenv requires N-API addon")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink requires N-API addon")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("truncate requires N-API addon")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    throw UnsupportedOperationException("getrusage requires N-API addon")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath requires N-API addon")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times requires N-API addon")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun pthreadAttrInit(attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadMutexInit(lock: PthreadMutexT, attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadCondInit(cond: PthreadCondT, attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondWait(cond: PthreadCondT, lock: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadCondTimedwait(cond: PthreadCondT, lock: PthreadMutexT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadCondSignal(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondDestroy(cond: PthreadCondT): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT, attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit requires N-API addon")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires N-API addon")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires N-API addon")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires N-API addon")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires N-API addon")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires N-API addon")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires N-API addon")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires N-API addon")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires N-API addon")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt requires N-API addon")

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun utimes(filename: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("utimes requires N-API addon")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires N-API addon")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror requires N-API addon")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires N-API addon")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose requires N-API addon")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo requires N-API addon")

public actual fun freeaddrinfo(res: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo requires N-API addon")
}

public actual fun hstrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("hstrerror requires N-API addon")

public actual fun gaiStrerror(errcode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror requires N-API addon")

public actual fun resInit(): CInt =
    throw UnsupportedOperationException("resInit requires N-API addon")

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun time(time: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun gmtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun localtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm requires N-API addon")

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknod requires N-API addon")

public actual fun gethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("gethostname requires N-API addon")

public actual fun endservent() {
    throw UnsupportedOperationException("endservent requires N-API addon")
}

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires N-API addon")

public actual fun getservbyport(port: CInt, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyport requires N-API addon")

public actual fun getservent(): Servent? =
    throw UnsupportedOperationException("getservent requires N-API addon")

public actual fun setservent(stayopen: CInt) {
    throw UnsupportedOperationException("setservent requires N-API addon")
}

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires N-API addon")

public actual fun getprotobynumber(proto: CInt): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires N-API addon")

public actual fun chroot(name: String?): CInt =
    throw UnsupportedOperationException("chroot requires N-API addon")

public actual fun usleep(secs: UsecondsT): CInt =
    throw UnsupportedOperationException("usleep requires N-API addon")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send requires N-API addon")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv requires N-API addon")

public actual fun putenv(string: String?): CInt =
    throw UnsupportedOperationException("putenv requires N-API addon")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll requires N-API addon")

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    throw UnsupportedOperationException("select requires N-API addon")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires N-API addon")

public actual fun semWait(sem: SemT): CInt =
    throw UnsupportedOperationException("semWait requires N-API addon")

public actual fun semTrywait(sem: SemT): CInt =
    throw UnsupportedOperationException("semTrywait requires N-API addon")

public actual fun semPost(sem: SemT): CInt =
    throw UnsupportedOperationException("semPost requires N-API addon")

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("statvfs requires N-API addon")

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("fstatvfs requires N-API addon")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset requires N-API addon")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset requires N-API addon")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset requires N-API addon")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset requires N-API addon")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember requires N-API addon")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask requires N-API addon")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending requires N-API addon")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf requires N-API addon")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifo requires N-API addon")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko requires N-API addon")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello requires N-API addon")

public actual fun tcdrain(fd: CInt): CInt =
    throw UnsupportedOperationException("tcdrain requires N-API addon")

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetispeed requires N-API addon")

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetospeed requires N-API addon")

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcgetattr requires N-API addon")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcsetattr requires N-API addon")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflow requires N-API addon")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflush requires N-API addon")

public actual fun tcgetsid(fd: CInt): PidT =
    throw UnsupportedOperationException("tcgetsid requires N-API addon")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    throw UnsupportedOperationException("tcsendbreak requires N-API addon")

public actual fun mkstemp(template: String?): CInt =
    throw UnsupportedOperationException("mkstemp requires N-API addon")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires N-API addon")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam requires N-API addon")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    throw UnsupportedOperationException("openlog requires N-API addon")
}

public actual fun closelog() {
    throw UnsupportedOperationException("closelog requires N-API addon")
}

public actual fun setlogmask(maskpri: CInt): CInt =
    throw UnsupportedOperationException("setlogmask requires N-API addon")

public actual fun syslog(priority: CInt, message: String?, vararg args: Any?) {
    throw UnsupportedOperationException("syslog requires N-API addon")
}

public actual fun nice(incr: CInt): CInt =
    throw UnsupportedOperationException("nice requires N-API addon")

public actual fun grantpt(fd: CInt): CInt =
    throw UnsupportedOperationException("grantpt requires N-API addon")

public actual fun posixOpenpt(flags: CInt): CInt =
    throw UnsupportedOperationException("posixOpenpt requires N-API addon")

public actual fun ptsname(fd: CInt): String? =
    throw UnsupportedOperationException("ptsname requires N-API addon")

public actual fun unlockpt(fd: CInt): CInt =
    throw UnsupportedOperationException("unlockpt requires N-API addon")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr requires N-API addon")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline requires N-API addon")

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    throw UnsupportedOperationException("lockf requires N-API addon")

public actual fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt =
    throw UnsupportedOperationException("adjtime requires N-API addon")

public actual fun stpncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("stpncpy requires N-API addon")


public actual fun confstr(name: CInt, buf: String?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr requires N-API addon")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    throw UnsupportedOperationException("dladdr requires N-API addon")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    throw UnsupportedOperationException("flock requires N-API addon")

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openWmemstream requires N-API addon")

public actual fun getsid(pid: PidT): PidT =
    throw UnsupportedOperationException("getsid requires N-API addon")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("pause requires N-API addon")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdirat requires N-API addon")

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat requires N-API addon")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fdopendir requires N-API addon")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR requires N-API addon")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): CInt =
    throw UnsupportedOperationException("readlinkat requires N-API addon")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): CInt =
    throw UnsupportedOperationException("readlink requires N-API addon")

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("pselect requires N-API addon")

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction requires N-API addon")

public actual fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE? =
    throw UnsupportedOperationException("fmemopen requires N-API addon")

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openMemstream requires N-API addon")

public actual fun cfmakeraw(termios: Termios?): CInt =
    throw UnsupportedOperationException("cfmakeraw requires N-API addon")

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetspeed requires N-API addon")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fnmatch requires N-API addon")

