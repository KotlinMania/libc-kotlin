// port-lint: source new/qurt/fcntl.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.LibcDynamicFfi

// Header: `fcntl.h`

// File access modes
public val O_RDONLY: CInt = 0x0000

public val O_WRONLY: CInt = 0x0001

public val O_RDWR: CInt = 0x0002

public val O_ACCMODE: CInt = 0x0003

// File creation flags
public val O_CREAT: CInt = 0x0040

public val O_EXCL: CInt = 0x0080

public val O_NOCTTY: CInt = 0x0100

public val O_TRUNC: CInt = 0x0200

// File status flags
public val O_APPEND: CInt = 0x0400

public val O_NONBLOCK: CInt = 0x0800

public val O_SYNC: CInt = 0x1000

public val O_FSYNC: CInt = O_SYNC

public val O_DSYNC: CInt = 0x1000

public val O_DIRECTORY: CInt = 0x10000

public val O_NOFOLLOW: CInt = 0x20000

public val O_CLOEXEC: CInt = 0x80000

// fcntl() commands
public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETLK: CInt = 5

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_DUPFD_CLOEXEC: CInt = 1030

// File descriptor flags
public val FD_CLOEXEC: CInt = 1

// Lock types for fcntl()
public val F_RDLCK: CInt = 0

public val F_WRLCK: CInt = 1

public val F_UNLCK: CInt = 2

// Functions
public fun open(pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("open", 2, longArrayOf(__cstr_0, flags.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun creat(pathname: String?, mode: ModeT): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("creat", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("fcntl", 2, longArrayOf(fd.toLong(), cmd.toLong()) + variadicArgs).toInt()
}
