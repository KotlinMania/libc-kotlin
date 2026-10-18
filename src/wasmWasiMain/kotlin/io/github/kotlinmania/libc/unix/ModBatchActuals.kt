package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.WasiLibcEnv
import io.github.kotlinmania.libc.unix.bsd.apple.Sigaction
import io.github.kotlinmania.libc.unix.bsd.apple.Stat
import io.github.kotlinmania.libc.unix.bsd.apple.Statvfs
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.unix.linuxlike.Dirent
import io.github.kotlinmania.libc.unix.linuxlike.DlInfo
import io.github.kotlinmania.libc.unix.linuxlike.FdSet
import io.github.kotlinmania.libc.unix.linuxlike.Lconv
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Termios

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum not available on WASI — no C library access")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha not available on WASI — no C library access")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl not available on WASI — no C library access")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit not available on WASI — no C library access")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph not available on WASI — no C library access")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower not available on WASI — no C library access")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint not available on WASI — no C library access")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct not available on WASI — no C library access")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace not available on WASI — no C library access")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper not available on WASI — no C library access")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit not available on WASI — no C library access")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank not available on WASI — no C library access")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower not available on WASI — no C library access")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper not available on WASI — no C library access")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    WasiLibcEnv.fopen(filename, mode)

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on WASI — no C library access")

public actual fun fflush(file: FILE?): Int =
    WasiLibcEnv.fflush(file)

public actual fun fclose(file: FILE?): Int =
    WasiLibcEnv.fclose(file)

public actual fun remove(filename: String?): Int =
    WasiLibcEnv.remove(filename)

public actual fun rename(oldname: String?, newname: String?): Int =
    WasiLibcEnv.rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on WASI — no C library access")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf not available on WASI — no C library access")

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf not available on WASI — no C library access")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar not available on WASI — no C library access")

public actual fun putchar(c: Int): Int =
    throw UnsupportedOperationException("putchar not available on WASI — no C library access")

public actual fun fgetc(stream: FILE?): Int =
    WasiLibcEnv.fgetc(stream)

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    WasiLibcEnv.fgets(n, stream)

public actual fun fputc(c: Int, stream: FILE?): Int =
    WasiLibcEnv.fputc(c, stream)

public actual fun fputs(s: String?, stream: FILE?): Int =
    WasiLibcEnv.fputs(s, stream)

public actual fun puts(s: String?): Int =
    throw UnsupportedOperationException("puts not available on WASI — no C library access")

public actual fun ungetc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("ungetc not available on WASI — no C library access")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on WASI — no C library access")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on WASI — no C library access")

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseek not available on WASI — no C library access")

public actual fun ftell(stream: FILE?): Long =
    throw UnsupportedOperationException("ftell not available on WASI — no C library access")

public actual fun rewind(stream: FILE?): Unit = throw UnsupportedOperationException("rewind not available on WASI — no C library access")

public actual fun fgetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos not available on WASI — no C library access")

public actual fun fsetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos not available on WASI — no C library access")

public actual fun feof(stream: FILE?): Int =
    WasiLibcEnv.feof(stream)

public actual fun ferror(stream: FILE?): Int =
    WasiLibcEnv.ferror(stream)

public actual fun clearerr(stream: FILE?) {
    WasiLibcEnv.clearerr(stream)
}

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror not available on WASI — no C library access")

public actual fun atoi(s: String?): Int =
    throw UnsupportedOperationException("atoi not available on WASI — no C library access")

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol not available on WASI — no C library access")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll not available on WASI — no C library access")

public actual fun strtol(s: COpaquePointer?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol not available on WASI — no C library access")

public actual fun strtoll(s: COpaquePointer?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll not available on WASI — no C library access")

public actual fun strtoul(s: COpaquePointer?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul not available on WASI — no C library access")

public actual fun strtoull(s: COpaquePointer?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull not available on WASI — no C library access")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on WASI — no C library access")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on WASI — no C library access")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on WASI — no C library access")

public actual fun free(p: COpaquePointer?): Unit = throw UnsupportedOperationException("free not available on WASI — no C library access")

public actual fun system(s: String?): Int =
    throw UnsupportedOperationException("system not available on WASI — no C library access")

public actual fun getenv(s: String?): String? =
    WasiLibcEnv.getenv(s)

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on WASI — no C library access")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on WASI — no C library access")

public actual fun stpcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("stpcpy not available on WASI — no C library access")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat not available on WASI — no C library access")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on WASI — no C library access")

public actual fun strcmp(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcmp not available on WASI — no C library access")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncmp not available on WASI — no C library access")

public actual fun strcoll(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcoll not available on WASI — no C library access")

public actual fun strchr(cs: String?, c: Int): String? =
    throw UnsupportedOperationException("strchr not available on WASI — no C library access")

public actual fun strrchr(cs: String?, c: Int): String? =
    throw UnsupportedOperationException("strrchr not available on WASI — no C library access")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn not available on WASI — no C library access")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on WASI — no C library access")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on WASI — no C library access")

public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup not available on WASI — no C library access")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on WASI — no C library access")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr not available on WASI — no C library access")

public actual fun strcasecmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcasecmp not available on WASI — no C library access")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncasecmp not available on WASI — no C library access")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on WASI — no C library access")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on WASI — no C library access")

public actual fun strerror(n: Int): String? =
    WasiLibcEnv.strerror(n)

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok not available on WASI — no C library access")

public actual fun strtokR(s: String?, t: String?, p: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR not available on WASI — no C library access")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on WASI — no C library access")

public actual fun strsignal(sig: Int): String? =
    throw UnsupportedOperationException("strsignal not available on WASI — no C library access")

public actual fun wcslen(buf: UInt?): ULong =
    throw UnsupportedOperationException("wcslen not available on WASI — no C library access")

public actual fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on WASI — no C library access")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on WASI — no C library access")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr not available on WASI — no C library access")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp not available on WASI — no C library access")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on WASI — no C library access")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on WASI — no C library access")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on WASI — no C library access")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy not available on WASI — no C library access")

public actual fun getpwnam(name: String?): Passwd? =
    WasiLibcEnv.getpwnam(name)

public actual fun getpwuid(uid: UInt): Passwd? =
    WasiLibcEnv.getpwuid(uid)

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf not available on WASI — no C library access")

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf not available on WASI — no C library access")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf not available on WASI — no C library access")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf not available on WASI — no C library access")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf not available on WASI — no C library access")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf not available on WASI — no C library access")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf not available on WASI — no C library access")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked not available on WASI — no C library access")

public actual fun putcharUnlocked(c: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked not available on WASI — no C library access")

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket not available on WASI — no C library access")

public actual fun connect(socket: Int, address: Sockaddr?, len: UInt): Int =
    throw UnsupportedOperationException("connect not available on WASI — no C library access")

public actual fun listen(socket: Int, backlog: Int): Int =
    throw UnsupportedOperationException("listen not available on WASI — no C library access")

public actual fun accept(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("accept not available on WASI — no C library access")

public actual fun getpeername(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getpeername not available on WASI — no C library access")

public actual fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getsockname not available on WASI — no C library access")

public actual fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int =
    throw UnsupportedOperationException("setsockopt not available on WASI — no C library access")

public actual fun socketpair(domain: Int, type: Int, protocol: Int, socketVector: Int?): Int =
    throw UnsupportedOperationException("socketpair not available on WASI — no C library access")

public actual fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto not available on WASI — no C library access")

public actual fun shutdown(socket: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown not available on WASI — no C library access")

public actual fun chmod(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("chmod not available on WASI — no C library access")

public actual fun fchmod(fd: Int, mode: UInt): Int =
    throw UnsupportedOperationException("fchmod not available on WASI — no C library access")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat not available on WASI — no C library access")

public actual fun mkdir(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdir not available on WASI — no C library access")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat not available on WASI — no C library access")

public actual fun pclose(stream: FILE?): Int =
    WasiLibcEnv.pclose(stream)

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on WASI — no C library access")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno not available on WASI — no C library access")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open not available on WASI — no C library access")

public actual fun creat(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat not available on WASI — no C library access")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl not available on WASI — no C library access")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on WASI — no C library access")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on WASI — no C library access")

public actual fun closedir(dirp: DIR?): Int =
    throw UnsupportedOperationException("closedir not available on WASI — no C library access")

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir not available on WASI — no C library access")

public actual fun fchmodat(dirfd: Int, pathname: String?, mode: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fchmodat not available on WASI — no C library access")

public actual fun fchown(fd: Int, owner: UInt, group: UInt): Int =
    throw UnsupportedOperationException("fchown not available on WASI — no C library access")

public actual fun fchownat(dirfd: Int, pathname: String?, owner: UInt, group: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fchownat not available on WASI — no C library access")

public actual fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat not available on WASI — no C library access")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("linkat not available on WASI — no C library access")

public actual fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("renameat not available on WASI — no C library access")

public actual fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int =
    throw UnsupportedOperationException("symlinkat not available on WASI — no C library access")

public actual fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int =
    throw UnsupportedOperationException("unlinkat not available on WASI — no C library access")

public actual fun access(path: String?, amode: Int): Int =
    WasiLibcEnv.access(path, amode)

public actual fun chdir(dir: String?): Int =
    throw UnsupportedOperationException("chdir not available on WASI — no C library access")

public actual fun fchdir(dirfd: Int): Int =
    throw UnsupportedOperationException("fchdir not available on WASI — no C library access")

public actual fun chown(path: String?, uid: UInt, gid: UInt): Int =
    throw UnsupportedOperationException("chown not available on WASI — no C library access")

public actual fun lchown(path: String?, uid: UInt, gid: UInt): Int =
    throw UnsupportedOperationException("lchown not available on WASI — no C library access")

public actual fun close(fd: Int): Int =
    WasiLibcEnv.close(fd)

public actual fun dup(fd: Int): Int =
    throw UnsupportedOperationException("dup not available on WASI — no C library access")

public actual fun dup2(src: Int, dst: Int): Int =
    throw UnsupportedOperationException("dup2 not available on WASI — no C library access")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execl not available on WASI — no C library access")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execle not available on WASI — no C library access")

public actual fun execlp(file: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execlp not available on WASI — no C library access")

public actual fun execv(prog: String?, argv: COpaquePointer?): Int =
    throw UnsupportedOperationException("execv not available on WASI — no C library access")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execve not available on WASI — no C library access")

public actual fun execvp(c: String?, argv: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvp not available on WASI — no C library access")

public actual fun fork(): Int =
    throw UnsupportedOperationException("fork not available on WASI — no C library access")

public actual fun fpathconf(filedes: Int, name: Int): Long =
    throw UnsupportedOperationException("fpathconf not available on WASI — no C library access")

public actual fun getcwd(buf: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("getcwd not available on WASI — no C library access")

public actual fun getgroups(ngroupsMax: Int, groups: UInt?): Int =
    throw UnsupportedOperationException("getgroups not available on WASI — no C library access")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin not available on WASI — no C library access")

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt not available on WASI — no C library access")

public actual fun getpgid(pid: Int): Int =
    throw UnsupportedOperationException("getpgid not available on WASI — no C library access")

public actual fun getpgrp(): Int =
    throw UnsupportedOperationException("getpgrp not available on WASI — no C library access")

public actual fun getpid(): Int =
    WasiLibcEnv.getpid()

public actual fun getppid(): Int =
    WasiLibcEnv.getppid()

public actual fun geteuid(): UInt = WasiLibcEnv.geteuid()

public actual fun getegid(): UInt = WasiLibcEnv.getegid()

public actual fun getuid(): UInt = WasiLibcEnv.getuid()

public actual fun getgid(): UInt = WasiLibcEnv.getgid()

public actual fun isatty(fd: Int): Int =
    WasiLibcEnv.isatty(fd)

public actual fun link(src: String?, dst: String?): Int =
    throw UnsupportedOperationException("link not available on WASI — no C library access")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek not available on WASI — no C library access")

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf not available on WASI — no C library access")

public actual fun pipe(fds: Int?): Int =
    throw UnsupportedOperationException("pipe not available on WASI — no C library access")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign not available on WASI — no C library access")

public actual fun alignedFree(p: COpaquePointer?): Unit = free(p)

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on WASI — no C library access")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("read not available on WASI — no C library access")

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir not available on WASI — no C library access")

public actual fun seteuid(uid: UInt): Int =
    throw UnsupportedOperationException("seteuid not available on WASI — no C library access")

public actual fun setegid(gid: UInt): Int =
    throw UnsupportedOperationException("setegid not available on WASI — no C library access")

public actual fun setgid(gid: UInt): Int =
    throw UnsupportedOperationException("setgid not available on WASI — no C library access")

public actual fun setpgid(pid: Int, pgid: Int): Int =
    throw UnsupportedOperationException("setpgid not available on WASI — no C library access")

public actual fun setsid(): Int =
    throw UnsupportedOperationException("setsid not available on WASI — no C library access")

public actual fun setuid(uid: UInt): Int =
    throw UnsupportedOperationException("setuid not available on WASI — no C library access")

public actual fun setreuid(ruid: UInt, euid: UInt): Int =
    throw UnsupportedOperationException("setreuid not available on WASI — no C library access")

public actual fun setregid(rgid: UInt, egid: UInt): Int =
    throw UnsupportedOperationException("setregid not available on WASI — no C library access")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep not available on WASI — no C library access")

public actual fun tcgetpgrp(fd: Int): Int =
    throw UnsupportedOperationException("tcgetpgrp not available on WASI — no C library access")

public actual fun tcsetpgrp(fd: Int, pgrp: Int): Int =
    throw UnsupportedOperationException("tcsetpgrp not available on WASI — no C library access")

public actual fun ttyname(fd: Int): String? =
    throw UnsupportedOperationException("ttyname not available on WASI — no C library access")

public actual fun ttynameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ttynameR not available on WASI — no C library access")

public actual fun unlink(c: String?): Int =
    WasiLibcEnv.unlink(c)

public actual fun wait(status: Int?): Int =
    throw UnsupportedOperationException("wait not available on WASI — no C library access")

public actual fun waitpid(pid: Int, status: Int?, options: Int): Int =
    throw UnsupportedOperationException("waitpid not available on WASI — no C library access")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("write not available on WASI — no C library access")

public actual fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread not available on WASI — no C library access")

public actual fun pwrite(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite not available on WASI — no C library access")

public actual fun utime(file: String?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("utime not available on WASI — no C library access")

public actual fun kill(pid: Int, sig: Int): Int =
    throw UnsupportedOperationException("kill not available on WASI — no C library access")

public actual fun killpg(pgrp: Int, sig: Int): Int =
    throw UnsupportedOperationException("killpg not available on WASI — no C library access")

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mlock not available on WASI — no C library access")

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munlock not available on WASI — no C library access")

public actual fun mlockall(flags: Int): Int =
    throw UnsupportedOperationException("mlockall not available on WASI — no C library access")

public actual fun munlockall(): Int =
    throw UnsupportedOperationException("munlockall not available on WASI — no C library access")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on WASI — no C library access")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap not available on WASI — no C library access")

public actual fun ifIndextoname(ifindex: UInt, ifname: String?): String? =
    throw UnsupportedOperationException("ifIndextoname not available on WASI — no C library access")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat not available on WASI — no C library access")

public actual fun fsync(fd: Int): Int =
    throw UnsupportedOperationException("fsync not available on WASI — no C library access")

public actual fun setenv(name: String?, `val`: String?, overwrite: Int): Int =
    WasiLibcEnv.setenv(name, `val`, overwrite)

public actual fun unsetenv(name: String?): Int =
    WasiLibcEnv.unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): Int =
    throw UnsupportedOperationException("symlink not available on WASI — no C library access")

public actual fun truncate(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate not available on WASI — no C library access")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate not available on WASI — no C library access")

public actual fun getrusage(resource: Int, usage: Rusage?): Int =
    throw UnsupportedOperationException("getrusage not available on WASI — no C library access")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    WasiLibcEnv.realpath(pathname)

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times not available on WASI — no C library access")

public actual fun pthreadEqual(t1: ULong, t2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual not available on WASI — no C library access")

public actual fun pthreadJoin(native: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin not available on WASI — no C library access")

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrInit not available on WASI — no C library access")

public actual fun pthreadAttrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on WASI — no C library access")

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on WASI — no C library access")

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.COpaquePointer?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on WASI — no C library access")

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on WASI — no C library access")

public actual fun pthreadDetach(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadDetach not available on WASI — no C library access")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield not available on WASI — no C library access")

public actual fun pthreadKeyDelete(key: Int): Int =
    throw UnsupportedOperationException("pthreadKeyDelete not available on WASI — no C library access")

public actual fun pthreadGetspecific(key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on WASI — no C library access")

public actual fun pthreadSetspecific(key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific not available on WASI — no C library access")

public actual fun pthreadMutexInit(lock: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexInit not available on WASI — no C library access")

public actual fun pthreadMutexDestroy(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on WASI — no C library access")

public actual fun pthreadMutexLock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexLock not available on WASI — no C library access")

public actual fun pthreadMutexTrylock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on WASI — no C library access")

public actual fun pthreadMutexUnlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on WASI — no C library access")

public actual fun pthreadMutexattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on WASI — no C library access")

public actual fun pthreadMutexattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on WASI — no C library access")

public actual fun pthreadMutexattrSettype(attr: io.github.kotlinmania.libc.COpaquePointer?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on WASI — no C library access")

public actual fun pthreadCondInit(cond: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondInit not available on WASI — no C library access")

public actual fun pthreadCondWait(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondWait not available on WASI — no C library access")

public actual fun pthreadCondTimedwait(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on WASI — no C library access")

public actual fun pthreadCondSignal(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondSignal not available on WASI — no C library access")

public actual fun pthreadCondBroadcast(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on WASI — no C library access")

public actual fun pthreadCondDestroy(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy not available on WASI — no C library access")

public actual fun pthreadCondattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit not available on WASI — no C library access")

public actual fun pthreadCondattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on WASI — no C library access")

public actual fun pthreadRwlockInit(lock: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit not available on WASI — no C library access")

public actual fun pthreadRwlockDestroy(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy not available on WASI — no C library access")

public actual fun pthreadRwlockRdlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock not available on WASI — no C library access")

public actual fun pthreadRwlockTryrdlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock not available on WASI — no C library access")

public actual fun pthreadRwlockWrlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock not available on WASI — no C library access")

public actual fun pthreadRwlockTrywrlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock not available on WASI — no C library access")

public actual fun pthreadRwlockUnlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock not available on WASI — no C library access")

public actual fun pthreadRwlockattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit not available on WASI — no C library access")

public actual fun pthreadRwlockattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy not available on WASI — no C library access")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt not available on WASI — no C library access")

public actual fun raise(signum: Int): Int =
    throw UnsupportedOperationException("raise not available on WASI — no C library access")

public actual fun utimes(filename: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("utimes not available on WASI — no C library access")

public actual fun dlopen(filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlopen not available on WASI — no C library access")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror not available on WASI — no C library access")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym not available on WASI — no C library access")

public actual fun dlclose(handle: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlclose not available on WASI — no C library access")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    WasiLibcEnv.getaddrinfo(node, service, hints, res)

public actual fun freeaddrinfo(res: Addrinfo?) {
    WasiLibcEnv.freeaddrinfo(res)
}

public actual fun hstrerror(errcode: Int): String? =
    WasiLibcEnv.hstrerror(errcode)

public actual fun gaiStrerror(errcode: Int): String? =
    WasiLibcEnv.gaiStrerror(errcode)

public actual fun resInit(): Int =
    WasiLibcEnv.resInit()

public actual fun gmtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on WASI — no C library access")

public actual fun localtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on WASI — no C library access")

public actual fun mktime(tm: Tm?): Long =
    throw UnsupportedOperationException("mktime not available on WASI — no C library access")

public actual fun time(time: Long?): Long =
    throw UnsupportedOperationException("time not available on WASI — no C library access")

public actual fun gmtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("gmtime not available on WASI — no C library access")

public actual fun localtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("localtime not available on WASI — no C library access")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm not available on WASI — no C library access")

public actual fun mknod(pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknod not available on WASI — no C library access")

public actual fun gethostname(name: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("gethostname not available on WASI — no C library access")

public actual fun endservent(): Unit = throw UnsupportedOperationException("endservent not available on WASI — no C library access")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname not available on WASI — no C library access")

public actual fun getservbyport(port: Int, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyport not available on WASI — no C library access")

public actual fun getservent(): Servent? =
    throw UnsupportedOperationException("getservent not available on WASI — no C library access")

public actual fun setservent(stayopen: Int): Unit = throw UnsupportedOperationException("setservent not available on WASI — no C library access")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname not available on WASI — no C library access")

public actual fun getprotobynumber(proto: Int): Protoent? =
    throw UnsupportedOperationException("getprotobynumber not available on WASI — no C library access")

public actual fun chroot(name: String?): Int =
    throw UnsupportedOperationException("chroot not available on WASI — no C library access")

public actual fun usleep(secs: UInt): Int =
    throw UnsupportedOperationException("usleep not available on WASI — no C library access")

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send not available on WASI — no C library access")

public actual fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv not available on WASI — no C library access")

public actual fun putenv(string: String?): Int =
    WasiLibcEnv.putenv(string)

public actual fun poll(fds: Pollfd?, nfds: UInt, timeout: Int): Int =
    throw UnsupportedOperationException("poll not available on WASI — no C library access")

public actual fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int =
    throw UnsupportedOperationException("select not available on WASI — no C library access")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on WASI — no C library access")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on WASI — no C library access")

public actual fun semWait(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semWait not available on WASI — no C library access")

public actual fun semTrywait(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semTrywait not available on WASI — no C library access")

public actual fun semPost(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semPost not available on WASI — no C library access")

public actual fun statvfs(path: String?, buf: Statvfs?): Int =
    throw UnsupportedOperationException("statvfs not available on WASI — no C library access")

public actual fun fstatvfs(fd: Int, buf: Statvfs?): Int =
    throw UnsupportedOperationException("fstatvfs not available on WASI — no C library access")

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset not available on WASI — no C library access")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset not available on WASI — no C library access")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset not available on WASI — no C library access")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset not available on WASI — no C library access")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember not available on WASI — no C library access")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask not available on WASI — no C library access")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending not available on WASI — no C library access")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf not available on WASI — no C library access")

public actual fun mkfifo(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifo not available on WASI — no C library access")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko not available on WASI — no C library access")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello not available on WASI — no C library access")

public actual fun tcdrain(fd: Int): Int =
    throw UnsupportedOperationException("tcdrain not available on WASI — no C library access")

public actual fun cfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetispeed not available on WASI — no C library access")

public actual fun cfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetospeed not available on WASI — no C library access")

public actual fun tcgetattr(fd: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcgetattr not available on WASI — no C library access")

public actual fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcsetattr not available on WASI — no C library access")

public actual fun tcflow(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflow not available on WASI — no C library access")

public actual fun tcflush(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflush not available on WASI — no C library access")

public actual fun tcgetsid(fd: Int): Int =
    throw UnsupportedOperationException("tcgetsid not available on WASI — no C library access")

public actual fun tcsendbreak(fd: Int, duration: Int): Int =
    throw UnsupportedOperationException("tcsendbreak not available on WASI — no C library access")

public actual fun mkstemp(template: String?): Int =
    throw UnsupportedOperationException("mkstemp not available on WASI — no C library access")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp not available on WASI — no C library access")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam not available on WASI — no C library access")

public actual fun openlog(ident: String?, logopt: Int, facility: Int): Unit = throw UnsupportedOperationException("openlog not available on WASI — no C library access")

public actual fun closelog(): Unit = throw UnsupportedOperationException("closelog not available on WASI — no C library access")

public actual fun setlogmask(maskpri: Int): Int =
    throw UnsupportedOperationException("setlogmask not available on WASI — no C library access")

public actual fun syslog(priority: Int, message: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("syslog not available on WASI — no C library access")

public actual fun nice(incr: Int): Int =
    throw UnsupportedOperationException("nice not available on WASI — no C library access")

public actual fun grantpt(fd: Int): Int =
    throw UnsupportedOperationException("grantpt not available on WASI — no C library access")

public actual fun posixOpenpt(flags: Int): Int =
    throw UnsupportedOperationException("posixOpenpt not available on WASI — no C library access")

public actual fun ptsname(fd: Int): String? =
    throw UnsupportedOperationException("ptsname not available on WASI — no C library access")

public actual fun unlockpt(fd: Int): Int =
    throw UnsupportedOperationException("unlockpt not available on WASI — no C library access")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr not available on WASI — no C library access")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline not available on WASI — no C library access")

public actual fun lockf(fd: Int, cmd: Int, len: Long): Int =
    throw UnsupportedOperationException("lockf not available on WASI — no C library access")

public actual fun adjtime(delta: Timeval?, olddelta: Timeval?): Int =
    throw UnsupportedOperationException("adjtime not available on WASI — no C library access")

public actual fun stpncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("stpncpy not available on WASI — no C library access")

public actual fun confstr(name: Int, buf: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr not available on WASI — no C library access")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int =
    throw UnsupportedOperationException("dladdr not available on WASI — no C library access")

public actual fun flock(fd: Int, operation: Int): Int =
    throw UnsupportedOperationException("flock not available on WASI — no C library access")

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openWmemstream not available on WASI — no C library access")

public actual fun getsid(pid: Int): Int =
    throw UnsupportedOperationException("getsid not available on WASI — no C library access")

public actual fun pause(): Int =
    throw UnsupportedOperationException("pause not available on WASI — no C library access")

public actual fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdirat not available on WASI — no C library access")

public actual fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat not available on WASI — no C library access")

public actual fun fdopendir(fd: Int): DIR? =
    throw UnsupportedOperationException("fdopendir not available on WASI — no C library access")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR not available on WASI — no C library access")

public actual fun readlinkat(dirfd: Int, pathname: String?, buf: COpaquePointer?, bufsiz: ULong): Int =
    throw UnsupportedOperationException("readlinkat not available on WASI — no C library access")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: ULong): Int =
    throw UnsupportedOperationException("readlink not available on WASI — no C library access")

public actual fun pselect(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("pselect not available on WASI — no C library access")

public actual fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction not available on WASI — no C library access")

public actual fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE? =
    throw UnsupportedOperationException("fmemopen not available on WASI — no C library access")

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openMemstream not available on WASI — no C library access")

public actual fun cfmakeraw(termios: Termios?): Int =
    throw UnsupportedOperationException("cfmakeraw not available on WASI — no C library access")

public actual fun cfsetspeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetspeed not available on WASI — no C library access")

public actual fun fnmatch(pattern: String?, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("fnmatch not available on WASI — no C library access")

public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort not available on WASI — no C library access")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch not available on WASI — no C library access")

public actual fun pthreadKeyCreate(key: Int?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate not available on WASI — no C library access")

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit not available on WASI — no C library access")

public actual fun sigqueue(pid: Int, sig: Int, value: Sigval): Int =
    throw UnsupportedOperationException("sigqueue not available on WASI — no C library access")

public actual fun getnameinfo(
    sa: Sockaddr?,
    salen: UInt,
    host: ByteArray?,
    hostlen: UInt,
    serv: ByteArray?,
    servlen: UInt,
    flags: Int,
): Int =
    WasiLibcEnv.getnameinfo(sa, salen, host, hostlen, serv, servlen, flags)
