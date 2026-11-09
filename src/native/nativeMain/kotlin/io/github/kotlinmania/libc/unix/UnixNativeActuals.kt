@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = In6Addr()

public actual val IN6ADDR_ANY: In6Addr
    get() = In6Addr()

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_toupper(c)

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_qsort(base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>())
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_bsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fopen(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_freopen(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fflush(file: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fflush(file?.handle?.toCPointer<ByteVar>())

public actual fun fclose(file: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fclose(file?.handle?.toCPointer<ByteVar>())

public actual fun remove(filename: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tmpfile()?.let { FILE(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getchar()

public actual fun putchar(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun puts(s: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fread(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fgetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fsetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun feof(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun clearerr(stream: FILE?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_clearerr(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun perror(s: String?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_perror(s)
}

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_stpcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strndup(cs, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strtokR(s?.value?.toCPointer<ByteVar>(), t, p?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun strsignal(sig: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strsignal(sig)?.let { COpaquePointer(it.toLong()) }

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_wcslen(buf?.value?.toCPointer<ByteVar>())

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_wcstombs(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_memccpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getpwnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getpwuid(uid)?.let { COpaquePointer(it.toLong()) }

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun getcharUnlocked(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_putcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_socket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_connect(socket, address?.value?.toCPointer<ByteVar>(), len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_listen(socket, backlog)

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_accept(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getpeername(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getsockname(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setsockopt(socket, level, name, value?.value?.toCPointer<ByteVar>(), optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_socketpair(domain, type, protocol, socketVector?.value?.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sendto(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_shutdown(socket, how)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mkdir(path, mode)

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun pclose(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_creat(path, mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_opendir(dirname)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closedir(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: DIR?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fchmodat(dirfd, pathname, mode, flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fchownat(dirfd, pathname, owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fstatat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_alarm(seconds)

public actual fun chdir(dir: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_chdir(dir)

public actual fun fchdir(dirfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_chown(path, uid, gid)

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_lchown(path, uid, gid)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_close(fd)

public actual fun dup(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_dup2(src, dst)

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_execv(prog, argv?.value?.toCPointer<ByteVar>())

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_execve(prog, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_execvp(c, argv?.value?.toCPointer<ByteVar>())

public actual fun fork(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun getegid(): GidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getegid()

public actual fun geteuid(): UidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_geteuid()

public actual fun getgid(): GidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getgid()

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getgroups(ngroupsMax, groups?.value?.toCPointer<ByteVar>())

public actual fun getlogin(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getlogin()?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun getpgid(pid: PidT): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getpgid(pid)

public actual fun getpgrp(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getpgrp()

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getpid()

public actual fun getppid(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getppid()

public actual fun getuid(): UidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getuid()

public actual fun isatty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pathconf(path, name)

public actual fun pipe(fds: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pipe(fds?.value?.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_posixMemalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_alignedAlloc(alignment, size)?.let { COpaquePointer(it.toLong()) }

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_rmdir(path)

public actual fun seteuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setegid(gid)

public actual fun setgid(gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setgid(gid)

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setpgid(pid, pgid)

public actual fun setsid(): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setsid()

public actual fun setuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setuid(uid)

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setreuid(ruid, euid)

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setregid(rgid, egid)

public actual fun sleep(secs: CUint): CUint =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sleep(secs)

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_nanosleep(rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun tcgetpgrp(fd: CInt): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ttyname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ttynameR(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun unlink(c: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_unlink(c)

public actual fun wait(status: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_wait(status?.value?.toCPointer<ByteVar>())

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_waitpid(pid, status?.value?.toCPointer<ByteVar>(), options)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pread(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pwrite(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun umask(mask: ModeT): ModeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_umask(mask)

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_utime(file, buf?.value?.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_kill(pid, sig)

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_killpg(pgrp, sig)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_munlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mlockall(flags)

public actual fun munlockall(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun ifNametoindex(ifname: String?): CUint =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ifNametoindex(ifname)

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ifIndextoname(ifindex, ifname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fsync(fd)

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ftruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_signal(signum, handler)

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getrusage(resource, usage?.value?.toCPointer<ByteVar>())

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_realpath(pathname, resolved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun times(buf: COpaquePointer?): ClockT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_times(buf?.value?.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    (io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadJoin(native.toLong().toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadExit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadAttrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadAttrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadAttrGetstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadAttrSetstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadAttrSetdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_schedYield()

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: FnCallback1?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadKeyCreate(key?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadGetspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadSetspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadMutexInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadMutexDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadMutexLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadMutexTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadMutexUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadMutexattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadMutexattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadMutexattrSettype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadCondInit(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadCondWait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadCondTimedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadCondSignal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadCondBroadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadCondDestroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadCondattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadCondattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockRdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockTryrdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockWrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockTrywrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pthreadRwlockattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun raise(signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_raise(signum)

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_utimes(filename, times?.value?.toCPointer<ByteVar>())

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_dlopen(filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlerror(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_dlerror()?.let { COpaquePointer(it.toLong()) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_dlsym(handle?.value?.toCPointer<ByteVar>(), symbol)?.let { COpaquePointer(it.toLong()) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_dlclose(handle?.value?.toCPointer<ByteVar>())

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getaddrinfo(node, service, hints?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_freeaddrinfo(res?.value?.toCPointer<ByteVar>())
}

public actual fun hstrerror(errcode: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_hstrerror(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_gaiStrerror(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun resInit(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_resInit()

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_gmtimeR(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_localtimeR(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mktime(tm: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mktime(tm?.value?.toCPointer<ByteVar>())

public actual fun time(time: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_time(time?.value?.toCPointer<ByteVar>())

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_gmtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_localtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_difftime(time1, time0)

public actual fun timegm(tm: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mknod(pathname, mode, dev)

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_gethostname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun endservent() {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_endservent()
}

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getservbyname(name, proto)?.let { COpaquePointer(it.toLong()) }

public actual fun getservbyport(port: CInt, proto: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getservbyport(port, proto)?.let { COpaquePointer(it.toLong()) }

public actual fun getservent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getservent()?.let { COpaquePointer(it.toLong()) }

public actual fun setservent(stayopen: CInt) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setservent(stayopen)
}

public actual fun getprotobyname(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getprotobyname(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getprotobynumber(proto)?.let { COpaquePointer(it.toLong()) }

public actual fun chroot(name: String?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_chroot(name)

public actual fun usleep(secs: UsecondsT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_recv(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun putenv(string: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_putenv(string?.value?.toCPointer<ByteVar>())

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_select(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun semWait(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_semWait(sem?.value?.toCPointer<ByteVar>())

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_semTrywait(sem?.value?.toCPointer<ByteVar>())

public actual fun semPost(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_semPost(sem?.value?.toCPointer<ByteVar>())

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_statvfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fstatvfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sigemptyset(set?.value?.toCPointer<ByteVar>())

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sigaddset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigfillset(set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sigfillset(set?.value?.toCPointer<ByteVar>())

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sigdelset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sigismember(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sigprocmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigpending(set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sigpending(set?.value?.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sysconf(name)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mkfifo(path, mode)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun tcdrain(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcdrain(fd)

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_cfgetispeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_cfgetospeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_cfsetispeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_cfsetospeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcgetattr(fd, termios?.value?.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcsetattr(fd, optionalActions, termios?.value?.toCPointer<ByteVar>())

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tcsendbreak(fd, duration)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mkstemp(template?.value?.toCPointer<ByteVar>())

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mkdtemp(template?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_tmpnam(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_setlogmask(maskpri)

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
}

public actual fun nice(incr: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_nice(incr)

public actual fun grantpt(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_grantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_posixOpenpt(flags)

public actual fun ptsname(fd: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_ptsname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun unlockpt(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_unlockpt(fd)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_strcasestr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getline(lineptr?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_lockf(fd, cmd, len)

public actual fun adjtime(delta: COpaquePointer?, olddelta: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_adjtime(delta?.value?.toCPointer<ByteVar>(), olddelta?.value?.toCPointer<ByteVar>())

public actual fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_stpncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    0

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_confstr(name, buf?.value?.toCPointer<ByteVar>(), len)

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_dladdr(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun flock(fd: CInt, operation: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_flock(fd, operation)

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_openWmemstream(ptr?.value?.toCPointer<ByteVar>(), sizeloc?.value?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun getsid(pid: PidT): PidT =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_getsid(pid)

public actual fun pause(): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pause()

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_mkdirat(dirfd, pathname, mode)

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun fdopendir(fd: CInt): DIR? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fdopendir(fd)?.let { DIR(it.toLong()) }

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_readdirR(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_readlinkat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), bufsiz)

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsz)

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_pselect(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_sigaction(signum, act?.value?.toCPointer<ByteVar>(), oldact?.value?.toCPointer<ByteVar>())

public actual fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fmemopen(buf?.value?.toCPointer<ByteVar>(), size, mode)?.let { FILE(it.toLong()) }

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_openMemstream(ptr?.value?.toCPointer<ByteVar>(), sizeloc?.value?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun atexit(cb: FnCallback2): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_atexit(0L.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_cfmakeraw(termios?.value?.toCPointer<ByteVar>())

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_cfsetspeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.cinterop.libc_unix_fnmatch(pattern, name, flags)
