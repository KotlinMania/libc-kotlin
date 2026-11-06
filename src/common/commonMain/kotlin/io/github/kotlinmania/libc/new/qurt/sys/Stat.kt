// port-lint: source new/qurt/sys/stat.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.new.qurt.ModeT
import io.github.kotlinmania.libc.new.qurt.Stat

// Header: `sys / stat.h`

// File type constants for stat.stMode
public val S_IFMT: ModeT = 61440u

public val S_IFSOCK: ModeT = 49152u

public val S_IFLNK: ModeT = 40960u

public val S_IFREG: ModeT = 32768u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFIFO: ModeT = 4096u

// File permission constants
public val S_ISUID: ModeT = 2048u

public val S_ISGID: ModeT = 1024u

public val S_ISVTX: ModeT = 512u

public val S_IRWXU: ModeT = 448u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXG: ModeT = 56u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXO: ModeT = 7u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public fun stat(pathname: String?, statbuf: Stat?): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("stat", -1, longArrayOf(__cstr_0, statbuf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fstat(fd: CInt, statbuf: Stat?): CInt {
    return LibcDynamicFfi.invoke("fstat", -1, longArrayOf(fd.toLong(), statbuf?.value ?: 0L)).toInt()
}
