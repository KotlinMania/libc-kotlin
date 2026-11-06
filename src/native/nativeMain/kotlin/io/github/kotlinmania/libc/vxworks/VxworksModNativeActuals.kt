@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_freopen(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fflush(file: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fflush(file?.handle?.toCPointer<ByteVar>())

public actual fun fclose(file: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fclose(file?.handle?.toCPointer<ByteVar>())

public actual fun remove(filename: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_tmpfile()?.let { FILE(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getchar()

public actual fun putchar(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun puts(s: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fread(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fgetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fsetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun feof(stream: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun perror(s: String?) {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_perror(s)
}

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_atexit(cb.toInt())

public actual fun system(s: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun cfgetospeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_cfgetospeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: io.github.kotlinmania.libc.Termios?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_cfmakeraw(termios?.value?.toCPointer<ByteVar>())

public actual fun cfsetispeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_cfsetispeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_cfsetospeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strlen(cs)

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strnlen(cs, n)

public actual fun strerror(n: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun wcslen(buf: WcharT?): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_wcslen(buf?.value?.toCPointer<ByteVar>())

public actual fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_wcstombs(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_memccpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_aligned_alloc(alignment, size)?.let { COpaquePointer(it.toLong()) }

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_times(buf?.value?.toCPointer<ByteVar>())

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_tcflush(fd, action)

public actual fun pclose(stream: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mkdtemp(template?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_unlinkat(dirfd, pathname, flags)

public actual fun getprotobyname(name: String?): Protoent? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getprotobyname(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobynumber(proto: CInt): Protoent? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getprotobynumber(proto)?.let { COpaquePointer(it.toLong()) }

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getservbyname(name, proto)?.let { COpaquePointer(it.toLong()) }

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fchownat(dirfd, pathname, owner, group, flags)

public actual fun getcharUnlocked(): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getchar_unlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_putchar_unlocked(c)

public actual fun stat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun creat(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_creat(path, mode)

public actual fun rewinddir(dirp: DIR?) {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fchown(fd, owner, group)

public actual fun access(path: String?, amode: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_alarm(seconds)

public actual fun fchdir(dirfd: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_chown(path, uid, gid)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fpathconf(filedes, name)

public actual fun getegid(): GidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getegid()

public actual fun geteuid(): UidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_geteuid()

public actual fun getgroups(ngroupsMax: CInt, groups: CUshort?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getgroups(ngroupsMax, groups?.value?.toCPointer<ByteVar>())

public actual fun getlogin(): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getlogin()?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun pathconf(path: String?, name: CInt): CLong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pathconf(path, name)

public actual fun pause(): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pause()

public actual fun seteuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setegid(gid)

public actual fun sleep(secs: CUint): CUint =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sleep(secs)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_ttyname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun wait(status: CInt?): PidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_wait(status?.value?.toCPointer<ByteVar>())

public actual fun umask(mask: ModeT): ModeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_umask(mask)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mlockall(flags)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_munlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun munlockall(): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun truncate(path: String?, length: OffT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_truncate(path, length)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_shm_open(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_shm_unlink(name)

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_exit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.PthreadAttrT?, state: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_setdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadEqual(t1: io.github.kotlinmania.libc.PthreadT, t2: io.github.kotlinmania.libc.PthreadT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_equal(t1, t2)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun sigaddset(set: CUlonglong?, signum: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigaddset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigaction(signum, act?.value?.toCPointer<ByteVar>(), oldact?.value?.toCPointer<ByteVar>())

public actual fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_utimes(filename, times?.value?.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_dlopen(filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlerror(): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_dlerror()?.let { COpaquePointer(it.toLong()) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_dlsym(handle?.value?.toCPointer<ByteVar>(), symbol)?.let { COpaquePointer(it.toLong()) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_dlclose(handle?.value?.toCPointer<ByteVar>())

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_dladdr(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun gmtimeR(timeP: CLonglong?, result: Tm?): Tm? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_gmtime_r(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(timeP: CLonglong?, result: Tm?): Tm? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_localtime_r(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mktime(tm: Tm?): TimeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mktime(tm?.value?.toCPointer<ByteVar>())

public actual fun time(time: CLonglong?): TimeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_time(time?.value?.toCPointer<ByteVar>())

public actual fun gmtime(timeP: CLonglong?): Tm? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_gmtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(timeP: CLonglong?): Tm? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_localtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun timegm(tm: Tm?): TimeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_difftime(time1, time0)

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_gethostname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun usleep(secs: io.github.kotlinmania.libc.UsecondsT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_usleep(secs)

public actual fun putenv(string: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_putenv(string?.value?.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): Lconv? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun sigprocmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigprocmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigpending(set: CUlonglong?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigpending(set?.value?.toCPointer<ByteVar>())

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mkfifo(path, mode)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun mkstemp(template: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mkstemp(template?.value?.toCPointer<ByteVar>())

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_tmpnam(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setlogmask(maskpri)

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getline(lineptr?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_tcsetattr(fd, optionalActions, termios?.value?.toCPointer<ByteVar>())

public actual fun tcgetattr(fd: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_tcgetattr(fd, termios?.value?.toCPointer<ByteVar>())

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_tcsendbreak(fd, duration)

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_confstr(name, buf?.value?.toCPointer<ByteVar>(), len)

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fnmatch(pattern, name, flags)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_symlinkat(target, newdirfd, linkpath)

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fchmodat(dirfd, pathname, mode, flags)

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_utime(file, buf?.value?.toCPointer<ByteVar>())

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_memalign(blockSize, sizeArg)?.let { COpaquePointer(it.toLong()) }

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun chdir(attr: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_chdir(attr)

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutexattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutexattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(pAttr: io.github.kotlinmania.libc.PthreadMutexattrT?, pType: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutexattr_settype(pAttr?.value?.toCPointer<ByteVar>(), pType)

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutex_init(mutex?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutex_destroy(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutex_lock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutex_trylock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutex_timedlock(attr?.value?.toCPointer<ByteVar>(), spec?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_mutex_unlock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetname(pAttr: io.github.kotlinmania.libc.PthreadAttrT?, name: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_setname(pAttr?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stacksize: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_setstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, size: ULong?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_getstacksize(attr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(pThread: CUlong?, pAttr: io.github.kotlinmania.libc.PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_create(pThread?.value?.toCPointer<ByteVar>(), pAttr?.value?.toCPointer<ByteVar>(), startRoutine.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_setschedparam(native, policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_getschedparam(native, policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.PthreadAttrT?, inheritsched: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_setinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.PthreadAttrT?, policy: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrDestroy(thread: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_destroy(thread?.value?.toCPointer<ByteVar>())

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_detach(thread)

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun lstat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_ftruncate(fd, length)

public actual fun readdirR(pDir: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_readdir_r(pDir?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun readdir(pDir: DIR?): io.github.kotlinmania.libc.Dirent? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_readdir(pDir?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)

public actual fun pthreadCondattrInit(attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_condattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_condattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(pAttr: io.github.kotlinmania.libc.PthreadCondattrT?, pClockId: CInt?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_condattr_getclock(pAttr?.value?.toCPointer<ByteVar>(), pClockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(pAttr: io.github.kotlinmania.libc.PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_condattr_setclock(pAttr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondInit(cond: io.github.kotlinmania.libc.PthreadCondT?, attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_cond_init(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_cond_destroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: io.github.kotlinmania.libc.PthreadCondT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_cond_signal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: io.github.kotlinmania.libc.PthreadCondT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_cond_broadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: io.github.kotlinmania.libc.PthreadCondT?, mutex: io.github.kotlinmania.libc.PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_cond_wait(cond?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlockattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlockattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetmaxreaders(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, attr2: CUint): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlockattr_setmaxreaders(attr?.value?.toCPointer<ByteVar>(), attr2)

public actual fun pthreadRwlockInit(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_init(attr?.value?.toCPointer<ByteVar>(), host?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_rdlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_tryrdlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedrdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_timedrdlock(attr?.value?.toCPointer<ByteVar>(), host?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_wrlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_trywrlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedwrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_timedwrlock(attr?.value?.toCPointer<ByteVar>(), host?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_rwlock_unlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: CUlong?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_key_create(key?.value?.toCPointer<ByteVar>(), dtor?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: io.github.kotlinmania.libc.PthreadKeyT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_key_delete(key)

public actual fun pthreadSetspecific(key: io.github.kotlinmania.libc.PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_setspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetspecific(key: io.github.kotlinmania.libc.PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_getspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCondTimedwait(cond: io.github.kotlinmania.libc.PthreadCondT?, mutex: io.github.kotlinmania.libc.PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_cond_timedwait(cond?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetname(attr: io.github.kotlinmania.libc.PthreadAttrT?, name: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_attr_getname(attr?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())

public actual fun pthreadJoin(thread: io.github.kotlinmania.libc.PthreadT, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_join(thread, status?.value?.toCPointer<ByteVar>())

public actual fun pthreadSelf(): io.github.kotlinmania.libc.PthreadT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_self()

public actual fun clockGettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_clock_gettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_clock_settime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: io.github.kotlinmania.libc.ClockidT, res: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_clock_getres(clockId, res?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(clockId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_clock_nanosleep(clockId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun nanosleep(rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_nanosleep(rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun accept(s: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_accept(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_bind(fd, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun connect(s: CInt, name: io.github.kotlinmania.libc.Sockaddr?, namelen: io.github.kotlinmania.libc.SocklenT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_connect(s, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun getpeername(s: CInt, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CUint?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getpeername(s, name?.value?.toCPointer<ByteVar>(), namelen?.value?.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: CUint?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getsockname(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_listen(socket, backlog)

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_recv(s, buf?.value?.toCPointer<ByteVar>(), bufLen, flags)

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: io.github.kotlinmania.libc.Sockaddr?, pFromLen: CUint?): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_recvfrom(s, buf?.value?.toCPointer<ByteVar>(), bufLen, flags, from?.value?.toCPointer<ByteVar>(), pFromLen?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(socket: CInt, mp: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_recvmsg(socket, mp?.value?.toCPointer<ByteVar>(), flags)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sendmsg(socket: CInt, mp: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sendmsg(socket, mp?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sendto(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setsockopt(socket, level, name, value?.value?.toCPointer<ByteVar>(), optionLen)

public actual fun shutdown(s: CInt, how: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_shutdown(s, how)

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_socket(domain, type, protocol)

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_gai_strerror(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_close(fd)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun isatty(fd: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_isatty(fd)

public actual fun dup(src: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_dup(src)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_dup2(src, dst)

public actual fun pipe(fds: CInt?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pipe(fds?.value?.toCPointer<ByteVar>())

public actual fun unlink(pathname: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_unlink(pathname)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_lseek(fd, offset, whence)

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getaddrinfo(node, service, hints?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: Addrinfo?) {
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_freeaddrinfo(res?.value?.toCPointer<ByteVar>())
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_signal(signum, handler)

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getpid()

public actual fun getppid(): PidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getppid()

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setpgid(pid, pgid)

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_waitpid(pid, status?.value?.toCPointer<ByteVar>(), options)

public actual fun sysconf(attr: CInt): CLong =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sysconf(attr)

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setenv(envVarName, envVarValue, overwrite)

public actual fun unsetenv(envVarName: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_unsetenv(envVarName)

public actual fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_realpath(fileName, resolvedName?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun link(src: String?, dst: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_link(src, dst)

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun symlink(path1: String?, path2: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_symlink(path1, path2)

public actual fun opendir(name: String?): DIR? =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_opendir(name)?.let { DIR(it.toLong()) }

public actual fun rmdir(path: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rmdir(path)

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mkdir(dirName, mode)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_chmod(path, mode)

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fchmod(attr1, attr2)

public actual fun fsync(fd: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_fsync(fd)

public actual fun closedir(ptr: DIR?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_closedir(ptr?.handle?.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sched_get_priority_max(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sched_get_priority_min(policy)

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sched_getscheduler(pid)

public actual fun schedRrGetInterval(pid: io.github.kotlinmania.libc.PidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sched_rr_get_interval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sched_yield()

public actual fun errnoSet(err: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_errno_set(err)

public actual fun errnoGet(): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_errno_get()

public actual fun setgid(gid: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setgid(gid)

public actual fun getgid(): io.github.kotlinmania.libc.GidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getgid()

public actual fun setuid(uid: io.github.kotlinmania.libc.UidT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_setuid(uid)

public actual fun getuid(): io.github.kotlinmania.libc.UidT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_getuid()

public actual fun sigemptyset(set: CUlonglong?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigemptyset(set?.value?.toCPointer<ByteVar>())

public actual fun sigfillset(set: CUlonglong?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigfillset(set?.value?.toCPointer<ByteVar>())

public actual fun sigdelset(set: CUlonglong?, signum: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigdelset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: CUlonglong?, signum: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigismember(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun pthreadSigmask(how: CInt, set: CUlonglong?, oset: CUlonglong?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oset?.value?.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, signo: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_kill(pid, signo)

public actual fun sigqueue(pid: PidT, signo: CInt, value: io.github.kotlinmania.libc.Sigval): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_sigqueue(pid, signo, value.toInt())

public actual fun taskKill(taskId: io.github.kotlinmania.libc.TaskId, signo: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_task_kill(taskId, signo)

public actual fun raise(signo: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_raise(signo)

public actual fun taskIdSelf(): io.github.kotlinmania.libc.TaskId =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_task_id_self()

public actual fun taskDelay(ticks: io.github.kotlinmania.libc.VxTicksT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_task_delay(ticks)

public actual fun taskNameSet(taskId: io.github.kotlinmania.libc.TaskId, taskName: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_task_name_set(taskId, taskName?.value?.toCPointer<ByteVar>())

public actual fun taskNameGet(taskId: io.github.kotlinmania.libc.TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_task_name_get(taskId, bufName?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun rtpInfoGet(rtpId: io.github.kotlinmania.libc.RtpId, rtpStruct: io.github.kotlinmania.libc.RtpDesc?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rtp_info_get(rtpId, rtpStruct?.value?.toCPointer<ByteVar>())

public actual fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rtp_spawn(pubrtpFileName, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>(), priority, uStackSize, options, taskOptions)

public actual fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_path_is_absolute(filepath, pNameTail?.value?.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun randBytes(buf: CUchar?, length: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rand_bytes(buf?.value?.toCPointer<ByteVar>(), length)

public actual fun randABytes(buf: CUchar?, length: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rand_abytes(buf?.value?.toCPointer<ByteVar>(), length)

public actual fun randUBytes(buf: CUchar?, length: CInt): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rand_ubytes(buf?.value?.toCPointer<ByteVar>(), length)

public actual fun randSecure(): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_rand_secure()

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mq_close(mqd)

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mq_unlink(name)

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mq_receive(mqd, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: io.github.kotlinmania.libc.Timespec?): SsizeT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mq_timedreceive(mqd, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mq_send(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mq_timedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mq_getattr(mqd, attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_mq_setattr(mqd, newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun vxCpuEnabledGet(): io.github.kotlinmania.libc.CpusetT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_vx_cpu_enabled_get()

public actual fun vxCpuConfiguredGet(): io.github.kotlinmania.libc.CpusetT =
    io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mod_vx_cpu_configured_get()
