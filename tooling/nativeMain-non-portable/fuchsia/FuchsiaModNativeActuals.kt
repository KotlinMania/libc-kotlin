@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_freopen(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fflush(file: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fflush(file?.handle?.toCPointer<ByteVar>())

public actual fun fclose(file: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fclose(file?.handle?.toCPointer<ByteVar>())

public actual fun remove(filename: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tmpfile()?.let { FILE(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getchar()

public actual fun putchar(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun puts(s: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fread(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fgetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fsetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun feof(stream: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun perror(s: String?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_perror(s)
}

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_atexit(cb.toInt())

public actual fun system(s: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun wcslen(buf: WcharT?): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_wcslen(buf?.value?.toCPointer<ByteVar>())

public actual fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_wcstombs(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_srand(seed)
}

public actual fun getpwnam(name: String?): Passwd? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpwnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwuid(uid: io.github.kotlinmania.libc.UidT): Passwd? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpwuid(uid)?.let { COpaquePointer(it.toLong()) }

public actual fun getcharUnlocked(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getchar_unlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_putchar_unlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_socket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_connect(socket, address?.value?.toCPointer<ByteVar>(), len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_listen(socket, backlog)

public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_accept(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpeername(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getsockname(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setsockopt(socket, level, name, value?.value?.toCPointer<ByteVar>(), optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_socketpair(domain, type, protocol, socketVector?.value?.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sendto(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_shutdown(socket, how)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkdir(path, mode)

public actual fun stat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun pclose(stream: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun creat(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_creat(path, mode)

public actual fun opendir(dirname: String?): DIR? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_opendir(dirname)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readdirR(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_readdir_r(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun closedir(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: DIR?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fchmodat(dirfd, pathname, mode, flags)

public actual fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fchownat(dirfd, pathname, owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fstatat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkdirat(dirfd, pathname, mode)

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_readlinkat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_alarm(seconds)

public actual fun chdir(dir: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_chdir(dir)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_chown(path, uid, gid)

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_lchown(path, uid, gid)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_close(fd)

public actual fun dup(fd: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dup2(src, dst)

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_execv(prog, argv?.value?.toCPointer<ByteVar>())

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_execve(prog, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_execvp(c, argv?.value?.toCPointer<ByteVar>())

public actual fun fork(): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun getegid(): GidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getegid()

public actual fun geteuid(): UidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_geteuid()

public actual fun getgid(): GidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getgid()

public actual fun getgroups(ngroupsMax: CInt, groups: UInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getgroups(ngroupsMax, groups?.value?.toCPointer<ByteVar>())

public actual fun getlogin(): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getlogin()?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun getpgid(pid: PidT): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpgid(pid)

public actual fun getpgrp(): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpgrp()

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpid()

public actual fun getppid(): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getppid()

public actual fun getuid(): UidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getuid()

public actual fun isatty(fd: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pathconf(path, name)

public actual fun pause(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pause()

public actual fun pipe(fds: CInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pipe(fds?.value?.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_posix_memalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_rmdir(path)

public actual fun seteuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setegid(gid)

public actual fun setgid(gid: GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setgid(gid)

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setpgid(pid, pgid)

public actual fun setsid(): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setsid()

public actual fun setuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setuid(uid)

public actual fun sleep(secs: CUint): CUint =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sleep(secs)

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_nanosleep(rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun tcgetpgrp(fd: CInt): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: io.github.kotlinmania.libc.PidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ttyname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun unlink(c: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_unlink(c)

public actual fun wait(status: CInt?): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_wait(status?.value?.toCPointer<ByteVar>())

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_waitpid(pid, status?.value?.toCPointer<ByteVar>(), options)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pread(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pwrite(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun umask(mask: ModeT): ModeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_umask(mask)

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_utime(file, buf?.value?.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_kill(pid, sig)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_munlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mlockall(flags)

public actual fun munlockall(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun ifNametoindex(ifname: String?): CUint =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_if_nametoindex(ifname)

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_if_indextoname(ifindex, ifname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lstat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fsync(fd)

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_symlink(path1, path2)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ftruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_signal(signum, handler)

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_realpath(pathname, resolved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun flock(fd: CInt, operation: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_flock(fd, operation)

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_times(buf?.value?.toCPointer<ByteVar>())

public actual fun pthreadSelf(): io.github.kotlinmania.libc.PthreadT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_self()

public actual fun pthreadJoin(native: io.github.kotlinmania.libc.PthreadT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_join(native, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_exit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_attr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_attr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stacksize: ULong?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_attr_getstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackSize: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_attr_setstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.PthreadAttrT?, state: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_attr_setdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_detach(thread)

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_yield()

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_key_create(key?.value?.toCPointer<ByteVar>(), dtor?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_key_delete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_getspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_setspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutex_init(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutex_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutex_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutex_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutex_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutexattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutexattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutexattr_settype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_cond_init(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_cond_wait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_cond_timedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_cond_signal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_cond_broadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_cond_destroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_condattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_condattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlock_init(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlock_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlock_rdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlock_tryrdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlock_wrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlock_trywrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlock_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlockattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_rwlockattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_getname_np(thread, name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_setname_np(thread, name)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: UInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun raise(signum: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_raise(signum)

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigaction(signum, act?.value?.toCPointer<ByteVar>(), oldact?.value?.toCPointer<ByteVar>())

public actual fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_utimes(filename, times?.value?.toCPointer<ByteVar>())

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dlopen(filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlerror(): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dlerror()?.let { COpaquePointer(it.toLong()) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dlsym(handle?.value?.toCPointer<ByteVar>(), symbol)?.let { COpaquePointer(it.toLong()) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dlclose(handle?.value?.toCPointer<ByteVar>())

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dladdr(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getaddrinfo(node, service, hints?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: Addrinfo?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_freeaddrinfo(res?.value?.toCPointer<ByteVar>())
}

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_gai_strerror(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun resInit(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_res_init()

public actual fun gmtimeR(timeP: CLong?, result: Tm?): Tm? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_gmtime_r(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(timeP: CLong?, result: Tm?): Tm? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_localtime_r(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mktime(tm: Tm?): TimeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mktime(tm?.value?.toCPointer<ByteVar>())

public actual fun time(time: CLong?): TimeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_time(time?.value?.toCPointer<ByteVar>())

public actual fun gmtime(timeP: CLong?): Tm? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_gmtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(timeP: CLong?): Tm? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_localtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mknod(pathname: String?, mode: ModeT, dev: io.github.kotlinmania.libc.DevT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mknod(pathname, mode, dev)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_gethostname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getservbyname(name, proto)?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobyname(name: String?): Protoent? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getprotobyname(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobynumber(proto: CInt): Protoent? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getprotobynumber(proto)?.let { COpaquePointer(it.toLong()) }

public actual fun usleep(secs: CUint): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_recv(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun putenv(string: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_putenv(string?.value?.toCPointer<ByteVar>())

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_select(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): Lconv? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semWait(sem: SemT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_wait(sem?.value?.toCPointer<ByteVar>())

public actual fun semTrywait(sem: SemT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_trywait(sem?.value?.toCPointer<ByteVar>())

public actual fun semPost(sem: SemT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_post(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_statvfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fstatvfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsz)

public actual fun sigemptyset(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigemptyset(set?.value?.toCPointer<ByteVar>())

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigaddset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigfillset(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigfillset(set?.value?.toCPointer<ByteVar>())

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigdelset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigismember(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigprocmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigpending(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigpending(set?.value?.toCPointer<ByteVar>())

public actual fun timegm(tm: io.github.kotlinmania.libc.Tm?): TimeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun getsid(pid: PidT): PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getsid(pid)

public actual fun sysconf(name: CInt): CLong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sysconf(name)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkfifo(path, mode)

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pselect(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun tcdrain(fd: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcdrain(fd)

public actual fun cfgetispeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_cfgetispeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfgetospeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_cfgetospeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: io.github.kotlinmania.libc.Termios?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_cfmakeraw(termios?.value?.toCPointer<ByteVar>())
}

public actual fun cfsetispeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_cfsetispeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_cfsetospeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun cfsetspeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_cfsetspeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun tcgetattr(fd: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcgetattr(fd, termios?.value?.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcsetattr(fd, optionalActions, termios?.value?.toCPointer<ByteVar>())

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcflush(fd, action)

public actual fun tcgetsid(fd: CInt): io.github.kotlinmania.libc.PidT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tcsendbreak(fd, duration)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkstemp(template?.value?.toCPointer<ByteVar>())

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkdtemp(template?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tmpnam(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setlogmask(maskpri)

public actual fun grantpt(fd: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_grantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_posix_openpt(flags)

public actual fun ptsname(fd: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ptsname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun unlockpt(fd: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_unlockpt(fd)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fdatasync(fd)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_clock_settime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: io.github.kotlinmania.libc.PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_getattr_np(native, attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: SizeT, ptr: UInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_posix_fadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fdopendir(fd: CInt): DIR? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fdopendir(fd)?.let { DIR(it.toLong()) }

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mknodat(dirfd, pathname, mode, dev)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun accept4(fd: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, len: UInt?, flg: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ptsname_r(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun setreuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setreuid(ruid, euid)

public actual fun setregid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setregid(rgid, egid)

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_acct(filename)

public actual fun brk(addr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setresuid(ruid, euid, suid)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: io.github.kotlinmania.libc.Winsize?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun lutimes(file: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun setpwent() {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_endpwent()
}

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_shm_open(name, oflag, mode)

public actual fun shmget(key: io.github.kotlinmania.libc.KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ftok(pathname, projId)

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflag: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: io.github.kotlinmania.libc.Sembuf?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_errno_location()?.let { COpaquePointer(it.toLong()) }

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_posix_fallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_readahead(fd, offset, count)

public actual fun signalfd(fd: CInt, mask: io.github.kotlinmania.libc.SigsetT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_signalfd(fd, mask?.value?.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_timerfd_create(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_timerfd_gettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_timerfd_settime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun pwritev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_quotactl(cmd, special, id, data?.value?.toCPointer<ByteVar>())

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dup3(oldfd, newfd, flags)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_nl_langinfo_l(item, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun reboot(howTo: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_reboot(howTo)

public actual fun setfsgid(gid: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setfsgid(gid)

public actual fun setfsuid(uid: io.github.kotlinmania.libc.UidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkfifoat(dirfd, pathname, mode)

public actual fun ifNameindex(): IfNameindex? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_if_nameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_if_freenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sync_file_range(fd, offset, nbytes, flags)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_shm_unlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun futimes(fd: CInt, times: io.github.kotlinmania.libc.Timeval?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setdomainname(name, len)

public actual fun vhangup(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_vhangup()

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sync()
}

public actual fun schedGetaffinity(pid: io.github.kotlinmania.libc.PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_getaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: io.github.kotlinmania.libc.PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_setaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun umount(target: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_umount(target)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_get_priority_max(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_tee(fdIn, fdOut, len, flags)

public actual fun settimeofday(tv: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_splice(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_eventfd(initval, flags)

public actual fun schedRrGetInterval(pid: io.github.kotlinmania.libc.PidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_rr_get_interval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: SemT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun swapoff(puath: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_swapoff(puath)

public actual fun vmsplice(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_vmsplice(fd, iov?.value?.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_mount(src, target, fstype, flags, data?.value?.toCPointer<ByteVar>())

public actual fun personality(persona: CUlong): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_personality(persona)

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun ppoll(fds: io.github.kotlinmania.libc.Pollfd?, nfds: NfdsT, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_getscheduler(pid)

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: ULong?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_get_priority_min(policy)

public actual fun umount2(target: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: io.github.kotlinmania.libc.Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SemT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getdtablesize()

public actual fun getgrnamR(name: String?, grp: io.github.kotlinmania.libc.Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_initgroups(user, group)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): io.github.kotlinmania.libc.Group? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_cancel(thread)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_kill(thread, sig)

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): io.github.kotlinmania.libc.Group? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_endgrent()
}

public actual fun getgrent(): io.github.kotlinmania.libc.Group? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: UInt?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: CUlong?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mod_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())
