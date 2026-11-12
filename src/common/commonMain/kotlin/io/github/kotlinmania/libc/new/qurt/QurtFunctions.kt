package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Directory functions (dirent.h)
public expect fun opendir(name: ConstPtr): MutPtr

public expect fun readdir(dirp: MutPtr): MutPtr

public expect fun closedir(dirp: ConstPtr): CInt

public expect fun mkdir(path: ConstPtr, mode: ModeT): CInt

// Additional pthread functions
public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt

// Additional time functions
public expect fun clockGetcpuclockid(pid: PidT, clockId: MutPtr): CInt

// POSIX semaphore functions
public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun semClose(sem: MutPtr): CInt

public expect fun semUnlink(name: ConstPtr): CInt

// Additional stdlib functions
public expect fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr

// String functions (string.h)
public expect fun strlen(s: ConstPtr): SizeT

public expect fun strcpy(dest: MutPtr, src: ConstPtr): MutPtr

public expect fun strncpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun strcat(dest: MutPtr, src: ConstPtr): MutPtr

public expect fun strncat(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun strcmp(s1: ConstPtr, s2: ConstPtr): CInt

public expect fun strncmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt

public expect fun strcoll(s1: ConstPtr, s2: ConstPtr): CInt

public expect fun strxfrm(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT

public expect fun strchr(s: ConstPtr, c: CInt): MutPtr

public expect fun strrchr(s: ConstPtr, c: CInt): MutPtr

public expect fun strspn(s: ConstPtr, accept: ConstPtr): SizeT

public expect fun strcspn(s: ConstPtr, reject: ConstPtr): SizeT

public expect fun strpbrk(s: ConstPtr, accept: ConstPtr): MutPtr

public expect fun strstr(haystack: ConstPtr, needle: ConstPtr): MutPtr

public expect fun strtok(s: MutPtr, delim: ConstPtr): MutPtr

public expect fun strerror(errnum: CInt): MutPtr

public expect fun memchr(s: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun memcmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memset(s: MutPtr, c: CInt, n: SizeT): MutPtr

// Additional unistd functions
public expect fun fork(): PidT

public expect fun execve(filename: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

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
