// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import kotlinx.cinterop.ExperimentalForeignApi
import platform.posix.isalnum
import platform.posix.isalpha
import platform.posix.isatty
import platform.posix.isblank
import platform.posix.iscntrl
import platform.posix.isdigit
import platform.posix.isgraph
import platform.posix.islower
import platform.posix.isprint
import platform.posix.ispunct
import platform.posix.isspace
import platform.posix.isupper
import platform.posix.isxdigit

public actual fun isalnum(c: CInt): CInt = platform.posix.isalnum(c)
public actual fun isalpha(c: CInt): CInt = platform.posix.isalpha(c)
public actual fun iscntrl(c: CInt): CInt = platform.posix.iscntrl(c)
public actual fun isdigit(c: CInt): CInt = platform.posix.isdigit(c)
public actual fun isgraph(c: CInt): CInt = platform.posix.isgraph(c)
public actual fun islower(c: CInt): CInt = platform.posix.islower(c)
public actual fun isprint(c: CInt): CInt = platform.posix.isprint(c)
public actual fun ispunct(c: CInt): CInt = platform.posix.ispunct(c)
public actual fun isspace(c: CInt): CInt = platform.posix.isspace(c)
public actual fun isupper(c: CInt): CInt = platform.posix.isupper(c)
public actual fun isxdigit(c: CInt): CInt = platform.posix.isxdigit(c)
public actual fun isblank(c: CInt): CInt = platform.posix.isblank(c)
public actual fun isatty(fd: CInt): CInt = platform.posix.isatty(fd)
