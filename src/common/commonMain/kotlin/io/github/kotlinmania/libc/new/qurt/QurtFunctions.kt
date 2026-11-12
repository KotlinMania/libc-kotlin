package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Directory functions (dirent.h)
public expect fun opendir(name: ConstPtr<CChar>): MutPtr<DIR>

public expect fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent>

public expect fun closedir(dirp: ConstPtr<DIR>): CInt

public expect fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt

// Additional pthread functions
public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt

// Additional time functions
public expect fun clockGetcpuclockid(pid: PidT, clockId: MutPtr<ClockidT>): CInt

// POSIX semaphore functions
public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

// Additional stdlib functions
public expect fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid>

// String functions (string.h)
public expect fun strlen(s: ConstPtr<CChar>): SizeT

public expect fun strcpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strcat(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncat(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strcmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt

public expect fun strncmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt

public expect fun strcoll(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt

public expect fun strxfrm(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun strchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strrchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strspn(s: ConstPtr<CChar>, accept: ConstPtr<CChar>): SizeT

public expect fun strcspn(s: ConstPtr<CChar>, reject: ConstPtr<CChar>): SizeT

public expect fun strpbrk(s: ConstPtr<CChar>, accept: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strstr(haystack: ConstPtr<CChar>, needle: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strtok(s: MutPtr<CChar>, delim: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strerror(errnum: CInt): MutPtr<CChar>

public expect fun memchr(s: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun memcmp(s1: ConstPtr<CVoid>, s2: ConstPtr<CVoid>, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memset(s: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

// Additional unistd functions
public expect fun fork(): PidT

public expect fun execve(filename: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

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
