package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun opendir(name: String?): DIR? =
    js("require('@kotlinmania/libc-native-bindings').opendir(name)") as DIR?

public actual fun readdir(dirp: DIR?): Dirent? =
    js("require('@kotlinmania/libc-native-bindings').readdir(dirp?.toLong() ?: 0L)") as Dirent?

public actual fun closedir(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').closedir(dirp?.toLong() ?: 0L)") as CInt

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkdir(path, mode)") as CInt

public actual fun pthreadAttrGetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize)") as CInt

public actual fun clockGetcpuclockid(pid: PidT, clockId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetcpuclockid(pid, clockId?.toLong() ?: 0L)") as CInt

public actual fun semClose(sem: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').alignedAlloc(alignment, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(s: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlen(s)") as SizeT

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcpy(dest?.value ?: 0L, src)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncpy(dest?.value ?: 0L, src, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcat(dest?.value ?: 0L, src)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncat(dest?.value ?: 0L, src, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(s1: String?, s2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcmp(s1, s2)") as CInt

public actual fun strncmp(s1: String?, s2: String?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncmp(s1, s2, n)") as CInt

public actual fun strcoll(s1: String?, s2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcoll(s1, s2)") as CInt

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strxfrm(dest?.value ?: 0L, src, n)") as SizeT

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strchr(s, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strrchr(s, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(s: String?, accept: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strspn(s, accept)") as SizeT

public actual fun strcspn(s: String?, reject: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strcspn(s, reject)") as SizeT

public actual fun strpbrk(s: String?, accept: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strpbrk(s, accept)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(haystack: String?, needle: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strstr(haystack, needle)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strtok(s?.value ?: 0L, delim)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerror(errnum: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strerror(errnum)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memchr(s?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memcmp(s1?.value ?: 0L, s2?.value ?: 0L, n)") as CInt

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memcpy(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmove(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memset(s?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fork(): PidT =
    js("require('@kotlinmania/libc-native-bindings').fork()") as PidT

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execve(filename, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

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

public actual fun tolower(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tolower(c)") as CInt

public actual fun toupper(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').toupper(c)") as CInt
