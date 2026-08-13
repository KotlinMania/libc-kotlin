// port-lint: source new/qurt/sys/stat.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public const val S_IFMT: ModeT = 61440u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFREG: ModeT = 32768u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFIFO: ModeT = 4096u
public const val S_ISUID: ModeT = 2048u
public const val S_ISGID: ModeT = 1024u
public const val S_ISVTX: ModeT = 512u
public const val S_IRWXU: ModeT = 448u
public const val S_IRUSR: ModeT = 256u
public const val S_IWUSR: ModeT = 128u
public const val S_IXUSR: ModeT = 64u
public const val S_IRWXG: ModeT = 56u
public const val S_IRGRP: ModeT = 32u
public const val S_IWGRP: ModeT = 16u
public const val S_IXGRP: ModeT = 8u
public const val S_IRWXO: ModeT = 7u
public const val S_IROTH: ModeT = 4u
public const val S_IWOTH: ModeT = 2u
public const val S_IXOTH: ModeT = 1u

public fun stat(pathname: String?, statbuf: Stat?): CInt = -1

public fun fstat(fd: CInt, statbuf: Stat?): CInt = -1
