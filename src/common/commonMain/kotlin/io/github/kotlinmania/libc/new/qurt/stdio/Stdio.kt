// port-lint: source new/qurt/stdio.rs
package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.FposT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `stdio.h`

// Buffer size
public val BUFSIZ: CUint = 1024u

public val FILENAME_MAX: CUint = 260u

// End of file
public val EOF: CInt = -1

// File operations
public expect fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, stream: MutPtr<FILE>): MutPtr<FILE>

public expect fun fclose(stream: MutPtr<FILE>): CInt

public expect fun fflush(stream: MutPtr<FILE>): CInt

public expect fun fread(ptr: MutPtr<CVoid>, size: SizeT, nmemb: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nmemb: SizeT, stream: MutPtr<FILE>): SizeT

// Character I/O
public expect fun fgetc(stream: MutPtr<FILE>): CInt

public expect fun fputc(c: CInt, stream: MutPtr<FILE>): CInt

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt

// Line I/O
public expect fun fgets(s: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar>

public expect fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt

public expect fun gets(s: MutPtr<CChar>): MutPtr<CChar>

public expect fun puts(s: ConstPtr<CChar>): CInt

// Formatted I/O
public expect fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun vprintf(format: ConstPtr<CChar>, ap: VaList): CInt

public expect fun vfprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, ap: VaList): CInt

public expect fun vsprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, ap: VaList): CInt

public expect fun vsnprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, ap: VaList): CInt

// Input formatted functions
public expect fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

// File positioning
public expect fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: MutPtr<FILE>): CLong

public expect fun rewind(stream: MutPtr<FILE>)

public expect fun fgetpos(stream: MutPtr<FILE>, pos: MutPtr<FposT>): CInt

public expect fun fsetpos(stream: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt

// Error handling
public expect fun clearerr(stream: MutPtr<FILE>)

public expect fun feof(stream: MutPtr<FILE>): CInt

public expect fun ferror(stream: MutPtr<FILE>): CInt

public expect fun perror(s: ConstPtr<CChar>)

// File management
public expect fun remove(filename: ConstPtr<CChar>): CInt

public expect fun rename(old: ConstPtr<CChar>, new: ConstPtr<CChar>): CInt

public expect fun tmpfile(): MutPtr<FILE>

public expect fun tmpnam(s: MutPtr<CChar>): MutPtr<CChar>

// Buffer control
public expect fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>)
