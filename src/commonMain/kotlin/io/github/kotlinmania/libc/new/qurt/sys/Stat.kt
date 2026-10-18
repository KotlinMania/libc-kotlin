// port-lint: source new/qurt/sys/stat.rs
package io.github.kotlinmania.libc.new.qurt.sys
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.qurt.Stat

public const val S_IFMT: UInt = 61440u
public const val S_IFSOCK: UInt = 49152u
public const val S_IFLNK: UInt = 40960u
public const val S_IFREG: UInt = 32768u
public const val S_IFBLK: UInt = 24576u
public const val S_IFDIR: UInt = 16384u
public const val S_IFCHR: UInt = 8192u
public const val S_IFIFO: UInt = 4096u
public const val S_ISUID: UInt = 2048u
public const val S_ISGID: UInt = 1024u
public const val S_ISVTX: UInt = 512u
public const val S_IRWXU: UInt = 448u
public const val S_IRUSR: UInt = 256u
public const val S_IWUSR: UInt = 128u
public const val S_IXUSR: UInt = 64u
public const val S_IRWXG: UInt = 56u
public const val S_IRGRP: UInt = 32u
public const val S_IWGRP: UInt = 16u
public const val S_IXGRP: UInt = 8u
public const val S_IRWXO: UInt = 7u
public const val S_IROTH: UInt = 4u
public const val S_IWOTH: UInt = 2u
public const val S_IXOTH: UInt = 1u

public expect fun stat(pathname: String?, statbuf: Stat?): Int

public expect fun fstat(fd: Int, statbuf: Stat?): Int
