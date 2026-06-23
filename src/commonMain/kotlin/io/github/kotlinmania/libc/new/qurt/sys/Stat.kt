// port-lint: source new/qurt/sys/stat.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public const val S_IFMT: ModeT = 61440
public const val S_IFSOCK: ModeT = 49152
public const val S_IFLNK: ModeT = 40960
public const val S_IFREG: ModeT = 32768
public const val S_IFBLK: ModeT = 24576
public const val S_IFDIR: ModeT = 16384
public const val S_IFCHR: ModeT = 8192
public const val S_IFIFO: ModeT = 4096
public const val S_ISUID: ModeT = 2048
public const val S_ISGID: ModeT = 1024
public const val S_ISVTX: ModeT = 512
public const val S_IRWXU: ModeT = 448
public const val S_IRUSR: ModeT = 256
public const val S_IWUSR: ModeT = 128
public const val S_IXUSR: ModeT = 64
public const val S_IRWXG: ModeT = 56
public const val S_IRGRP: ModeT = 32
public const val S_IWGRP: ModeT = 16
public const val S_IXGRP: ModeT = 8
public const val S_IRWXO: ModeT = 7
public const val S_IROTH: ModeT = 4
public const val S_IWOTH: ModeT = 2
public const val S_IXOTH: ModeT = 1

public expect fun stat(pathname: String?, statbuf: Stat?): CInt
public expect fun fstat(fd: CInt, statbuf: Stat?): CInt
