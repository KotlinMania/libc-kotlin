// port-lint: source new/qurt/stdio.rs
package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList

// Header: `stdio.h`

// Buffer size
public val BUFSIZ: CUint = 1024u

public val FILENAME_MAX: CUint = 260u

// End of file
public val EOF: CInt = -1

// File operations
public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, stream: FILE?): FILE?

public expect fun fclose(stream: FILE?): CInt

public expect fun fflush(stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT

public expect fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT

// Character I/O
public expect fun fgetc(stream: FILE?): CInt

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

// Line I/O
public expect fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer?

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun gets(s: COpaquePointer?): COpaquePointer?

public expect fun puts(s: String?): CInt

// Formatted I/O
public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt

public expect fun vprintf(format: String?, ap: VaList): CInt

public expect fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt

public expect fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt

public expect fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt

// Input formatted functions
public expect fun scanf(format: String?, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt

// File positioning
public expect fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: FILE?): CLong

public expect fun rewind(stream: FILE?)

public expect fun fgetpos(stream: FILE?, pos: COpaquePointer?): CInt

public expect fun fsetpos(stream: FILE?, pos: COpaquePointer?): CInt

// Error handling
public expect fun clearerr(stream: FILE?)

public expect fun feof(stream: FILE?): CInt

public expect fun ferror(stream: FILE?): CInt

public expect fun perror(s: String?)

// File management
public expect fun remove(filename: String?): CInt

public expect fun rename(old: String?, new: String?): CInt

public expect fun tmpfile(): FILE?

public expect fun tmpnam(s: COpaquePointer?): COpaquePointer?

// Buffer control
public expect fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: FILE?, buffer: COpaquePointer?)
