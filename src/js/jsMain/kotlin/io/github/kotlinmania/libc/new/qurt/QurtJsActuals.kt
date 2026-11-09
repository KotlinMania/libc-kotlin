@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private val _newQurtNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun opendir(name: String?): DIR? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_opendir(name) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_readdir((dirp?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun closedir(dirp: DIR?): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_closedir((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_mkdir(path, mode.toInt()) as Int) else 0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_pthreadAttrSetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), stacksize.toString()) as Int) else 0

public actual fun clockGetcpuclockid(pid: PidT, clockId: COpaquePointer?): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_clockGetcpuclockid(pid, (clockId?.value ?: 0L).toString()) as Int) else 0

public actual fun semOpen(name: String?, oflag: CInt): COpaquePointer? =
    null

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_semClose((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semUnlink(name: String?): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_semUnlink(name) as Int) else 0

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_alignedAlloc(alignment.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strlen(s: String?): SizeT =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strlen(s) as String).toULong() else 0uL

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strcpy((dest?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strncpy((dest?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strcat((dest?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strncat((dest?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcmp(s1: String?, s2: String?): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strcmp(s1, s2) as Int) else 0

public actual fun strncmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strncmp(s1, s2, n.toString()) as Int) else 0

public actual fun strcoll(s1: String?, s2: String?): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strcoll(s1, s2) as Int) else 0

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strxfrm((dest?.value ?: 0L).toString(), src, n.toString()) as String).toULong() else 0uL

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strchr(s, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strrchr(s, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strspn(s: String?, accept: String?): SizeT =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strspn(s, accept) as String).toULong() else 0uL

public actual fun strcspn(s: String?, reject: String?): SizeT =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strcspn(s, reject) as String).toULong() else 0uL

public actual fun strpbrk(s: String?, accept: String?): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strpbrk(s, accept) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strstr(haystack: String?, needle: String?): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strstr(haystack, needle) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strtok((s?.value ?: 0L).toString(), delim) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strerror(errnum: CInt): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_strerror(errnum) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_memchr((s?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_memcmp((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString(), n.toString()) as Int) else 0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_memset((s?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fork(): PidT =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_fork() as Int) else 0

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_execve(filename, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun isalnum(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_isalnum(c) as Int) else 0

public actual fun isalpha(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_isalpha(c) as Int) else 0

public actual fun iscntrl(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_iscntrl(c) as Int) else 0

public actual fun isdigit(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_isdigit(c) as Int) else 0

public actual fun isgraph(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_isgraph(c) as Int) else 0

public actual fun islower(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_islower(c) as Int) else 0

public actual fun isprint(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_isprint(c) as Int) else 0

public actual fun ispunct(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_ispunct(c) as Int) else 0

public actual fun isspace(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_isspace(c) as Int) else 0

public actual fun isupper(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_isupper(c) as Int) else 0

public actual fun isxdigit(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_isxdigit(c) as Int) else 0

public actual fun tolower(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_tolower(c) as Int) else 0

public actual fun toupper(c: CInt): CInt =
    if (_newQurtNapiAddon != null) (_newQurtNapiAddon.libc_new_qurt_toupper(c) as Int) else 0
