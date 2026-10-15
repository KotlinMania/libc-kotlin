// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR requires N-API addon")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires N-API addon")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires N-API addon")

public actual fun cPUZERO(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO requires N-API addon")

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET requires N-API addon")

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR requires N-API addon")

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires N-API addon")

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
    LibcNative.fflush(file?.handle?.toInt() ?: -1)

public actual fun fclose(file: FILE?): Int =
    LibcNative.fclose(file?.handle?.toInt() ?: -1)

public actual fun remove(filename: String?): Int =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(oldname: String?, newname: String?): Int =
    throw UnsupportedOperationException("rename requires N-API addon")

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
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun fputc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun fputs(s: String?, stream: FILE?): Int =
    throw UnsupportedOperationException("fputs requires N-API addon")

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
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(stream: FILE?): Int =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror requires N-API addon")

public actual fun atoi(s: String?): Int =
    atoiNapi(s)

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    strtolNapi(s, base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    callocNapi(nobj, size)

public actual fun malloc(size: ULong): COpaquePointer? =
    mallocNapi(size)

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    reallocNapi(p, size)

public actual fun free(p: COpaquePointer?) {
    freeNapi(p)
}

public actual fun system(s: String?): Int =
    systemNapi(s)

public actual fun getenv(s: String?): String? =
    getenvNapi(s)

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

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

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires N-API addon")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires N-API addon")

public actual fun strlen(cs: String?): ULong =
    strlenNapi(cs)

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strerror(n: Int): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun wcslen(buf: UInt?): ULong =
    throw UnsupportedOperationException("wcslen requires N-API addon")

public actual fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires N-API addon")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires N-API addon")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    LibcNative.memcmp(cx?.value, ct?.value, n.toInt())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    run {
        val r = LibcNative.memcpy(dest?.value, src?.value, n.toInt())
        if (r != null && r != 0) COpaquePointer(r.toLong()) else null
    }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    run {
        val r = LibcNative.memset(dest?.value, c, n.toInt())
        if (r != null && r != 0) COpaquePointer(r.toLong()) else null
    }

public actual fun abs(i: Int): Int =
    LibcNative.abs(i)

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun getpwnam(name: String?): Passwd? =
    throw UnsupportedOperationException("getpwnam requires N-API addon")

public actual fun getpwuid(uid: UInt): Passwd? =
    throw UnsupportedOperationException("getpwuid requires N-API addon")

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
    throw UnsupportedOperationException("socket requires N-API addon")

public actual fun connect(socket: Int, address: Sockaddr?, len: UInt): Int =
    throw UnsupportedOperationException("connect requires N-API addon")

public actual fun listen(socket: Int, backlog: Int): Int =
    throw UnsupportedOperationException("listen requires N-API addon")

public actual fun accept(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("accept requires N-API addon")

public actual fun getpeername(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getpeername requires N-API addon")

public actual fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getsockname requires N-API addon")

public actual fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int =
    throw UnsupportedOperationException("setsockopt requires N-API addon")

public actual fun socketpair(domain: Int, type: Int, protocol: Int, socketVector: Int?): Int =
    throw UnsupportedOperationException("socketpair requires N-API addon")

public actual fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto requires N-API addon")

public actual fun shutdown(socket: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown requires N-API addon")

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
    throw UnsupportedOperationException("pclose requires N-API addon")

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun creat(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires N-API addon")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR requires N-API addon")

public actual fun closedir(dirp: DIR?): Int =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir requires N-API addon")

public actual fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat requires N-API addon")

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

public actual fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdirat requires N-API addon")

public actual fun readlinkat(dirfd: Int, pathname: String?, buf: String?, bufsiz: ULong): Long =
    throw UnsupportedOperationException("readlinkat requires N-API addon")

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

public actual fun chown(path: String?, uid: UInt, gid: UInt): Int =
    throw UnsupportedOperationException("chown requires N-API addon")

public actual fun lchown(path: String?, uid: UInt, gid: UInt): Int =
    throw UnsupportedOperationException("lchown requires N-API addon")

public actual fun close(fd: Int): Int =
    closeNapi(fd)

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

public actual fun getcwd(buf: String?, size: ULong): String? =
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

public actual fun isatty(fd: Int): Int =
    throw UnsupportedOperationException("isatty requires N-API addon")

public actual fun link(src: String?, dst: String?): Int =
    throw UnsupportedOperationException("link requires N-API addon")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    LibcNative.lseek(fd, offset.toInt(), whence).toLong()

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf requires N-API addon")

public actual fun pause(): Int =
    throw UnsupportedOperationException("pause requires N-API addon")

public actual fun pipe(fds: Int?): Int =
    throw UnsupportedOperationException("pipe requires N-API addon")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires N-API addon")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    LibcNative.read(fd, buf?.value, count.toInt()).toLong()

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

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep requires N-API addon")

public actual fun tcgetpgrp(fd: Int): Int =
    throw UnsupportedOperationException("tcgetpgrp requires N-API addon")

public actual fun tcsetpgrp(fd: Int, pgrp: Int): Int =
    throw UnsupportedOperationException("tcsetpgrp requires N-API addon")

public actual fun ttyname(fd: Int): String? =
    throw UnsupportedOperationException("ttyname requires N-API addon")

public actual fun unlink(c: String?): Int =
    unlinkNapi(c)

public actual fun wait(status: Int?): Int =
    throw UnsupportedOperationException("wait requires N-API addon")

public actual fun waitpid(pid: Int, status: Int?, options: Int): Int =
    throw UnsupportedOperationException("waitpid requires N-API addon")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    LibcNative.write(fd, buf?.value, count.toInt()).toLong()

public actual fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread requires N-API addon")

public actual fun pwrite(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite requires N-API addon")

public actual fun utime(file: String?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("utime requires N-API addon")

public actual fun kill(pid: Int, sig: Int): Int =
    throw UnsupportedOperationException("kill requires N-API addon")

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mlock requires N-API addon")

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munlock requires N-API addon")

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
    throw UnsupportedOperationException("setenv requires N-API addon")

public actual fun unsetenv(name: String?): Int =
    throw UnsupportedOperationException("unsetenv requires N-API addon")

public actual fun symlink(path1: String?, path2: String?): Int =
    throw UnsupportedOperationException("symlink requires N-API addon")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath requires N-API addon")

public actual fun flock(fd: Int, operation: Int): Int =
    throw UnsupportedOperationException("flock requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times requires N-API addon")

public actual fun pthreadJoin(native: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadDetach(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun pthreadKeyDelete(key: UInt): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadGetspecific(key: UInt): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun pthreadSetspecific(key: UInt, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit requires N-API addon")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires N-API addon")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires N-API addon")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires N-API addon")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires N-API addon")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires N-API addon")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires N-API addon")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires N-API addon")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires N-API addon")

public actual fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadSetnameNp(thread: ULong, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt requires N-API addon")

public actual fun raise(signum: Int): Int =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction requires N-API addon")

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

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int =
    throw UnsupportedOperationException("dladdr requires N-API addon")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getaddrinfo requires N-API addon")

public actual fun freeaddrinfo(res: Addrinfo?): Unit = throw UnsupportedOperationException("freeaddrinfo requires N-API addon")

public actual fun gaiStrerror(errcode: Int): String? =
    throw UnsupportedOperationException("gaiStrerror requires N-API addon")

public actual fun resInit(): Int =
    throw UnsupportedOperationException("resInit requires N-API addon")

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

public actual fun mknod(pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknod requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun gethostname(name: String?, len: ULong): Int =
    run {
        LibcNative.gethostname()
        0
    }

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires N-API addon")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires N-API addon")

public actual fun getprotobynumber(proto: Int): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires N-API addon")

public actual fun usleep(secs: UInt): Int =
    throw UnsupportedOperationException("usleep requires N-API addon")

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send requires N-API addon")

public actual fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv requires N-API addon")

public actual fun putenv(string: String?): Int =
    throw UnsupportedOperationException("putenv requires N-API addon")

public actual fun poll(fds: Pollfd?, nfds: ULong, timeout: Int): Int =
    throw UnsupportedOperationException("poll requires N-API addon")

public actual fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int =
    throw UnsupportedOperationException("select requires N-API addon")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires N-API addon")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semWait(sem: SemT?): Int =
    throw UnsupportedOperationException("semWait requires N-API addon")

public actual fun semTrywait(sem: SemT?): Int =
    throw UnsupportedOperationException("semTrywait requires N-API addon")

public actual fun semPost(sem: SemT?): Int =
    throw UnsupportedOperationException("semPost requires N-API addon")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun statvfs(path: String?, buf: Statvfs?): Int =
    throw UnsupportedOperationException("statvfs requires N-API addon")

public actual fun fstatvfs(fd: Int, buf: Statvfs?): Int =
    throw UnsupportedOperationException("fstatvfs requires N-API addon")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): Long =
    throw UnsupportedOperationException("readlink requires N-API addon")

public actual fun sigemptyset(set: SigsetT?): Int =
    throw UnsupportedOperationException("sigemptyset requires N-API addon")

public actual fun sigaddset(set: SigsetT?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset requires N-API addon")

public actual fun sigfillset(set: SigsetT?): Int =
    throw UnsupportedOperationException("sigfillset requires N-API addon")

public actual fun sigdelset(set: SigsetT?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset requires N-API addon")

public actual fun sigismember(set: SigsetT?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember requires N-API addon")

public actual fun sigprocmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("sigprocmask requires N-API addon")

public actual fun sigpending(set: SigsetT?): Int =
    throw UnsupportedOperationException("sigpending requires N-API addon")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm requires N-API addon")

public actual fun getsid(pid: Int): Int =
    throw UnsupportedOperationException("getsid requires N-API addon")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf requires N-API addon")

public actual fun mkfifo(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifo requires N-API addon")

public actual fun pselect(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("pselect requires N-API addon")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko requires N-API addon")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello requires N-API addon")

public actual fun tcdrain(fd: Int): Int =
    throw UnsupportedOperationException("tcdrain requires N-API addon")

public actual fun cfmakeraw(termios: Termios?): Unit = throw UnsupportedOperationException("cfmakeraw requires N-API addon")

public actual fun cfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetispeed requires N-API addon")

public actual fun cfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetospeed requires N-API addon")

public actual fun cfsetspeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetspeed requires N-API addon")

public actual fun tcgetattr(fd: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcgetattr requires N-API addon")

public actual fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcsetattr requires N-API addon")

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

public actual fun grantpt(fd: Int): Int =
    throw UnsupportedOperationException("grantpt requires N-API addon")

public actual fun posixOpenpt(flags: Int): Int =
    throw UnsupportedOperationException("posixOpenpt requires N-API addon")

public actual fun ptsname(fd: Int): String? =
    throw UnsupportedOperationException("ptsname requires N-API addon")

public actual fun unlockpt(fd: Int): Int =
    throw UnsupportedOperationException("unlockpt requires N-API addon")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun pthreadGetattrNp(native: ULong, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun setgroups(ngroups: ULong, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun fdopendir(fd: Int): DIR? =
    throw UnsupportedOperationException("fdopendir requires N-API addon")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun clearenv(): Int =
    throw UnsupportedOperationException("clearenv requires N-API addon")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun setreuid(ruid: UInt, euid: UInt): Int =
    throw UnsupportedOperationException("setreuid requires N-API addon")

public actual fun setregid(rgid: UInt, egid: UInt): Int =
    throw UnsupportedOperationException("setregid requires N-API addon")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid requires N-API addon")

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid requires N-API addon")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct requires N-API addon")

public actual fun brk(addr: COpaquePointer?): Int =
    throw UnsupportedOperationException("brk requires N-API addon")

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid requires N-API addon")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid requires N-API addon")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent requires N-API addon")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent requires N-API addon")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun semget(key: Int, nsems: Int, semflag: Int): Int =
    throw UnsupportedOperationException("semget requires N-API addon")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop requires N-API addon")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl requires N-API addon")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl requires N-API addon")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget requires N-API addon")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long =
    throw UnsupportedOperationException("msgrcv requires N-API addon")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate requires N-API addon")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun readahead(fd: Int, offset: Long, count: ULong): Long =
    throw UnsupportedOperationException("readahead requires N-API addon")

public actual fun signalfd(fd: Int, mask: SigsetT?, flags: Int): Int =
    throw UnsupportedOperationException("signalfd requires N-API addon")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate requires N-API addon")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime requires N-API addon")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun quotactl(cmd: Int, special: String?, id: Int, data: String?): Int =
    throw UnsupportedOperationException("quotactl requires N-API addon")

public actual fun dup3(oldfd: Int, newfd: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun mkostemp(template: String?, flags: Int): Int =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun reboot(howTo: Int): Int =
    throw UnsupportedOperationException("reboot requires N-API addon")

public actual fun setfsgid(gid: UInt): Int =
    throw UnsupportedOperationException("setfsgid requires N-API addon")

public actual fun setfsuid(uid: UInt): Int =
    throw UnsupportedOperationException("setfsuid requires N-API addon")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires N-API addon")

public actual fun syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: UInt): Int =
    throw UnsupportedOperationException("syncFileRange requires N-API addon")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs requires N-API addon")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs requires N-API addon")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires N-API addon")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes requires N-API addon")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun getdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun setdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun vhangup(): Int =
    throw UnsupportedOperationException("vhangup requires N-API addon")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires N-API addon")

public actual fun syscall(num: Long, vararg args: Any?): Long =
    throw UnsupportedOperationException("syscall requires N-API addon")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires N-API addon")

public actual fun umount(target: String?): Int =
    throw UnsupportedOperationException("umount requires N-API addon")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun tee(fdIn: Int, fdOut: Int, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("tee requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun splice(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("splice requires N-API addon")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd requires N-API addon")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun swapoff(puath: String?): Int =
    throw UnsupportedOperationException("swapoff requires N-API addon")

public actual fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("vmsplice requires N-API addon")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun personality(persona: ULong): Int =
    throw UnsupportedOperationException("personality requires N-API addon")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun ppoll(fds: Pollfd?, nfds: ULong, timeout: Timespec?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("ppoll requires N-API addon")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires N-API addon")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun umount2(target: String?, flags: Int): Int =
    throw UnsupportedOperationException("umount2 requires N-API addon")

public actual fun swapon(path: String?, swapflags: Int): Int =
    throw UnsupportedOperationException("swapon requires N-API addon")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun sigsuspend(mask: SigsetT?): Int =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun initgroups(user: String?, group: UInt): Int =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun pthreadCancel(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadKill(thread: ULong, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun sigwait(set: SigsetT?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat requires N-API addon")
