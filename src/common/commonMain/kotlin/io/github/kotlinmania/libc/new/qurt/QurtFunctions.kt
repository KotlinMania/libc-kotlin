package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

// Directory functions (dirent.h)
public expect fun opendir(name: String?): DIR?

public expect fun readdir(dirp: DIR?): COpaquePointer?

public expect fun closedir(dirp: DIR?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

// Additional pthread functions
public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt

// Additional time functions
public expect fun clockGetcpuclockid(pid: PidT, clockId: COpaquePointer?): CInt

// POSIX semaphore functions
public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun semUnlink(name: String?): CInt

// Additional stdlib functions
public expect fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer?

// String functions (string.h)
public expect fun strlen(s: String?): SizeT

public expect fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcmp(s1: String?, s2: String?): CInt

public expect fun strncmp(s1: String?, s2: String?, n: SizeT): CInt

public expect fun strcoll(s1: String?, s2: String?): CInt

public expect fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT

public expect fun strchr(s: String?, c: CInt): COpaquePointer?

public expect fun strrchr(s: String?, c: CInt): COpaquePointer?

public expect fun strspn(s: String?, accept: String?): SizeT

public expect fun strcspn(s: String?, reject: String?): SizeT

public expect fun strpbrk(s: String?, accept: String?): COpaquePointer?

public expect fun strstr(haystack: String?, needle: String?): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer?

public expect fun strerror(errnum: CInt): COpaquePointer?

public expect fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

// Additional unistd functions
public expect fun fork(): PidT

public expect fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

// Character classification functions (ctype.h)
public expect fun isalnum(c: CInt): CInt

public expect fun isalpha(c: CInt): CInt

public expect fun iscntrl(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun isgraph(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun ispunct(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun isupper(c: CInt): CInt

public expect fun isxdigit(c: CInt): CInt

public expect fun tolower(c: CInt): CInt

public expect fun toupper(c: CInt): CInt
