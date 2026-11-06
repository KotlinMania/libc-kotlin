package io.github.kotlinmania.libc.vxworks

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

public actual fun atexit(cb: AtexitCbCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').atexit(cb)") as CInt

public actual fun system(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').system(s)") as CInt

public actual fun getenv(s: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getenv(s)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cfgetospeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    js("require('@kotlinmania/libc-native-bindings').cfgetospeed(termios?.toLong() ?: 0L)") as io.github.kotlinmania.libc.SpeedT

public actual fun cfmakeraw(termios: io.github.kotlinmania.libc.Termios?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cfmakeraw(termios?.toLong() ?: 0L)") as CInt

public actual fun cfsetispeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    js("require('@kotlinmania/libc-native-bindings').cfsetispeed(termios?.toLong() ?: 0L, speed)") as CInt

public actual fun cfsetospeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    js("require('@kotlinmania/libc-native-bindings').cfsetospeed(termios?.toLong() ?: 0L, speed)") as CInt

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

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcasecmp(s1, s2)") as CInt

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncasecmp(s1, s2, n)") as CInt

public actual fun strlen(cs: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlen(cs)") as SizeT

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strnlen(cs, n)") as SizeT

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

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memccpy(dest?.value ?: 0L, src?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmove(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memset(dest?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').alignedAlloc(alignment, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    js("require('@kotlinmania/libc-native-bindings').times(buf?.toLong() ?: 0L)") as io.github.kotlinmania.libc.ClockT

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcflush(fd, action)") as CInt

public actual fun pclose(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pclose(stream?.toLong() ?: 0L)") as CInt

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mkdtemp(template?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').linkat(olddirfd, oldpath, newdirfd, newpath, flags)") as CInt

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlinkat(dirfd, pathname, flags)") as CInt

public actual fun getprotobyname(name: String?): Protoent? =
    js("require('@kotlinmania/libc-native-bindings').getprotobyname(name)") as Protoent?

public actual fun getprotobynumber(proto: CInt): Protoent? =
    js("require('@kotlinmania/libc-native-bindings').getprotobynumber(proto)") as Protoent?

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    js("require('@kotlinmania/libc-native-bindings').getservbyname(name, proto)") as Servent?

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchownat(dirfd, pathname, owner, group, flags)") as CInt

public actual fun getcharUnlocked(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getcharUnlocked()") as CInt

public actual fun putcharUnlocked(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putcharUnlocked(c)") as CInt

public actual fun stat(path: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fdopen(fd, mode)") as FILE?

public actual fun fileno(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fileno(stream?.toLong() ?: 0L)") as CInt

public actual fun creat(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat(path, mode)") as CInt

public actual fun rewinddir(dirp: DIR?) {
    js("require('@kotlinmania/libc-native-bindings').rewinddir(dirp?.toLong() ?: 0L)")
}

public actual fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchown(fd, owner, group)") as CInt

public actual fun access(path: String?, amode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').access(path, amode)") as CInt

public actual fun alarm(seconds: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').alarm(seconds)") as CUint

public actual fun fchdir(dirfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchdir(dirfd)") as CInt

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').chown(path, uid, gid)") as CInt

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').fpathconf(filedes, name)") as CLong

public actual fun getegid(): GidT =
    js("require('@kotlinmania/libc-native-bindings').getegid()") as GidT

public actual fun geteuid(): UidT =
    js("require('@kotlinmania/libc-native-bindings').geteuid()") as UidT

public actual fun getgroups(ngroupsMax: CInt, groups: CUshort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgroups(ngroupsMax, groups?.toLong() ?: 0L)") as CInt

public actual fun getlogin(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getlogin()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getopt(argc, argv?.value ?: 0L, optstr)") as CInt

public actual fun pathconf(path: String?, name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').pathconf(path, name)") as CLong

public actual fun pause(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pause()") as CInt

public actual fun seteuid(uid: UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').seteuid(uid)") as CInt

public actual fun setegid(gid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setegid(gid)") as CInt

public actual fun sleep(secs: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').sleep(secs)") as CUint

public actual fun ttyname(fd: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ttyname(fd)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wait(status: CInt?): PidT =
    js("require('@kotlinmania/libc-native-bindings').wait(status?.toLong() ?: 0L)") as PidT

public actual fun umask(mask: ModeT): ModeT =
    js("require('@kotlinmania/libc-native-bindings').umask(mask)") as ModeT

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlock(addr?.value ?: 0L, len)") as CInt

public actual fun mlockall(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlockall(flags)") as CInt

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').munlock(addr?.value ?: 0L, len)") as CInt

public actual fun munlockall(): CInt =
    js("require('@kotlinmania/libc-native-bindings').munlockall()") as CInt

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mmap(addr?.value ?: 0L, len, prot, flags, fd, offset)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').munmap(addr?.value ?: 0L, len)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun truncate(path: String?, length: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').truncate(path, length)") as CInt

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    js("require('@kotlinmania/libc-native-bindings').pthreadExit(value?.value ?: 0L)") as Nothing

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.PthreadAttrT?, state: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, state)") as CInt

public actual fun pthreadEqual(t1: io.github.kotlinmania.libc.PthreadT, t2: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadEqual(t1, t2)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun sigaddset(set: CUlonglong?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaddset(set?.toLong() ?: 0L, signum)") as CInt

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaction(signum, act?.toLong() ?: 0L, oldact?.toLong() ?: 0L)") as CInt

public actual fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimes(filename, times?.toLong() ?: 0L)") as CInt

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

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

public actual fun gmtimeR(timeP: CLonglong?, result: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)") as Tm?

public actual fun localtimeR(timeP: CLonglong?, result: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)") as Tm?

public actual fun mktime(tm: Tm?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').mktime(tm?.toLong() ?: 0L)") as TimeT

public actual fun time(time: CLonglong?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').time(time?.toLong() ?: 0L)") as TimeT

public actual fun gmtime(timeP: CLonglong?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtime(timeP?.toLong() ?: 0L)") as Tm?

public actual fun localtime(timeP: CLonglong?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtime(timeP?.toLong() ?: 0L)") as Tm?

public actual fun timegm(tm: Tm?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').timegm(tm?.toLong() ?: 0L)") as TimeT

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    js("require('@kotlinmania/libc-native-bindings').difftime(time1, time0)") as CDouble

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').gethostname(name?.value ?: 0L, len)") as CInt

public actual fun usleep(secs: io.github.kotlinmania.libc.UsecondsT): CInt =
    js("require('@kotlinmania/libc-native-bindings').usleep(secs)") as CInt

public actual fun putenv(string: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putenv(string?.value ?: 0L)") as CInt

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').setlocale(category, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): Lconv? =
    js("require('@kotlinmania/libc-native-bindings').localeconv()") as Lconv?

public actual fun sigprocmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigprocmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun sigpending(set: CUlonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigpending(set?.toLong() ?: 0L)") as CInt

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifo(path, mode)") as CInt

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseeko(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun ftello(stream: FILE?): OffT =
    js("require('@kotlinmania/libc-native-bindings').ftello(stream?.toLong() ?: 0L)") as OffT

public actual fun mkstemp(template: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemp(template?.value ?: 0L)") as CInt

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

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getline(lineptr?.value ?: 0L, n?.toLong() ?: 0L, stream?.toLong() ?: 0L)") as SsizeT

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcsetattr(fd, optionalActions, termios?.toLong() ?: 0L)") as CInt

public actual fun tcgetattr(fd: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcgetattr(fd, termios?.toLong() ?: 0L)") as CInt

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tcsendbreak(fd, duration)") as CInt

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').confstr(name, buf?.value ?: 0L, len)") as SizeT

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fnmatch(pattern, name, flags)") as CInt

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').symlinkat(target, newdirfd, linkpath)") as CInt

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchmodat(dirfd, pathname, mode, flags)") as CInt

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utime(file, buf?.toLong() ?: 0L)") as CInt

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(blockSize, sizeArg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getcwd(buf?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun chdir(attr: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').chdir(attr)") as CInt

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSettype(pAttr: io.github.kotlinmania.libc.PthreadMutexattrT?, pType: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSettype(pAttr?.toLong() ?: 0L, pType)") as CInt

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexInit(mutex?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexDestroy(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexLock(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTrylock(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(attr?.toLong() ?: 0L, spec?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexUnlock(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetname(pAttr: io.github.kotlinmania.libc.PthreadAttrT?, name: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetname(pAttr?.toLong() ?: 0L, name?.value ?: 0L)") as CInt

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stacksize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stacksize)") as CInt

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, size: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstacksize(attr?.toLong() ?: 0L, size?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCreate(pThread: CUlong?, pAttr: io.github.kotlinmania.libc.PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(pThread?.toLong() ?: 0L, pAttr?.toLong() ?: 0L, startRoutine, value?.value ?: 0L)") as CInt

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.PthreadAttrT?, inheritsched: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetinheritsched(attr?.toLong() ?: 0L, inheritsched)") as CInt

public actual fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.PthreadAttrT?, policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetschedpolicy(attr?.toLong() ?: 0L, policy)") as CInt

public actual fun pthreadAttrDestroy(thread: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrDestroy(thread?.toLong() ?: 0L)") as CInt

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadDetach(thread)") as CInt

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun lstat(path: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lstat(path, buf?.toLong() ?: 0L)") as CInt

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftruncate(fd, length)") as CInt

public actual fun readdirR(pDir: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').readdirR(pDir?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)") as CInt

public actual fun readdir(pDir: DIR?): io.github.kotlinmania.libc.Dirent? =
    js("require('@kotlinmania/libc-native-bindings').readdir(pDir?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Dirent?

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').poll(fds?.toLong() ?: 0L, nfds, timeout)") as CInt

public actual fun pthreadCondattrInit(attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrDestroy(attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrGetclock(pAttr: io.github.kotlinmania.libc.PthreadCondattrT?, pClockId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(pAttr?.toLong() ?: 0L, pClockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(pAttr: io.github.kotlinmania.libc.PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(pAttr?.toLong() ?: 0L, clockId)") as CInt

public actual fun pthreadCondInit(cond: io.github.kotlinmania.libc.PthreadCondT?, attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondDestroy(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondSignal(cond: io.github.kotlinmania.libc.PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondSignal(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondBroadcast(cond: io.github.kotlinmania.libc.PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondBroadcast(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondWait(cond: io.github.kotlinmania.libc.PthreadCondT?, mutex: io.github.kotlinmania.libc.PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondWait(cond?.toLong() ?: 0L, mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrInit(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrDestroy(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetmaxreaders(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, attr2: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetmaxreaders(attr?.toLong() ?: 0L, attr2)") as CInt

public actual fun pthreadRwlockInit(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockInit(attr?.toLong() ?: 0L, host?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockDestroy(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockRdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockRdlock(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTryrdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTryrdlock(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTimedrdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTimedrdlock(attr?.toLong() ?: 0L, host?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockWrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockWrlock(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTrywrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTrywrlock(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTimedwrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTimedwrlock(attr?.toLong() ?: 0L, host?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockUnlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockUnlock(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadKeyCreate(key: CUlong?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)") as CInt

public actual fun pthreadKeyDelete(key: io.github.kotlinmania.libc.PthreadKeyT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyDelete(key)") as CInt

public actual fun pthreadSetspecific(key: io.github.kotlinmania.libc.PthreadKeyT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetspecific(key, value?.value ?: 0L)") as CInt

public actual fun pthreadGetspecific(key: io.github.kotlinmania.libc.PthreadKeyT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetspecific(key)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCondTimedwait(cond: io.github.kotlinmania.libc.PthreadCondT?, mutex: io.github.kotlinmania.libc.PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondTimedwait(cond?.toLong() ?: 0L, mutex?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetname(attr: io.github.kotlinmania.libc.PthreadAttrT?, name: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetname(attr?.toLong() ?: 0L, name?.value ?: 0L)") as CInt

public actual fun pthreadJoin(thread: io.github.kotlinmania.libc.PthreadT, status: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadJoin(thread, status?.value ?: 0L)") as CInt

public actual fun pthreadSelf(): io.github.kotlinmania.libc.PthreadT =
    js("require('@kotlinmania/libc-native-bindings').pthreadSelf()") as io.github.kotlinmania.libc.PthreadT

public actual fun clockGettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGetres(clockId: io.github.kotlinmania.libc.ClockidT, res: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clockId, res?.toLong() ?: 0L)") as CInt

public actual fun clockNanosleep(clockId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clockId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun nanosleep(rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').nanosleep(rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun accept(s: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as CInt

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(fd, addr?.toLong() ?: 0L, len)") as CInt

public actual fun connect(s: CInt, name: io.github.kotlinmania.libc.Sockaddr?, namelen: io.github.kotlinmania.libc.SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').connect(s, name?.toLong() ?: 0L, namelen)") as CInt

public actual fun getpeername(s: CInt, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpeername(s, name?.toLong() ?: 0L, namelen?.toLong() ?: 0L)") as CInt

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsockname(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)") as CInt

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)") as CInt

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').listen(socket, backlog)") as CInt

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recv(s, buf?.value ?: 0L, bufLen, flags)") as SsizeT

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: io.github.kotlinmania.libc.Sockaddr?, pFromLen: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(s, buf?.value ?: 0L, bufLen, flags, from?.toLong() ?: 0L, pFromLen?.toLong() ?: 0L)") as SsizeT

public actual fun recvmsg(socket: CInt, mp: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(socket, mp?.toLong() ?: 0L, flags)") as SsizeT

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').send(socket, buf?.value ?: 0L, len, flags)") as SsizeT

public actual fun sendmsg(socket: CInt, mp: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(socket, mp?.toLong() ?: 0L, flags)") as SsizeT

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendto(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen)") as SsizeT

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setsockopt(socket, level, name, value?.value ?: 0L, optionLen)") as CInt

public actual fun shutdown(s: CInt, how: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shutdown(s, how)") as CInt

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').socket(domain, type, protocol)") as CInt

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gaiStrerror(errcode)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun close(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').close(fd)") as CInt

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').read(fd, buf?.value ?: 0L, count)") as SsizeT

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').write(fd, buf?.value ?: 0L, count)") as SsizeT

public actual fun isatty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isatty(fd)") as CInt

public actual fun dup(src: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup(src)") as CInt

public actual fun dup2(src: CInt, dst: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup2(src, dst)") as CInt

public actual fun pipe(fds: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe(fds?.toLong() ?: 0L)") as CInt

public actual fun unlink(pathname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlink(pathname)") as CInt

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    js("require('@kotlinmania/libc-native-bindings').lseek(fd, offset, whence)") as OffT

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getaddrinfo(node, service, hints?.toLong() ?: 0L, res?.value ?: 0L)") as CInt

public actual fun freeaddrinfo(res: Addrinfo?) {
    js("require('@kotlinmania/libc-native-bindings').freeaddrinfo(res?.toLong() ?: 0L)")
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    js("require('@kotlinmania/libc-native-bindings').signal(signum, handler)") as SighandlerT

public actual fun getpid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getpid()") as PidT

public actual fun getppid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getppid()") as PidT

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    js("require('@kotlinmania/libc-native-bindings').setpgid(pid, pgid)") as PidT

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    js("require('@kotlinmania/libc-native-bindings').waitpid(pid, status?.toLong() ?: 0L, options)") as PidT

public actual fun sysconf(attr: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').sysconf(attr)") as CLong

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setenv(envVarName, envVarValue, overwrite)") as CInt

public actual fun unsetenv(envVarName: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unsetenv(envVarName)") as CInt

public actual fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realpath(fileName, resolvedName?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun link(src: String?, dst: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').link(src, dst)") as CInt

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readlink(path, buf?.value ?: 0L, bufsize)") as SsizeT

public actual fun symlink(path1: String?, path2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').symlink(path1, path2)") as CInt

public actual fun opendir(name: String?): DIR? =
    js("require('@kotlinmania/libc-native-bindings').opendir(name)") as DIR?

public actual fun rmdir(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rmdir(path)") as CInt

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkdir(dirName, mode)") as CInt

public actual fun chmod(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').chmod(path, mode)") as CInt

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchmod(attr1, attr2)") as CInt

public actual fun fsync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsync(fd)") as CInt

public actual fun closedir(ptr: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').closedir(ptr?.toLong() ?: 0L)") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun schedRrGetInterval(pid: io.github.kotlinmania.libc.PidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedRrGetInterval(pid, tp?.toLong() ?: 0L)") as CInt

public actual fun schedYield(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedYield()") as CInt

public actual fun errnoSet(err: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').errnoSet(err)") as CInt

public actual fun errnoGet(): CInt =
    js("require('@kotlinmania/libc-native-bindings').errnoGet()") as CInt

public actual fun setgid(gid: io.github.kotlinmania.libc.GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgid(gid)") as CInt

public actual fun getgid(): io.github.kotlinmania.libc.GidT =
    js("require('@kotlinmania/libc-native-bindings').getgid()") as io.github.kotlinmania.libc.GidT

public actual fun setuid(uid: io.github.kotlinmania.libc.UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setuid(uid)") as CInt

public actual fun getuid(): io.github.kotlinmania.libc.UidT =
    js("require('@kotlinmania/libc-native-bindings').getuid()") as io.github.kotlinmania.libc.UidT

public actual fun sigemptyset(set: CUlonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigemptyset(set?.toLong() ?: 0L)") as CInt

public actual fun sigfillset(set: CUlonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigfillset(set?.toLong() ?: 0L)") as CInt

public actual fun sigdelset(set: CUlonglong?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigdelset(set?.toLong() ?: 0L, signum)") as CInt

public actual fun sigismember(set: CUlonglong?, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigismember(set?.toLong() ?: 0L, signum)") as CInt

public actual fun pthreadSigmask(how: CInt, set: CUlonglong?, oset: CUlonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oset?.toLong() ?: 0L)") as CInt

public actual fun kill(pid: PidT, signo: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').kill(pid, signo)") as CInt

public actual fun sigqueue(pid: PidT, signo: CInt, value: io.github.kotlinmania.libc.Sigval): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigqueue(pid, signo, value)") as CInt

public actual fun taskKill(taskId: io.github.kotlinmania.libc.TaskId, signo: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').taskKill(taskId, signo)") as CInt

public actual fun raise(signo: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').raise(signo)") as CInt

public actual fun taskIdSelf(): io.github.kotlinmania.libc.TaskId =
    js("require('@kotlinmania/libc-native-bindings').taskIdSelf()") as io.github.kotlinmania.libc.TaskId

public actual fun taskDelay(ticks: io.github.kotlinmania.libc.VxTicksT): CInt =
    js("require('@kotlinmania/libc-native-bindings').taskDelay(ticks)") as CInt

public actual fun taskNameSet(taskId: io.github.kotlinmania.libc.TaskId, taskName: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').taskNameSet(taskId, taskName?.value ?: 0L)") as CInt

public actual fun taskNameGet(taskId: io.github.kotlinmania.libc.TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').taskNameGet(taskId, bufName?.value ?: 0L, bufsize)") as CInt

public actual fun rtpInfoGet(rtpId: io.github.kotlinmania.libc.RtpId, rtpStruct: io.github.kotlinmania.libc.RtpDesc?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rtpInfoGet(rtpId, rtpStruct?.toLong() ?: 0L)") as CInt

public actual fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    js("require('@kotlinmania/libc-native-bindings').rtpSpawn(pubrtpFileName, argv?.value ?: 0L, envp?.value ?: 0L, priority, uStackSize, options, taskOptions)") as RtpId

public actual fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool =
    js("require('@kotlinmania/libc-native-bindings').pathIsAbsolute(filepath, pNameTail?.value ?: 0L)") as Bool

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun randBytes(buf: CUchar?, length: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').randBytes(buf?.toLong() ?: 0L, length)") as CInt

public actual fun randABytes(buf: CUchar?, length: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').randABytes(buf?.toLong() ?: 0L, length)") as CInt

public actual fun randUBytes(buf: CUchar?, length: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').randUBytes(buf?.toLong() ?: 0L, length)") as CInt

public actual fun randSecure(): CInt =
    js("require('@kotlinmania/libc-native-bindings').randSecure()") as CInt

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqClose(mqd)") as CInt

public actual fun mqUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqUnlink(name)") as CInt

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)") as SsizeT

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: io.github.kotlinmania.libc.Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSend(mqd, msgPtr, msgLen, msgPrio)") as CInt

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)") as CInt

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetattr(mqd, attr?.toLong() ?: 0L)") as CInt

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)") as CInt

public actual fun vxCpuEnabledGet(): io.github.kotlinmania.libc.CpusetT =
    js("require('@kotlinmania/libc-native-bindings').vxCpuEnabledGet()") as io.github.kotlinmania.libc.CpusetT

public actual fun vxCpuConfiguredGet(): io.github.kotlinmania.libc.CpusetT =
    js("require('@kotlinmania/libc-native-bindings').vxCpuConfiguredGet()") as io.github.kotlinmania.libc.CpusetT
