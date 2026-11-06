@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_toupper(c)

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_qsort(base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>())
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_bsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fopen(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_freopen(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fflush(file: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fflush(file?.handle?.toCPointer<ByteVar>())

public actual fun fclose(file: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fclose(file?.handle?.toCPointer<ByteVar>())

public actual fun remove(filename: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tmpfile()?.let { FILE(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getchar()

public actual fun putchar(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun puts(s: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fread(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fgetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fsetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun feof(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun clearerr(stream: FILE?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_clearerr(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun perror(s: String?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_perror(s)
}

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_stpcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strndup(cs, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strtok_r(s?.value?.toCPointer<ByteVar>(), t, p?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun strsignal(sig: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strsignal(sig)?.let { COpaquePointer(it.toLong()) }

public actual fun wcslen(buf: WcharT?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_wcslen(buf?.value?.toCPointer<ByteVar>())

public actual fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_wcstombs(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_memccpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwnam(name: String?): Passwd? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getpwnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwuid(uid: io.github.kotlinmania.libc.UidT): Passwd? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getpwuid(uid)?.let { COpaquePointer(it.toLong()) }

public actual fun getcharUnlocked(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getchar_unlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_putchar_unlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_socket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_connect(socket, address?.value?.toCPointer<ByteVar>(), len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_listen(socket, backlog)

public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_accept(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getpeername(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getsockname(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setsockopt(socket, level, name, value?.value?.toCPointer<ByteVar>(), optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_socketpair(domain, type, protocol, socketVector?.value?.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sendto(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_shutdown(socket, how)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mkdir(path, mode)

public actual fun stat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun pclose(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun creat(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_creat(path, mode)

public actual fun opendir(dirname: String?): DIR? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_opendir(dirname)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): Dirent? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closedir(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: DIR?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fchmodat(dirfd, pathname, mode, flags)

public actual fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fchownat(dirfd, pathname, owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fstatat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_alarm(seconds)

public actual fun chdir(dir: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_chdir(dir)

public actual fun fchdir(dirfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_chown(path, uid, gid)

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_lchown(path, uid, gid)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_close(fd)

public actual fun dup(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_dup2(src, dst)

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_execv(prog, argv?.value?.toCPointer<ByteVar>())

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_execve(prog, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_execvp(c, argv?.value?.toCPointer<ByteVar>())

public actual fun fork(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun getegid(): GidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getegid()

public actual fun geteuid(): UidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_geteuid()

public actual fun getgid(): GidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getgid()

public actual fun getgroups(ngroupsMax: CInt, groups: CUshort?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getgroups(ngroupsMax, groups?.value?.toCPointer<ByteVar>())

public actual fun getlogin(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getlogin()?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun getpgid(pid: PidT): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getpgid(pid)

public actual fun getpgrp(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getpgrp()

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getpid()

public actual fun getppid(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getppid()

public actual fun getuid(): UidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getuid()

public actual fun isatty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pathconf(path, name)

public actual fun pipe(fds: CInt?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pipe(fds?.value?.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_posix_memalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_aligned_alloc(alignment, size)?.let { COpaquePointer(it.toLong()) }

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_rmdir(path)

public actual fun seteuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setegid(gid)

public actual fun setgid(gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setgid(gid)

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setpgid(pid, pgid)

public actual fun setsid(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setsid()

public actual fun setuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setuid(uid)

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setreuid(ruid, euid)

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setregid(rgid, egid)

public actual fun sleep(secs: CUint): CUint =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sleep(secs)

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_nanosleep(rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun tcgetpgrp(fd: CInt): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: io.github.kotlinmania.libc.PidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ttyname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ttyname_r(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun unlink(c: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_unlink(c)

public actual fun wait(status: CInt?): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_wait(status?.value?.toCPointer<ByteVar>())

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_waitpid(pid, status?.value?.toCPointer<ByteVar>(), options)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pread(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pwrite(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun umask(mask: ModeT): ModeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_umask(mask)

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_utime(file, buf?.value?.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_kill(pid, sig)

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_killpg(pgrp, sig)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_munlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mlockall(flags)

public actual fun munlockall(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun ifNametoindex(ifname: String?): CUint =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_if_nametoindex(ifname)

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_if_indextoname(ifindex, ifname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lstat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fsync(fd)

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ftruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_signal(signum, handler)

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getrusage(resource, usage?.value?.toCPointer<ByteVar>())

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_realpath(pathname, resolved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): ClockT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_times(buf?.value?.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_self()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_equal(t1.toInt(), t2.toInt())

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_join(native.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_exit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_attr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_attr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_attr_getstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_attr_setstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_attr_setdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_detach(thread.toInt())

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sched_yield()

public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_key_create(key?.value?.toCPointer<ByteVar>(), dtor?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_key_delete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_getspecific(key.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_setspecific(key.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_mutex_init(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_mutex_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_mutex_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_mutex_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_mutex_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_mutexattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_mutexattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_mutexattr_settype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_cond_init(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_cond_wait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_cond_timedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_cond_signal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_cond_broadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_cond_destroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_condattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_condattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlock_init(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlock_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlock_rdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlock_tryrdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlock_wrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlock_trywrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlock_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlockattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pthread_rwlockattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun raise(signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_raise(signum)

public actual fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_utimes(filename, times?.value?.toCPointer<ByteVar>())

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_dlopen(filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlerror(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_dlerror()?.let { COpaquePointer(it.toLong()) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_dlsym(handle?.value?.toCPointer<ByteVar>(), symbol)?.let { COpaquePointer(it.toLong()) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_dlclose(handle?.value?.toCPointer<ByteVar>())

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getaddrinfo(node, service, hints?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: Addrinfo?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_freeaddrinfo(res?.value?.toCPointer<ByteVar>())
}

public actual fun hstrerror(errcode: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_hstrerror(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_gai_strerror(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun resInit(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_res_init()

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_gmtime_r(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_localtime_r(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mktime(tm: Tm?): TimeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mktime(tm?.value?.toCPointer<ByteVar>())

public actual fun time(time: TimeT?): TimeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_time(time?.value?.toCPointer<ByteVar>())

public actual fun gmtime(timeP: TimeT?): Tm? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_gmtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(timeP: TimeT?): Tm? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_localtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_difftime(time1, time0)

public actual fun timegm(tm: Tm?): TimeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mknod(pathname, mode, dev.toInt())

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_gethostname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun endservent() {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_endservent()
}

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getservbyname(name, proto)?.let { COpaquePointer(it.toLong()) }

public actual fun getservbyport(port: CInt, proto: String?): Servent? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getservbyport(port, proto)?.let { COpaquePointer(it.toLong()) }

public actual fun getservent(): Servent? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getservent()?.let { COpaquePointer(it.toLong()) }

public actual fun setservent(stayopen: CInt) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setservent(stayopen)
}

public actual fun getprotobyname(name: String?): Protoent? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getprotobyname(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobynumber(proto: CInt): Protoent? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getprotobynumber(proto)?.let { COpaquePointer(it.toLong()) }

public actual fun chroot(name: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_chroot(name)

public actual fun usleep(secs: UsecondsT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_usleep(secs.toInt())

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_recv(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun putenv(string: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_putenv(string?.value?.toCPointer<ByteVar>())

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_poll(fds?.value?.toCPointer<ByteVar>(), nfds.toInt(), timeout)

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_select(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): Lconv? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun semWait(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sem_wait(sem?.value?.toCPointer<ByteVar>())

public actual fun semTrywait(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sem_trywait(sem?.value?.toCPointer<ByteVar>())

public actual fun semPost(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sem_post(sem?.value?.toCPointer<ByteVar>())

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_statvfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fstatvfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun sigemptyset(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigemptyset(set?.value?.toCPointer<ByteVar>())

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigaddset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigfillset(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigfillset(set?.value?.toCPointer<ByteVar>())

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigdelset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigismember(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigprocmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigpending(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigpending(set?.value?.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sysconf(name)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mkfifo(path, mode)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun tcdrain(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcdrain(fd)

public actual fun cfgetispeed(termios: Termios?): SpeedT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_cfgetispeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfgetospeed(termios: Termios?): SpeedT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_cfgetospeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_cfsetispeed(termios?.value?.toCPointer<ByteVar>(), speed.toInt())

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_cfsetospeed(termios?.value?.toCPointer<ByteVar>(), speed.toInt())

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcgetattr(fd, termios?.value?.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcsetattr(fd, optionalActions, termios?.value?.toCPointer<ByteVar>())

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcflush(fd, action)

public actual fun tcgetsid(fd: CInt): io.github.kotlinmania.libc.PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tcsendbreak(fd, duration)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mkstemp(template?.value?.toCPointer<ByteVar>())

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mkdtemp(template?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_tmpnam(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_setlogmask(maskpri)

public actual fun nice(incr: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_nice(incr)

public actual fun grantpt(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_grantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_posix_openpt(flags)

public actual fun ptsname(fd: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_ptsname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun unlockpt(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_unlockpt(fd)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_strcasestr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getline(lineptr?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_lockf(fd, cmd, len)

public actual fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_adjtime(delta?.value?.toCPointer<ByteVar>(), olddelta?.value?.toCPointer<ByteVar>())

public actual fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_stpncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun sigqueue(pid: PidT, sig: CInt, value: io.github.kotlinmania.libc.Sigval): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigqueue(pid, sig, value.toInt())

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_confstr(name, buf?.value?.toCPointer<ByteVar>(), len)

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_dladdr(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun flock(fd: CInt, operation: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_flock(fd, operation)

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_open_wmemstream(ptr?.value?.toCPointer<ByteVar>(), sizeloc?.value?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun getsid(pid: PidT): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_getsid(pid)

public actual fun pause(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pause()

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_mkdirat(dirfd, pathname, mode)

public actual fun fdopendir(fd: CInt): DIR? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fdopendir(fd)?.let { DIR(it.toLong()) }

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_readdir_r(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_readlinkat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), bufsiz)

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsz)

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_pselect(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_sigaction(signum, act?.value?.toCPointer<ByteVar>(), oldact?.value?.toCPointer<ByteVar>())

public actual fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fmemopen(buf?.value?.toCPointer<ByteVar>(), size, mode)?.let { FILE(it.toLong()) }

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_open_memstream(ptr?.value?.toCPointer<ByteVar>(), sizeloc?.value?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun atexit(cb: AtexitCbCallback): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_atexit(cb.toInt())

public actual fun cfmakeraw(termios: Termios?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_cfmakeraw(termios?.value?.toCPointer<ByteVar>())

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_cfsetspeed(termios?.value?.toCPointer<ByteVar>(), speed.toInt())

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mod_fnmatch(pattern, name, flags)
