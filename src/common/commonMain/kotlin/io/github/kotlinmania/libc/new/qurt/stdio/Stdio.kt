// port-lint: source new/qurt/stdio.rs
package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `stdio.h`

// Buffer size
public val BUFSIZ: CUint = 1024u

public val FILENAME_MAX: CUint = 260u

// End of file
public val EOF: CInt = -1

// File operations
public expect fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr

public expect fun freopen(filename: ConstPtr, mode: ConstPtr, stream: MutPtr): MutPtr

public expect fun fclose(stream: MutPtr): CInt

public expect fun fflush(stream: MutPtr): CInt

public expect fun fread(ptr: MutPtr, size: SizeT, nmemb: SizeT, stream: MutPtr): SizeT

public expect fun fwrite(ptr: ConstPtr, size: SizeT, nmemb: SizeT, stream: MutPtr): SizeT

// Character I/O
public expect fun fgetc(stream: MutPtr): CInt

public expect fun fputc(c: CInt, stream: MutPtr): CInt

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun ungetc(c: CInt, stream: MutPtr): CInt

// Line I/O
public expect fun fgets(s: MutPtr, size: CInt, stream: MutPtr): MutPtr

public expect fun fputs(s: ConstPtr, stream: MutPtr): CInt

public expect fun gets(s: MutPtr): MutPtr

public expect fun puts(s: ConstPtr): CInt

// Formatted I/O
public expect fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun vprintf(format: ConstPtr, ap: VaList): CInt

public expect fun vfprintf(stream: MutPtr, format: ConstPtr, ap: VaList): CInt

public expect fun vsprintf(s: MutPtr, format: ConstPtr, ap: VaList): CInt

public expect fun vsnprintf(s: MutPtr, n: SizeT, format: ConstPtr, ap: VaList): CInt

// Input formatted functions
public expect fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

// File positioning
public expect fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: MutPtr): CLong

public expect fun rewind(stream: MutPtr)

public expect fun fgetpos(stream: MutPtr, pos: MutPtr): CInt

public expect fun fsetpos(stream: MutPtr, pos: ConstPtr): CInt

// Error handling
public expect fun clearerr(stream: MutPtr)

public expect fun feof(stream: MutPtr): CInt

public expect fun ferror(stream: MutPtr): CInt

public expect fun perror(s: ConstPtr)

// File management
public expect fun remove(filename: ConstPtr): CInt

public expect fun rename(old: ConstPtr, new: ConstPtr): CInt

public expect fun tmpfile(): MutPtr

public expect fun tmpnam(s: MutPtr): MutPtr

// Buffer control
public expect fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr, buffer: MutPtr)
