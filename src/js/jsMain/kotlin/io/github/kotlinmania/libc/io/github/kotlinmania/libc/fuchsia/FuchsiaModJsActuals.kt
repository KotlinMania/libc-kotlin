package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.COpaquePointer

public actual fun isalnum(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isalnum(c)") as CInt

public actual fun isalpha(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isalpha(c)") as CInt

public actual fun iscntrl(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').iscntrl(c)") as CInt

public actual fun isdigit(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isdigit(c)") as CInt

public actual fun isgraph(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isgraph(c)") as CInt

public actual fun islower(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').islower(c)") as CInt

public actual fun isprint(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isprint(c)") as CInt

public actual fun ispunct(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ispunct(c)") as CInt

public actual fun isspace(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isspace(c)") as CInt

public actual fun isupper(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isupper(c)") as CInt

public actual fun isxdigit(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isxdigit(c)") as CInt

public actual fun isblank(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isblank(c)") as CInt

public actual fun tolower(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tolower(c)") as CInt

public actual fun toupper(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').toupper(c)") as CInt

public actual fun fopen(filename: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fopen(filename, mode)") as FILE?

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').freopen(filename, mode, file?.toLong() ?: 0L)") as FILE?

public actual fun fflush(file: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fflush(file?.toLong() ?: 0L)") as CInt

public actual fun fclose(file: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fclose(file?.toLong() ?: 0L)") as CInt

public actual fun remove(filename: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').remove(filename)") as CInt

public actual fun rename(oldname: String?, newname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rename(oldname, newname)") as CInt

public actual fun tmpfile(): FILE? =
    js("require('@kotlinmania/libc-native-bindings').tmpfile()") as FILE?

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)") as CInt

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').setbuf(stream?.toLong() ?: 0L, buf?.value ?: 0L)")
}

public actual fun getchar(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getchar()") as CInt

public actual fun putchar(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putchar(c)") as CInt

public actual fun fgetc(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetc(stream?.toLong() ?: 0L)") as CInt

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').fgets(buf?.value ?: 0L, n, stream?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputc(c, stream?.toLong() ?: 0L)") as CInt

public actual fun fputs(s: String?, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputs(s, stream?.toLong() ?: 0L)") as CInt

public actual fun puts(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').puts(s)") as CInt

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ungetc(c, stream?.toLong() ?: 0L)") as CInt

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fread(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)") as SizeT

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fwrite(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)") as SizeT

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseek(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun ftell(stream: FILE?): CLong =
    js("require('@kotlinmania/libc-native-bindings').ftell(stream?.toLong() ?: 0L)") as CLong

public actual fun rewind(stream: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').rewind(stream?.toLong() ?: 0L)")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun feof(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').feof(stream?.toLong() ?: 0L)") as CInt

public actual fun ferror(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ferror(stream?.toLong() ?: 0L)") as CInt

public actual fun perror(s: String?) {
    js("require('@kotlinmania/libc-native-bindings').perror(s)")
}

public actual fun atof(s: String?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').atof(s)") as CDouble

public actual fun atoi(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').atoi(s)") as CInt

public actual fun atol(s: String?): CLong =
    js("require('@kotlinmania/libc-native-bindings').atol(s)") as CLong

public actual fun atoll(s: String?): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').atoll(s)") as CLonglong

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').strtod(s, endp?.value ?: 0L)") as CDouble

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    js("require('@kotlinmania/libc-native-bindings').strtof(s, endp?.value ?: 0L)") as CFloat

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').strtol(s, endp?.value ?: 0L, base)") as CLong

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoll(s, endp?.value ?: 0L, base)") as CLonglong

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    js("require('@kotlinmania/libc-native-bindings').strtoul(s, endp?.value ?: 0L, base)") as CUlong

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoull(s, endp?.value ?: 0L, base)") as CUlonglong

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').calloc(nobj, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').malloc(size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realloc(p?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').free(p?.value ?: 0L)")
}

public actual fun abort(): Nothing =
    js("require('@kotlinmania/libc-native-bindings').abort()") as Nothing

public actual fun exit(status: CInt): Nothing =
    js("require('@kotlinmania/libc-native-bindings').exit(status)") as Nothing

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').atexit(cb)") as CInt

public actual fun system(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').system(s)") as CInt

public actual fun getenv(s: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getenv(s)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcpy(dst?.value ?: 0L, src)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncpy(dst?.value ?: 0L, src, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcat(s?.value ?: 0L, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncat(s?.value ?: 0L, ct, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcmp(cs, ct)") as CInt

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncmp(cs, ct, n)") as CInt

public actual fun strcoll(cs: String?, ct: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcoll(cs, ct)") as CInt

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strchr(cs, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strrchr(cs, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strspn(cs, ct)") as SizeT

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strcspn(cs, ct)") as SizeT

public actual fun strdup(cs: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strdup(cs)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strpbrk(cs, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strstr(cs, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(cs: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlen(cs)") as SizeT

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strnlen(cs, maxlen)") as SizeT

public actual fun strerror(n: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strerror(n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strtok(s?.value ?: 0L, t)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strxfrm(s?.value ?: 0L, ct, n)") as SizeT

public actual fun wcslen(buf: WcharT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcslen(buf?.toLong() ?: 0L)") as SizeT

public actual fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcstombs(dest?.value ?: 0L, src?.toLong() ?: 0L, n)") as SizeT

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    js("require('@kotlinmania/libc-native-bindings').wmemchr(cx?.toLong() ?: 0L, c, n)") as WcharT?

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)") as CInt

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memcpy(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmove(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memset(dest?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun getpwnam(name: String?): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwnam(name)") as Passwd?

public actual fun getpwuid(uid: io.github.kotlinmania.libc.UidT): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwuid(uid)") as Passwd?

public actual fun getcharUnlocked(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getcharUnlocked()") as CInt

public actual fun putcharUnlocked(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putcharUnlocked(c)") as CInt

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').socket(domain, ty, protocol)") as CInt

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').connect(socket, address?.toLong() ?: 0L, len)") as CInt

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').listen(socket, backlog)") as CInt

public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)") as CInt

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpeername(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)") as CInt

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsockname(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)") as CInt

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setsockopt(socket, level, name, value?.value ?: 0L, optionLen)") as CInt

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').socketpair(domain, type, protocol, socketVector?.toLong() ?: 0L)") as CInt

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendto(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen)") as SsizeT

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shutdown(socket, how)") as CInt

public actual fun chmod(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').chmod(path, mode)") as CInt

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchmod(fd, mode)") as CInt

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkdir(path, mode)") as CInt

public actual fun stat(path: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat(path, buf?.toLong() ?: 0L)") as CInt

public actual fun pclose(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pclose(stream?.toLong() ?: 0L)") as CInt

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fdopen(fd, mode)") as FILE?

public actual fun fileno(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fileno(stream?.toLong() ?: 0L)") as CInt

public actual fun creat(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat(path, mode)") as CInt

public actual fun opendir(dirname: String?): DIR? =
    js("require('@kotlinmania/libc-native-bindings').opendir(dirname)") as DIR?

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    js("require('@kotlinmania/libc-native-bindings').readdir(dirp?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Dirent?

public actual fun readdirR(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').readdirR(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)") as CInt

public actual fun closedir(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').closedir(dirp?.toLong() ?: 0L)") as CInt

public actual fun rewinddir(dirp: DIR?) {
    js("require('@kotlinmania/libc-native-bindings').rewinddir(dirp?.toLong() ?: 0L)")
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchmodat(dirfd, pathname, mode, flags)") as CInt

public actual fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchown(fd, owner, group)") as CInt

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchownat(dirfd, pathname, owner, group, flags)") as CInt

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatat(dirfd, pathname, buf?.toLong() ?: 0L, flags)") as CInt

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').linkat(olddirfd, oldpath, newdirfd, newpath, flags)") as CInt

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkdirat(dirfd, pathname, mode)") as CInt

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readlinkat(dirfd, pathname, buf?.value ?: 0L, bufsiz)") as SsizeT

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').renameat(olddirfd, oldpath, newdirfd, newpath)") as CInt

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').symlinkat(target, newdirfd, linkpath)") as CInt

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlinkat(dirfd, pathname, flags)") as CInt

public actual fun access(path: String?, amode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').access(path, amode)") as CInt

public actual fun alarm(seconds: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').alarm(seconds)") as CUint

public actual fun chdir(dir: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').chdir(dir)") as CInt

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').chown(path, uid, gid)") as CInt

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').lchown(path, uid, gid)") as CInt

public actual fun close(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').close(fd)") as CInt

public actual fun dup(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup(fd)") as CInt

public actual fun dup2(src: CInt, dst: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup2(src, dst)") as CInt

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execv(prog, argv?.value ?: 0L)") as CInt

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execve(prog, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvp(c, argv?.value ?: 0L)") as CInt

public actual fun fork(): PidT =
    js("require('@kotlinmania/libc-native-bindings').fork()") as PidT

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').fpathconf(filedes, name)") as CLong

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getcwd(buf?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getegid(): GidT =
    js("require('@kotlinmania/libc-native-bindings').getegid()") as GidT

public actual fun geteuid(): UidT =
    js("require('@kotlinmania/libc-native-bindings').geteuid()") as UidT

public actual fun getgid(): GidT =
    js("require('@kotlinmania/libc-native-bindings').getgid()") as GidT

public actual fun getgroups(ngroupsMax: CInt, groups: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgroups(ngroupsMax, groups?.toLong() ?: 0L)") as CInt

public actual fun getlogin(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getlogin()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getopt(argc, argv?.value ?: 0L, optstr)") as CInt

public actual fun getpgid(pid: PidT): PidT =
    js("require('@kotlinmania/libc-native-bindings').getpgid(pid)") as PidT

public actual fun getpgrp(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getpgrp()") as PidT

public actual fun getpid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getpid()") as PidT

public actual fun getppid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getppid()") as PidT

public actual fun getuid(): UidT =
    js("require('@kotlinmania/libc-native-bindings').getuid()") as UidT

public actual fun isatty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isatty(fd)") as CInt

public actual fun link(src: String?, dst: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').link(src, dst)") as CInt

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    js("require('@kotlinmania/libc-native-bindings').lseek(fd, offset, whence)") as OffT

public actual fun pathconf(path: String?, name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').pathconf(path, name)") as CLong

public actual fun pause(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pause()") as CInt

public actual fun pipe(fds: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe(fds?.toLong() ?: 0L)") as CInt

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMemalign(memptr?.value ?: 0L, align, size)") as CInt

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').read(fd, buf?.value ?: 0L, count)") as SsizeT

public actual fun rmdir(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rmdir(path)") as CInt

public actual fun seteuid(uid: UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').seteuid(uid)") as CInt

public actual fun setegid(gid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setegid(gid)") as CInt

public actual fun setgid(gid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgid(gid)") as CInt

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpgid(pid, pgid)") as CInt

public actual fun setsid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').setsid()") as PidT

public actual fun setuid(uid: UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setuid(uid)") as CInt

public actual fun sleep(secs: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').sleep(secs)") as CUint

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').nanosleep(rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun tcgetpgrp(fd: CInt): PidT =
    js("require('@kotlinmania/libc-native-bindings').tcgetpgrp(fd)") as PidT

public actual fun tcsetpgrp(fd: CInt, pgrp: io.github.kotlinmania.libc.PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcsetpgrp(fd, pgrp)") as CInt

public actual fun ttyname(fd: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ttyname(fd)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unlink(c: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlink(c)") as CInt

public actual fun wait(status: CInt?): PidT =
    js("require('@kotlinmania/libc-native-bindings').wait(status?.toLong() ?: 0L)") as PidT

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    js("require('@kotlinmania/libc-native-bindings').waitpid(pid, status?.toLong() ?: 0L, options)") as PidT

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').write(fd, buf?.value ?: 0L, count)") as SsizeT

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pread(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwrite(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun umask(mask: ModeT): ModeT =
    js("require('@kotlinmania/libc-native-bindings').umask(mask)") as ModeT

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utime(file, buf?.toLong() ?: 0L)") as CInt

public actual fun kill(pid: PidT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').kill(pid, sig)") as CInt

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlock(addr?.value ?: 0L, len)") as CInt

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').munlock(addr?.value ?: 0L, len)") as CInt

public actual fun mlockall(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlockall(flags)") as CInt

public actual fun munlockall(): CInt =
    js("require('@kotlinmania/libc-native-bindings').munlockall()") as CInt

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mmap(addr?.value ?: 0L, len, prot, flags, fd, offset)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').munmap(addr?.value ?: 0L, len)") as CInt

public actual fun ifNametoindex(ifname: String?): CUint =
    js("require('@kotlinmania/libc-native-bindings').ifNametoindex(ifname)") as CUint

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ifIndextoname(ifindex, ifname?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstat(path: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lstat(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fsync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsync(fd)") as CInt

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setenv(name, value, overwrite)") as CInt

public actual fun unsetenv(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unsetenv(name)") as CInt

public actual fun symlink(path1: String?, path2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').symlink(path1, path2)") as CInt

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftruncate(fd, length)") as CInt

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    js("require('@kotlinmania/libc-native-bindings').signal(signum, handler)") as SighandlerT

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realpath(pathname, resolved?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun flock(fd: CInt, operation: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').flock(fd, operation)") as CInt

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    js("require('@kotlinmania/libc-native-bindings').times(buf?.toLong() ?: 0L)") as io.github.kotlinmania.libc.ClockT

public actual fun pthreadSelf(): io.github.kotlinmania.libc.PthreadT =
    js("require('@kotlinmania/libc-native-bindings').pthreadSelf()") as io.github.kotlinmania.libc.PthreadT

public actual fun pthreadJoin(native: io.github.kotlinmania.libc.PthreadT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadJoin(native, value?.value ?: 0L)") as CInt

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    js("require('@kotlinmania/libc-native-bindings').pthreadExit(value?.value ?: 0L)") as Nothing

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrDestroy(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stacksize: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstacksize(attr?.toLong() ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackSize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stackSize)") as CInt

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.PthreadAttrT?, state: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, state)") as CInt

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadDetach(thread)") as CInt

public actual fun schedYield(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedYield()") as CInt

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)") as CInt

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyDelete(key)") as CInt

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetspecific(key)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetspecific(key, value?.value ?: 0L)") as CInt

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSettype(attr?.toLong() ?: 0L, type)") as CInt

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondWait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondTimedwait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondSignal(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondBroadcast(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondDestroy(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockRdlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTryrdlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockWrlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTrywrlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(thread, name?.value ?: 0L, len)") as CInt

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(thread, name)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)") as CInt

public actual fun raise(signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').raise(signum)") as CInt

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaction(signum, act?.toLong() ?: 0L, oldact?.toLong() ?: 0L)") as CInt

public actual fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimes(filename, times?.toLong() ?: 0L)") as CInt

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlopen(filename, flag)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlerror()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlsym(handle?.value ?: 0L, symbol)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlclose(handle?.value ?: 0L)") as CInt

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dladdr(addr?.value ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getaddrinfo(node, service, hints?.toLong() ?: 0L, res?.value ?: 0L)") as CInt

public actual fun freeaddrinfo(res: Addrinfo?) {
    js("require('@kotlinmania/libc-native-bindings').freeaddrinfo(res?.toLong() ?: 0L)")
}

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gaiStrerror(errcode)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resInit(): CInt =
    js("require('@kotlinmania/libc-native-bindings').resInit()") as CInt

public actual fun gmtimeR(timeP: CLong?, result: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)") as Tm?

public actual fun localtimeR(timeP: CLong?, result: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)") as Tm?

public actual fun mktime(tm: Tm?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').mktime(tm?.toLong() ?: 0L)") as TimeT

public actual fun time(time: CLong?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').time(time?.toLong() ?: 0L)") as TimeT

public actual fun gmtime(timeP: CLong?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtime(timeP?.toLong() ?: 0L)") as Tm?

public actual fun localtime(timeP: CLong?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtime(timeP?.toLong() ?: 0L)") as Tm?

public actual fun mknod(pathname: String?, mode: ModeT, dev: io.github.kotlinmania.libc.DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknod(pathname, mode, dev)") as CInt

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').gethostname(name?.value ?: 0L, len)") as CInt

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    js("require('@kotlinmania/libc-native-bindings').getservbyname(name, proto)") as Servent?

public actual fun getprotobyname(name: String?): Protoent? =
    js("require('@kotlinmania/libc-native-bindings').getprotobyname(name)") as Protoent?

public actual fun getprotobynumber(proto: CInt): Protoent? =
    js("require('@kotlinmania/libc-native-bindings').getprotobynumber(proto)") as Protoent?

public actual fun usleep(secs: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').usleep(secs)") as CInt

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').send(socket, buf?.value ?: 0L, len, flags)") as SsizeT

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recv(socket, buf?.value ?: 0L, len, flags)") as SsizeT

public actual fun putenv(string: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putenv(string?.value ?: 0L)") as CInt

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').poll(fds?.toLong() ?: 0L, nfds, timeout)") as CInt

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').select(nfds, readfds?.toLong() ?: 0L, writefds?.toLong() ?: 0L, errorfds?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').setlocale(category, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): Lconv? =
    js("require('@kotlinmania/libc-native-bindings').localeconv()") as Lconv?

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semWait(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semWait(sem?.toLong() ?: 0L)") as CInt

public actual fun semTrywait(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTrywait(sem?.toLong() ?: 0L)") as CInt

public actual fun semPost(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semPost(sem?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statvfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatvfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readlink(path, buf?.value ?: 0L, bufsz)") as SsizeT

public actual fun sigemptyset(set: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigemptyset(set?.toLong() ?: 0L)") as CInt

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaddset(set?.toLong() ?: 0L, signum)") as CInt

public actual fun sigfillset(set: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigfillset(set?.toLong() ?: 0L)") as CInt

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigdelset(set?.toLong() ?: 0L, signum)") as CInt

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigismember(set?.toLong() ?: 0L, signum)") as CInt

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigprocmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun sigpending(set: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigpending(set?.toLong() ?: 0L)") as CInt

public actual fun timegm(tm: io.github.kotlinmania.libc.Tm?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').timegm(tm?.toLong() ?: 0L)") as TimeT

public actual fun getsid(pid: PidT): PidT =
    js("require('@kotlinmania/libc-native-bindings').getsid(pid)") as PidT

public actual fun sysconf(name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').sysconf(name)") as CLong

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifo(path, mode)") as CInt

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pselect(nfds, readfds?.toLong() ?: 0L, writefds?.toLong() ?: 0L, errorfds?.toLong() ?: 0L, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseeko(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun ftello(stream: FILE?): OffT =
    js("require('@kotlinmania/libc-native-bindings').ftello(stream?.toLong() ?: 0L)") as OffT

public actual fun tcdrain(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcdrain(fd)") as CInt

public actual fun cfgetispeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    js("require('@kotlinmania/libc-native-bindings').cfgetispeed(termios?.toLong() ?: 0L)") as io.github.kotlinmania.libc.SpeedT

public actual fun cfgetospeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    js("require('@kotlinmania/libc-native-bindings').cfgetospeed(termios?.toLong() ?: 0L)") as io.github.kotlinmania.libc.SpeedT

public actual fun cfmakeraw(termios: io.github.kotlinmania.libc.Termios?) {
    js("require('@kotlinmania/libc-native-bindings').cfmakeraw(termios?.toLong() ?: 0L)")
}

public actual fun cfsetispeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    js("require('@kotlinmania/libc-native-bindings').cfsetispeed(termios?.toLong() ?: 0L, speed)") as CInt

public actual fun cfsetospeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    js("require('@kotlinmania/libc-native-bindings').cfsetospeed(termios?.toLong() ?: 0L, speed)") as CInt

public actual fun cfsetspeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    js("require('@kotlinmania/libc-native-bindings').cfsetspeed(termios?.toLong() ?: 0L, speed)") as CInt

public actual fun tcgetattr(fd: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcgetattr(fd, termios?.toLong() ?: 0L)") as CInt

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcsetattr(fd, optionalActions, termios?.toLong() ?: 0L)") as CInt

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcflow(fd, action)") as CInt

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcflush(fd, action)") as CInt

public actual fun tcgetsid(fd: CInt): io.github.kotlinmania.libc.PidT =
    js("require('@kotlinmania/libc-native-bindings').tcgetsid(fd)") as io.github.kotlinmania.libc.PidT

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcsendbreak(fd, duration)") as CInt

public actual fun mkstemp(template: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemp(template?.value ?: 0L)") as CInt

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mkdtemp(template?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').tmpnam(ptr?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    js("require('@kotlinmania/libc-native-bindings').openlog(ident, logopt, facility)")
}

public actual fun closelog() {
    js("require('@kotlinmania/libc-native-bindings').closelog()")
}

public actual fun setlogmask(maskpri: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setlogmask(maskpri)") as CInt

public actual fun grantpt(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').grantpt(fd)") as CInt

public actual fun posixOpenpt(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixOpenpt(flags)") as CInt

public actual fun ptsname(fd: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ptsname(fd)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unlockpt(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlockpt(fd)") as CInt

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetattrNp(native: io.github.kotlinmania.libc.PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetattrNp(native, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: SizeT, ptr: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgroups(ngroups, ptr?.toLong() ?: 0L)") as CInt

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe2(fds?.toLong() ?: 0L, flags)") as CInt

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memrchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advise)") as CInt

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as io.github.kotlinmania.libc.LocaleT

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as io.github.kotlinmania.libc.LocaleT

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as io.github.kotlinmania.libc.LocaleT

public actual fun fdopendir(fd: CInt): DIR? =
    js("require('@kotlinmania/libc-native-bindings').fdopendir(fd)") as DIR?

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun accept4(fd: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, len: UInt?, flg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept4(fd, addr?.toLong() ?: 0L, len?.toLong() ?: 0L, flg)") as CInt

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptsnameR(fd, buf?.value ?: 0L, buflen)") as CInt

public actual fun clearenv(): CInt =
    js("require('@kotlinmania/libc-native-bindings').clearenv()") as CInt

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun setreuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setreuid(ruid, euid)") as CInt

public actual fun setregid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setregid(rgid, egid)") as CInt

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)") as CInt

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)") as CInt

public actual fun acct(filename: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').acct(filename)") as CInt

public actual fun brk(addr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').brk(addr?.value ?: 0L)") as CInt

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresgid(rgid, egid, sgid)") as CInt

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresuid(ruid, euid, suid)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: io.github.kotlinmania.libc.Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun lutimes(file: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lutimes(file, times?.toLong() ?: 0L)") as CInt

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun getpwent(): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as Passwd?

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun shmget(key: io.github.kotlinmania.libc.KeyT, size: SizeT, shmflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmget(key, size, shmflg)") as CInt

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').shmat(shmid, shmaddr?.value ?: 0L, shmflg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmdt(shmaddr?.value ?: 0L)") as CInt

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmctl(shmid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    js("require('@kotlinmania/libc-native-bindings').ftok(pathname, projId)") as io.github.kotlinmania.libc.KeyT

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').semget(key, nsems, semflag)") as CInt

public actual fun semop(semid: CInt, sops: io.github.kotlinmania.libc.Sembuf?, nsops: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').semop(semid, sops?.toLong() ?: 0L, nsops)") as CInt

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgctl(msqid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgget(key, msgflg)") as CInt

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)") as SsizeT

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun errnoLocation(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnoLocation()") as CInt?

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fallocate(fd, mode, offset, len)") as CInt

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readahead(fd, offset, count)") as SsizeT

public actual fun signalfd(fd: CInt, mask: io.github.kotlinmania.libc.SigsetT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalfd(fd, mask?.toLong() ?: 0L, flags)") as CInt

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdCreate(clockid, flags)") as CInt

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdGettime(fd, currValue?.toLong() ?: 0L)") as CInt

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun pwritev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun preadv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').quotactl(cmd, special, id, data?.value ?: 0L)") as CInt

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup3(oldfd, newfd, flags)") as CInt

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemp(template?.value ?: 0L, flags)") as CInt

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemps(template?.value ?: 0L, suffixlen, flags)") as CInt

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfoL(item, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun reboot(howTo: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').reboot(howTo)") as CInt

public actual fun setfsgid(gid: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setfsgid(gid)") as CInt

public actual fun setfsuid(uid: io.github.kotlinmania.libc.UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setfsuid(uid)") as CInt

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun ifNameindex(): IfNameindex? =
    js("require('@kotlinmania/libc-native-bindings').ifNameindex()") as IfNameindex?

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    js("require('@kotlinmania/libc-native-bindings').ifFreenameindex(ptr?.toLong() ?: 0L)")
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncFileRange(fd, offset, nbytes, flags)") as CInt

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getifaddrs(ifap?.value ?: 0L)") as CInt

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    js("require('@kotlinmania/libc-native-bindings').freeifaddrs(ifa?.toLong() ?: 0L)")
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    js("require('@kotlinmania/libc-native-bindings').globfree(pglob?.toLong() ?: 0L)")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMadvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemps(template?.value ?: 0L, suffixlen)") as CInt

public actual fun futimes(fd: CInt, times: io.github.kotlinmania.libc.Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimes(fd, times?.toLong() ?: 0L)") as CInt

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(socket, address?.toLong() ?: 0L, addressLen)") as CInt

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdomainname(name?.value ?: 0L, len)") as CInt

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setdomainname(name, len)") as CInt

public actual fun vhangup(): CInt =
    js("require('@kotlinmania/libc-native-bindings').vhangup()") as CInt

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)") as CInt

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun schedGetaffinity(pid: io.github.kotlinmania.libc.PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun schedSetaffinity(pid: io.github.kotlinmania.libc.PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun umount(target: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').umount(target)") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').tee(fdIn, fdOut, len, flags)") as SsizeT

public actual fun settimeofday(tv: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').splice(fdIn, offIn?.toLong() ?: 0L, fdOut, offOut?.toLong() ?: 0L, len, flags)") as SsizeT

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfd(initval, flags)") as CInt

public actual fun schedRrGetInterval(pid: io.github.kotlinmania.libc.PidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedRrGetInterval(pid, tp?.toLong() ?: 0L)") as CInt

public actual fun semTimedwait(sem: SemT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun swapoff(puath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapoff(puath)") as CInt

public actual fun vmsplice(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').vmsplice(fd, iov?.toLong() ?: 0L, nrSegs, flags)") as SsizeT

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mount(src, target, fstype, flags, data?.value ?: 0L)") as CInt

public actual fun personality(persona: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').personality(persona)") as CInt

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun ppoll(fds: io.github.kotlinmania.libc.Pollfd?, nfds: NfdsT, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)") as CInt

public actual fun sethostname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt

public actual fun umount2(target: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').umount2(target, flags)") as CInt

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapon(path, swapflags)") as CInt

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: io.github.kotlinmania.libc.Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun semClose(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getgrnamR(name: String?, grp: io.github.kotlinmania.libc.Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun initgroups(user: String?, group: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(user, group)") as CInt

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun getgrnam(name: String?): io.github.kotlinmania.libc.Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as io.github.kotlinmania.libc.Group?

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCancel(thread)") as CInt

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): io.github.kotlinmania.libc.Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as io.github.kotlinmania.libc.Group?

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrent(): io.github.kotlinmania.libc.Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as io.github.kotlinmania.libc.Group?

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: UInt?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun pthreadCreate(native: CUlong?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt
