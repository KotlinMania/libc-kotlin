// port-lint: source new/qurt/sys/stat.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

/**
 * Header: `sys/stat.h`.
 *
 * Values are the upstream octal constants written in hex (Kotlin has no octal literal).
 */

public const val S_IFMT: ModeT = 0xF000u // 0o170000
public const val S_IFSOCK: ModeT = 0xC000u // 0o140000
public const val S_IFLNK: ModeT = 0xA000u // 0o120000
public const val S_IFREG: ModeT = 0x8000u // 0o100000
public const val S_IFBLK: ModeT = 0x6000u // 0o060000
public const val S_IFDIR: ModeT = 0x4000u // 0o040000
public const val S_IFCHR: ModeT = 0x2000u // 0o020000
public const val S_IFIFO: ModeT = 0x1000u // 0o010000

public const val S_ISUID: ModeT = 0x800u // 0o4000
public const val S_ISGID: ModeT = 0x400u // 0o2000
public const val S_ISVTX: ModeT = 0x200u // 0o1000
public const val S_IRWXU: ModeT = 0x1C0u // 0o0700
public const val S_IRUSR: ModeT = 0x100u // 0o0400
public const val S_IWUSR: ModeT = 0x80u // 0o0200
public const val S_IXUSR: ModeT = 0x40u // 0o0100
public const val S_IRWXG: ModeT = 0x38u // 0o0070
public const val S_IRGRP: ModeT = 0x20u // 0o0040
public const val S_IWGRP: ModeT = 0x10u // 0o0020
public const val S_IXGRP: ModeT = 0x8u // 0o0010
public const val S_IRWXO: ModeT = 0x7u // 0o0007
public const val S_IROTH: ModeT = 0x4u // 0o0004
public const val S_IWOTH: ModeT = 0x2u // 0o0002
public const val S_IXOTH: ModeT = 0x1u // 0o0001

public expect fun stat(pathname: String?, statbuf: Stat?): CInt

public expect fun fstat(fd: CInt, statbuf: Stat?): CInt
