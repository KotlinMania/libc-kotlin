// port-lint: source new/qurt/stdio.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.LibcDynamicFfi

// Header: `stdio.h`

// Buffer size
public val BUFSIZ: CUint = 1024u

public val FILENAME_MAX: CUint = 260u

// End of file
public val EOF: CInt = -1

// File operations
public fun fopen(filename: String?, mode: String?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fopen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("freopen", -1, longArrayOf(__cstr_0, __cstr_1, stream?.handle ?: 0L))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fclose(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fclose", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fflush(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fflush", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nmemb.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fwrite", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nmemb.toLong(), stream?.handle ?: 0L)).toULong()
}

// Character I/O
public fun fgetc(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fgetc", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fputc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fputc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun getchar(): CInt {
    return LibcDynamicFfi.invoke("getchar", -1, longArrayOf()).toInt()
}

public fun putchar(c: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar", -1, longArrayOf(c.toLong())).toInt()
}

public fun ungetc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ungetc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

// Line I/O
public fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("fgets", -1, longArrayOf(s?.value ?: 0L, size.toLong(), stream?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fputs(s: String?, stream: FILE?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("fputs", -1, longArrayOf(__cstr_0, stream?.handle ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun gets(s: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gets", -1, longArrayOf(s?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun puts(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("puts", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// Formatted I/O
public fun printf(format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("printf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("fprintf", 2, longArrayOf(stream?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("sprintf", 2, longArrayOf(s?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("snprintf", 3, longArrayOf(s?.value ?: 0L, n.toLong(), __cstr_2) + variadicArgs).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun vprintf(format: String?, ap: VaList): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("vprintf", -1, longArrayOf(__cstr_0, ap?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("vfprintf", -1, longArrayOf(stream?.handle ?: 0L, __cstr_1, ap?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("vsprintf", -1, longArrayOf(s?.value ?: 0L, __cstr_1, ap?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("vsnprintf", -1, longArrayOf(s?.value ?: 0L, n.toLong(), __cstr_2, ap?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

// Input formatted functions
public fun scanf(format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("scanf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("fscanf", 2, longArrayOf(stream?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("sscanf", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// File positioning
public fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseek", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftell(stream: FILE?): CLong {
    return LibcDynamicFfi.invoke("ftell", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun rewind(stream: FILE?) {
    LibcDynamicFfi.invoke("rewind", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun fgetpos(stream: FILE?, pos: FposT?): CInt {
    val __slot_1 = if (pos == null) 0L else LibcDynamicFfi.allocScalarSlot(pos)
    try {
        return LibcDynamicFfi.invoke("fgetpos", -1, longArrayOf(stream?.handle ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun fsetpos(stream: FILE?, pos: FposT?): CInt {
    val __slot_1 = if (pos == null) 0L else LibcDynamicFfi.allocScalarSlot(pos)
    try {
        return LibcDynamicFfi.invoke("fsetpos", -1, longArrayOf(stream?.handle ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// Error handling
public fun clearerr(stream: FILE?) {
    LibcDynamicFfi.invoke("clearerr", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun feof(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("feof", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun ferror(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ferror", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun perror(s: String?) {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        LibcDynamicFfi.invoke("perror", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// File management
public fun remove(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("remove", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rename(old: String?, new: String?): CInt {
    val __cstr_0 = if (old == null) 0L else LibcDynamicFfi.allocUtf8CString(old)
    val __cstr_1 = if (new == null) 0L else LibcDynamicFfi.allocUtf8CString(new)
    try {
        return LibcDynamicFfi.invoke("rename", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun tmpfile(): FILE? {
    val rawRet = LibcDynamicFfi.invoke("tmpfile", -1, longArrayOf())
    return if (rawRet == 0L) null else FILE(rawRet)
}

public fun tmpnam(s: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("tmpnam", -1, longArrayOf(s?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// Buffer control
public fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("setvbuf", -1, longArrayOf(stream?.handle ?: 0L, buffer?.value ?: 0L, mode.toLong(), size.toLong())).toInt()
}

public fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
    LibcDynamicFfi.invoke("setbuf", -1, longArrayOf(stream?.handle ?: 0L, buffer?.value ?: 0L))
}
