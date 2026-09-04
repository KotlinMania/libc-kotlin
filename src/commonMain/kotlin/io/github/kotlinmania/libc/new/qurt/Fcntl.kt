// port-lint: source new/qurt/fcntl.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val O_RDONLY: CInt = 0x0000
public const val O_WRONLY: CInt = 0x0001
public const val O_RDWR: CInt = 0x0002
public const val O_ACCMODE: CInt = 0x0003
public const val O_CREAT: CInt = 0x0040
public const val O_EXCL: CInt = 0x0080
public const val O_NOCTTY: CInt = 0x0100
public const val O_TRUNC: CInt = 0x0200
public const val O_APPEND: CInt = 0x0400
public const val O_NONBLOCK: CInt = 0x0800
public const val O_SYNC: CInt = 0x1000
public const val O_FSYNC: CInt = O_SYNC
public const val O_DSYNC: CInt = 0x1000
public const val O_DIRECTORY: CInt = 0x10000
public const val O_NOFOLLOW: CInt = 0x20000
public const val O_CLOEXEC: CInt = 0x80000
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_GETLK: CInt = 5
public const val F_SETLK: CInt = 6
public const val F_SETLKW: CInt = 7
public const val F_DUPFD_CLOEXEC: CInt = 1030
public const val FD_CLOEXEC: CInt = 1
public const val F_RDLCK: CInt = 0
public const val F_WRLCK: CInt = 1
public const val F_UNLCK: CInt = 2

public expect fun open(pathname: String?, flags: CInt, vararg args: Any?): CInt 
public expect fun creat(pathname: String?, mode: ModeT): CInt 
public expect fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt 