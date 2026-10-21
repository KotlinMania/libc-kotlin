package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.RawLibc
import io.github.kotlinmania.libc.internal.toRawSize
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
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank requires N-API addon")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (filename != null && mode != null) {
        val h = LibcNative.fopen(filename, mode)
        if (h != 0) FILE(h.toLong()) else null
    } else {
        null
    }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun fflush(file: FILE?): Int =
    LibcNative.fflush(file?.handle?.toInt() ?: 0)

public actual fun fclose(file: FILE?): Int =
    LibcNative.fclose(file?.handle?.toInt() ?: -1)

public actual fun remove(filename: String?): Int =
    removeNapi(filename)

public actual fun rename(oldname: String?, newname: String?): Int =
    renameNapi(oldname, newname)

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf requires N-API addon")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun putchar(c: Int): Int =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun fgetc(stream: FILE?): Int =
    fgetcNapi(stream)

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    fgetsNapi(n, stream)

public actual fun fputc(c: Int, stream: FILE?): Int =
    fputcNapi(c, stream)

public actual fun fputs(s: String?, stream: FILE?): Int =
    fputsNapi(s, stream)

public actual fun puts(s: String?): Int =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun ungetc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    LibcNative.fread(ptr?.value, size.toInt(), nobj.toInt(), stream?.handle?.toInt() ?: -1).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    LibcNative.fwrite(ptr?.value, size.toInt(), nobj.toInt(), stream?.handle?.toInt() ?: -1).toULong()

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    LibcNative.fseek(stream?.handle?.toInt() ?: -1, offset.toInt(), whence)

public actual fun ftell(stream: FILE?): Long =
    LibcNative.ftell(stream?.handle?.toInt() ?: -1).toLong()

public actual fun rewind(stream: FILE?): Unit = throw UnsupportedOperationException("rewind requires N-API addon")

public actual fun fgetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun feof(stream: FILE?): Int =
    feofNapi(stream)

public actual fun ferror(stream: FILE?): Int =
    ferrorNapi(stream)

public actual fun clearerr(stream: FILE?) {
    clearerrNapi(stream)
}

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror requires N-API addon")

public actual fun atoi(s: String?): Int =
    atoiNapi(s)

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(s: COpaquePointer?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol requires N-API addon")

public actual fun strtoll(s: COpaquePointer?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: COpaquePointer?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: COpaquePointer?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    RawLibc.allocateZeroed(nobj.toRawSize(), size.toRawSize()).takeIf { it != 0L }?.let { COpaquePointer(it) }

public actual fun malloc(size: ULong): COpaquePointer? =
    RawLibc.allocate(size.toRawSize()).takeIf { it != 0L }?.let { COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    RawLibc.resize(p?.value ?: 0L, size.toRawSize()).takeIf { it != 0L }?.let { COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    RawLibc.release(p?.value ?: 0L)
}

public actual fun system(s: String?): Int =
    systemNapi(s)

public actual fun getenv(s: String?): String? =
    getenvNapi(s)

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

public actual fun strcmp(cs: String?, ct: String?): Int =
    strcmpNapi(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    strncmpNapi(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strchr(cs: String?, c: Int): String? =
    if (cs == null) {
        null
    } else {
        val idx = cs.indexOf(c.toChar())
        if (idx >= 0) cs.substring(idx) else null
    }

public actual fun strrchr(cs: String?, c: Int): String? =
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

public actual fun strcasecmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcasecmp requires N-API addon")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncasecmp requires N-API addon")

public actual fun strlen(cs: String?): ULong =
    strlenNapi(cs)

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strerror(n: Int): String? =
    strerrorNapi(n)

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strtokR(s: String?, t: String?, p: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR requires N-API addon")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun strsignal(sig: Int): String? =
    throw UnsupportedOperationException("strsignal requires N-API addon")

public actual fun wcslen(buf: UInt?): ULong =
    throw UnsupportedOperationException("wcslen requires N-API addon")

public actual fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires N-API addon")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires N-API addon")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    RawLibc.compare(cx?.value ?: 0L, ct?.value ?: 0L, n.toRawSize())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    RawLibc.copy(dest?.value ?: 0L, src?.value ?: 0L, n.toRawSize()).takeIf { it != 0L }?.let { COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    RawLibc.fill(dest?.value ?: 0L, c, n.toRawSize()).takeIf { it != 0L }?.let { COpaquePointer(it) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires N-API addon")

public actual fun getpwnam(name: String?): Passwd? =
    getpwnamNapi(name)

public actual fun getpwuid(uid: UInt): Passwd? =
    getpwuidNapi(uid)

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun printf(format: String?, vararg args: Any?): Int =
    if (format != null) LibcNative.printf(format) else -1

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf requires N-API addon")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf requires N-API addon")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked requires N-API addon")

public actual fun putcharUnlocked(c: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked requires N-API addon")

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    LibcNative.socket(domain, ty, protocol)

public actual fun connect(socket: Int, address: Sockaddr?, len: UInt): Int =
    LibcNative.connect(socket, address)

public actual fun listen(socket: Int, backlog: Int): Int =
    LibcNative.listen(socket, backlog)

public actual fun accept(socket: Int, address: Sockaddr?, addressLen: UInt?): Int {
    val res = LibcNative.accept(socket)
    return if (res != null && jsTypeOf(res) == "number") {
        (res as Number).toInt()
    } else if (res != null) {
        ((res.fd as? Number)?.toInt() ?: -1)
    } else {
        -1
    }
}

public actual fun getpeername(socket: Int, address: Sockaddr?, addressLen: UInt?): Int = 0

public actual fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int = 0

public actual fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int =
    LibcNative.setsockopt(socket, level, name, value?.value ?: 0)

public actual fun socketpair(domain: Int, type: Int, protocol: Int, socketVector: Int?): Int {
    val res = LibcNative.socketpair(domain, type, protocol)
    return if (res != null) 0 else -1
}

public actual fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    LibcNative.send(socket, js("{}"), flags).toLong()

public actual fun shutdown(socket: Int, how: Int): Int =
    LibcNative.shutdown(socket, how)

public actual fun chmod(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun fchmod(fd: Int, mode: UInt): Int =
    throw UnsupportedOperationException("fchmod requires N-API addon")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun mkdir(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun pclose(stream: FILE?): Int =
    pcloseNapi(stream)

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun open(path: String?, oflag: Int): Int = RawLibc.open(path, oflag, 0)

public actual fun open(path: String?, oflag: Int, mode: UInt): Int = RawLibc.open(path, oflag, mode.toInt())

public actual fun creat(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun fcntl(fd: Int, cmd: Int): Int = withDescriptorCommands { RawLibc.fcntlNoArgument(fd, cmd) }

public actual fun fcntl(fd: Int, cmd: Int, argument: Int): Int = withDescriptorCommands { RawLibc.fcntlInteger(fd, cmd, argument) }

public actual fun fcntl(fd: Int, cmd: Int, argument: COpaquePointer?): Int = withDescriptorCommands { RawLibc.fcntlPointer(fd, cmd, argument?.value ?: 0L) }

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun closedir(dirp: DIR?): Int =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir requires N-API addon")

public actual fun fchmodat(dirfd: Int, pathname: String?, mode: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fchmodat requires N-API addon")

public actual fun fchown(fd: Int, owner: UInt, group: UInt): Int =
    throw UnsupportedOperationException("fchown requires N-API addon")

public actual fun fchownat(dirfd: Int, pathname: String?, owner: UInt, group: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fchownat requires N-API addon")

public actual fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat requires N-API addon")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("linkat requires N-API addon")

public actual fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("renameat requires N-API addon")

public actual fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int =
    throw UnsupportedOperationException("symlinkat requires N-API addon")

public actual fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int =
    throw UnsupportedOperationException("unlinkat requires N-API addon")

public actual fun access(path: String?, amode: Int): Int =
    accessNapi(path, amode)

public actual fun chdir(dir: String?): Int =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun fchdir(dirfd: Int): Int =
    throw UnsupportedOperationException("fchdir requires N-API addon")

public actual fun chown(path: String?, uid: UInt, gid: UInt): Int =
    throw UnsupportedOperationException("chown requires N-API addon")

public actual fun lchown(path: String?, uid: UInt, gid: UInt): Int =
    throw UnsupportedOperationException("lchown requires N-API addon")

public actual fun close(fd: Int): Int = RawLibc.close(fd)

public actual fun dup(fd: Int): Int =
    throw UnsupportedOperationException("dup requires N-API addon")

public actual fun dup2(src: Int, dst: Int): Int =
    throw UnsupportedOperationException("dup2 requires N-API addon")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execl requires N-API addon")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execle requires N-API addon")

public actual fun execlp(file: String?, arg0: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("execlp requires N-API addon")

public actual fun execv(prog: String?, argv: COpaquePointer?): Int =
    throw UnsupportedOperationException("execv requires N-API addon")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execve requires N-API addon")

public actual fun execvp(c: String?, argv: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvp requires N-API addon")

public actual fun fork(): Int =
    throw UnsupportedOperationException("fork requires N-API addon")

public actual fun fpathconf(filedes: Int, name: Int): Long =
    throw UnsupportedOperationException("fpathconf requires N-API addon")

public actual fun getcwd(buf: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun getgroups(ngroupsMax: Int, groups: UInt?): Int =
    throw UnsupportedOperationException("getgroups requires N-API addon")

public actual fun getlogin(): String? =
    throw UnsupportedOperationException("getlogin requires N-API addon")

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt requires N-API addon")

public actual fun getpgid(pid: Int): Int =
    throw UnsupportedOperationException("getpgid requires N-API addon")

public actual fun getpgrp(): Int =
    throw UnsupportedOperationException("getpgrp requires N-API addon")

public actual fun getpid(): Int =
    getpidNapi()

public actual fun getppid(): Int =
    getppidNapi()

public actual fun geteuid(): UInt =
    LibcNative.geteuid().toUInt()

public actual fun getegid(): UInt =
    LibcNative.getegid().toUInt()

public actual fun getuid(): UInt =
    LibcNative.getuid().toUInt()

public actual fun getgid(): UInt =
    LibcNative.getgid().toUInt()

public actual fun isatty(fd: Int): Int =
    isattyNapi(fd)

public actual fun link(src: String?, dst: String?): Int =
    throw UnsupportedOperationException("link requires N-API addon")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long = RawLibc.seek(fd, offset, whence)

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf requires N-API addon")

public actual fun pipe(fds: Int?): Int =
    throw UnsupportedOperationException("pipe requires N-API addon")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires N-API addon")

public actual fun alignedFree(p: COpaquePointer?): Unit = free(p)

public actual fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long = RawLibc.read(fd, buf?.value ?: 0L, count.toRawSize())

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun seteuid(uid: UInt): Int =
    throw UnsupportedOperationException("seteuid requires N-API addon")

public actual fun setegid(gid: UInt): Int =
    throw UnsupportedOperationException("setegid requires N-API addon")

public actual fun setgid(gid: UInt): Int =
    throw UnsupportedOperationException("setgid requires N-API addon")

public actual fun setpgid(pid: Int, pgid: Int): Int =
    throw UnsupportedOperationException("setpgid requires N-API addon")

public actual fun setsid(): Int =
    throw UnsupportedOperationException("setsid requires N-API addon")

public actual fun setuid(uid: UInt): Int =
    throw UnsupportedOperationException("setuid requires N-API addon")

public actual fun setreuid(ruid: UInt, euid: UInt): Int =
    throw UnsupportedOperationException("setreuid requires N-API addon")

public actual fun setregid(rgid: UInt, egid: UInt): Int =
    throw UnsupportedOperationException("setregid requires N-API addon")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep requires N-API addon")

public actual fun tcgetpgrp(fd: Int): Int =
    throw UnsupportedOperationException("tcgetpgrp requires N-API addon")

public actual fun tcsetpgrp(fd: Int, pgrp: Int): Int =
    throw UnsupportedOperationException("tcsetpgrp requires N-API addon")

public actual fun ttyname(fd: Int): String? =
    throw UnsupportedOperationException("ttyname requires N-API addon")

public actual fun ttynameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ttynameR requires N-API addon")

public actual fun unlink(c: String?): Int =
    unlinkNapi(c)

public actual fun wait(status: Int?): Int =
    throw UnsupportedOperationException("wait requires N-API addon")

public actual fun waitpid(pid: Int, status: Int?, options: Int): Int =
    throw UnsupportedOperationException("waitpid requires N-API addon")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long = RawLibc.write(fd, buf?.value ?: 0L, count.toRawSize())

public actual fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread requires N-API addon")

public actual fun pwrite(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite requires N-API addon")

public actual fun utime(file: String?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("utime requires N-API addon")

public actual fun kill(pid: Int, sig: Int): Int =
    io.github.kotlinmania.libc.internal
        .kill(pid, sig)

public actual fun killpg(pgrp: Int, sig: Int): Int =
    throw UnsupportedOperationException("killpg requires N-API addon")

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    LibcNative.mlock((addr?.value ?: 0L).toDouble(), len.toDouble())

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    LibcNative.munlock((addr?.value ?: 0L).toDouble(), len.toDouble())

public actual fun mlockall(flags: Int): Int =
    throw UnsupportedOperationException("mlockall requires N-API addon")

public actual fun munlockall(): Int =
    throw UnsupportedOperationException("munlockall requires N-API addon")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires N-API addon")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap requires N-API addon")

public actual fun ifIndextoname(ifindex: UInt, ifname: String?): String? =
    throw UnsupportedOperationException("ifIndextoname requires N-API addon")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat requires N-API addon")

public actual fun fsync(fd: Int): Int =
    throw UnsupportedOperationException("fsync requires N-API addon")

public actual fun setenv(name: String?, `val`: String?, overwrite: Int): Int =
    setenvNapi(name, `val`, overwrite)

public actual fun unsetenv(name: String?): Int =
    unsetenvNapi(name)

public actual fun symlink(path1: String?, path2: String?): Int =
    throw UnsupportedOperationException("symlink requires N-API addon")

public actual fun truncate(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate requires N-API addon")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun getrusage(resource: Int, usage: Rusage?): Int =
    throw UnsupportedOperationException("getrusage requires N-API addon")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    realpathNapi(pathname)

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times requires N-API addon")

public actual fun pthreadEqual(t1: ULong, t2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun pthreadJoin(native: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadAttrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.COpaquePointer?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadDetach(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun pthreadKeyDelete(key: Int): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadGetspecific(key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun pthreadSetspecific(key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadMutexInit(lock: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexUnlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadMutexattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(attr: io.github.kotlinmania.libc.COpaquePointer?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadCondInit(cond: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondWait(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadCondTimedwait(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadCondSignal(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondDestroy(cond: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadRwlockInit(lock: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit requires N-API addon")

public actual fun pthreadRwlockDestroy(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires N-API addon")

public actual fun pthreadRwlockRdlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires N-API addon")

public actual fun pthreadRwlockTryrdlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires N-API addon")

public actual fun pthreadRwlockWrlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires N-API addon")

public actual fun pthreadRwlockTrywrlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires N-API addon")

public actual fun pthreadRwlockUnlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires N-API addon")

public actual fun pthreadRwlockattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires N-API addon")

public actual fun pthreadRwlockattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires N-API addon")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int {
    val res = LibcNative.getsockopt(sockfd, level, optname, optlen?.toInt() ?: 4)
    return if (res != null) 0 else -1
}

public actual fun raise(signum: Int): Int =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun utimes(filename: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("utimes requires N-API addon")

public actual fun dlopen(filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires N-API addon")

public actual fun dlerror(): String? =
    throw UnsupportedOperationException("dlerror requires N-API addon")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires N-API addon")

public actual fun dlclose(handle: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlclose requires N-API addon")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    getaddrinfoNapi(node, service, hints, res)

public actual fun freeaddrinfo(res: Addrinfo?) {
    freeaddrinfoNapi(res)
}

public actual fun hstrerror(errcode: Int): String? =
    hstrerrorNapi(errcode)

public actual fun gaiStrerror(errcode: Int): String? =
    gaiStrerrorNapi(errcode)

public actual fun resInit(): Int =
    resInitNapi()

public actual fun gmtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun mktime(tm: Tm?): Long =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun time(time: Long?): Long =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun gmtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun localtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm requires N-API addon")

public actual fun mknod(pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknod requires N-API addon")

public actual fun gethostname(name: COpaquePointer?, len: ULong): Int =
    run {
        LibcNative.gethostname()
        0
    }

public actual fun endservent(): Unit = throw UnsupportedOperationException("endservent requires N-API addon")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires N-API addon")

public actual fun getservbyport(port: Int, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyport requires N-API addon")

public actual fun getservent(): Servent? =
    throw UnsupportedOperationException("getservent requires N-API addon")

public actual fun setservent(stayopen: Int): Unit = throw UnsupportedOperationException("setservent requires N-API addon")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires N-API addon")

public actual fun getprotobynumber(proto: Int): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires N-API addon")

public actual fun chroot(name: String?): Int =
    throw UnsupportedOperationException("chroot requires N-API addon")

public actual fun usleep(secs: UInt): Int =
    throw UnsupportedOperationException("usleep requires N-API addon")

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    LibcNative.send(socket, js("{}"), flags).toLong()

public actual fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long {
    val res = LibcNative.recv(socket, len.toDouble(), flags)
    return if (res != null && res.length != null) (res.length as Number).toLong() else 0L
}

public actual fun putenv(string: String?): Int =
    putenvNapi(string)

public actual fun poll(fds: Pollfd?, nfds: UInt, timeout: Int): Int {
    if (fds == null || nfds == 0u) return 0
    val arr = js("[]")
    val item = js("{}")
    item.fd = fds.fd
    item.events = fds.events.toInt()
    item.revents = 0
    arr.push(item)
    return LibcNative.poll(arr, timeout)
}

public actual fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int {
    val rArr = js("[]")
    val wArr = js("[]")
    val eArr = js("[]")
    val timeoutMs = if (timeout != null) (timeout.tvSec.toDouble() * 1000.0 + timeout.tvUsec.toDouble() / 1000.0) else -1.0
    return LibcNative.select(rArr, wArr, eArr, timeoutMs)
}

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires N-API addon")

public actual fun semWait(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semWait requires N-API addon")

public actual fun semTrywait(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semTrywait requires N-API addon")

public actual fun semPost(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semPost requires N-API addon")

public actual fun statvfs(path: String?, buf: Statvfs?): Int =
    throw UnsupportedOperationException("statvfs requires N-API addon")

public actual fun fstatvfs(fd: Int, buf: Statvfs?): Int =
    throw UnsupportedOperationException("fstatvfs requires N-API addon")

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset requires N-API addon")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset requires N-API addon")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset requires N-API addon")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset requires N-API addon")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember requires N-API addon")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask requires N-API addon")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending requires N-API addon")

public actual fun sysconf(name: Int): Long =
    LibcNative.sysconf(name).toLong()

public actual fun mkfifo(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifo requires N-API addon")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko requires N-API addon")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello requires N-API addon")

public actual fun tcdrain(fd: Int): Int =
    throw UnsupportedOperationException("tcdrain requires N-API addon")

public actual fun cfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetispeed requires N-API addon")

public actual fun cfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetospeed requires N-API addon")

public actual fun tcgetattr(fd: Int, termios: Termios?): Int {
    val res = LibcNative.tcgetattr(fd)
    return if (res != null) 0 else -1
}

public actual fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    LibcNative.tcsetattr(fd, optionalActions, js("{}"))

public actual fun tcflow(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflow requires N-API addon")

public actual fun tcflush(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflush requires N-API addon")

public actual fun tcgetsid(fd: Int): Int =
    throw UnsupportedOperationException("tcgetsid requires N-API addon")

public actual fun tcsendbreak(fd: Int, duration: Int): Int =
    throw UnsupportedOperationException("tcsendbreak requires N-API addon")

public actual fun mkstemp(template: String?): Int =
    throw UnsupportedOperationException("mkstemp requires N-API addon")

public actual fun mkdtemp(template: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires N-API addon")

public actual fun tmpnam(ptr: String?): String? =
    throw UnsupportedOperationException("tmpnam requires N-API addon")

public actual fun openlog(ident: String?, logopt: Int, facility: Int): Unit = throw UnsupportedOperationException("openlog requires N-API addon")

public actual fun closelog(): Unit = throw UnsupportedOperationException("closelog requires N-API addon")

public actual fun setlogmask(maskpri: Int): Int =
    throw UnsupportedOperationException("setlogmask requires N-API addon")

public actual fun syslog(priority: Int, message: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("syslog requires N-API addon")

public actual fun nice(incr: Int): Int =
    throw UnsupportedOperationException("nice requires N-API addon")

public actual fun grantpt(fd: Int): Int =
    throw UnsupportedOperationException("grantpt requires N-API addon")

public actual fun posixOpenpt(flags: Int): Int =
    throw UnsupportedOperationException("posixOpenpt requires N-API addon")

public actual fun ptsname(fd: Int): String? =
    throw UnsupportedOperationException("ptsname requires N-API addon")

public actual fun unlockpt(fd: Int): Int =
    throw UnsupportedOperationException("unlockpt requires N-API addon")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr requires N-API addon")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline requires N-API addon")

public actual fun lockf(fd: Int, cmd: Int, len: Long): Int =
    throw UnsupportedOperationException("lockf requires N-API addon")

public actual fun adjtime(delta: Timeval?, olddelta: Timeval?): Int =
    throw UnsupportedOperationException("adjtime requires N-API addon")

public actual fun stpncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("stpncpy requires N-API addon")

public actual fun confstr(name: Int, buf: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr requires N-API addon")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int =
    throw UnsupportedOperationException("dladdr requires N-API addon")

public actual fun flock(fd: Int, operation: Int): Int =
    throw UnsupportedOperationException("flock requires N-API addon")

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openWmemstream requires N-API addon")

public actual fun getsid(pid: Int): Int =
    throw UnsupportedOperationException("getsid requires N-API addon")

public actual fun pause(): Int =
    throw UnsupportedOperationException("pause requires N-API addon")

public actual fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdirat requires N-API addon")

public actual fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat requires N-API addon")

public actual fun fdopendir(fd: Int): DIR? =
    throw UnsupportedOperationException("fdopendir requires N-API addon")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR requires N-API addon")

public actual fun readlinkat(dirfd: Int, pathname: String?, buf: COpaquePointer?, bufsiz: ULong): Int =
    throw UnsupportedOperationException("readlinkat requires N-API addon")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: ULong): Int =
    throw UnsupportedOperationException("readlink requires N-API addon")

public actual fun pselect(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("pselect requires N-API addon")

public actual fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction requires N-API addon")

public actual fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE? =
    throw UnsupportedOperationException("fmemopen requires N-API addon")

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    throw UnsupportedOperationException("openMemstream requires N-API addon")

public actual fun cfmakeraw(termios: Termios?): Int {
    LibcNative.cfmakeraw(js("{}"))
    return 0
}

public actual fun cfsetspeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetspeed requires N-API addon")

public actual fun fnmatch(pattern: String?, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("fnmatch requires N-API addon")

public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires N-API addon")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires N-API addon")

public actual fun pthreadKeyCreate(key: Int?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires N-API addon")

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires N-API addon")

public actual fun sigqueue(pid: Int, sig: Int, value: Sigval): Int =
    throw UnsupportedOperationException("sigqueue requires N-API addon")

public actual fun getnameinfo(
    sa: Sockaddr?,
    salen: UInt,
    host: ByteArray?,
    hostlen: UInt,
    serv: ByteArray?,
    servlen: UInt,
    flags: Int,
): Int =
    getnameinfoNapi(sa, salen, host, hostlen, serv, servlen, flags)
