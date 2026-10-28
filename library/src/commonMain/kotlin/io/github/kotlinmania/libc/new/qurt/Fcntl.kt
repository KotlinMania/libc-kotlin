// port-lint: source new/qurt/fcntl.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val O_RDONLY: Int = 0x0000
public const val O_WRONLY: Int = 0x0001
public const val O_RDWR: Int = 0x0002
public const val O_ACCMODE: Int = 0x0003
public const val O_CREAT: Int = 0x0040
public const val O_EXCL: Int = 0x0080
public const val O_NOCTTY: Int = 0x0100
public const val O_TRUNC: Int = 0x0200
public const val O_APPEND: Int = 0x0400
public const val O_NONBLOCK: Int = 0x0800
public const val O_SYNC: Int = 0x1000
public const val O_FSYNC: Int = O_SYNC
public const val O_DSYNC: Int = 0x1000
public const val O_DIRECTORY: Int = 0x10000
public const val O_NOFOLLOW: Int = 0x20000
public const val O_CLOEXEC: Int = 0x80000
public const val F_DUPFD: Int = 0
public const val F_GETFD: Int = 1
public const val F_SETFD: Int = 2
public const val F_GETFL: Int = 3
public const val F_SETFL: Int = 4
public const val F_GETLK: Int = 5
public const val F_SETLK: Int = 6
public const val F_SETLKW: Int = 7
public const val F_DUPFD_CLOEXEC: Int = 1030
public const val FD_CLOEXEC: Int = 1
public const val F_RDLCK: Int = 0
public const val F_WRLCK: Int = 1
public const val F_UNLCK: Int = 2

public expect fun open(pathname: String?, flags: Int, vararg args: Any?): Int

public expect fun creat(pathname: String?, mode: UInt): Int

public expect fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int
