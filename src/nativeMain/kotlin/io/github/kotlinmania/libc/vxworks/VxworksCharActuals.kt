// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import kotlinx.cinterop.ExperimentalForeignApi
import libc.cinterop.libc_isalnum
import libc.cinterop.libc_isalpha
import libc.cinterop.libc_isatty
import libc.cinterop.libc_isblank
import libc.cinterop.libc_iscntrl
import libc.cinterop.libc_isdigit
import libc.cinterop.libc_isgraph
import libc.cinterop.libc_islower
import libc.cinterop.libc_isprint
import libc.cinterop.libc_ispunct
import libc.cinterop.libc_isspace
import libc.cinterop.libc_isupper
import libc.cinterop.libc_isxdigit

public actual fun isalnum(c: CInt): CInt = libc.cinterop.libc_isalnum(c)
public actual fun isalpha(c: CInt): CInt = libc.cinterop.libc_isalpha(c)
public actual fun iscntrl(c: CInt): CInt = libc.cinterop.libc_iscntrl(c)
public actual fun isdigit(c: CInt): CInt = libc.cinterop.libc_isdigit(c)
public actual fun isgraph(c: CInt): CInt = libc.cinterop.libc_isgraph(c)
public actual fun islower(c: CInt): CInt = libc.cinterop.libc_islower(c)
public actual fun isprint(c: CInt): CInt = libc.cinterop.libc_isprint(c)
public actual fun ispunct(c: CInt): CInt = libc.cinterop.libc_ispunct(c)
public actual fun isspace(c: CInt): CInt = libc.cinterop.libc_isspace(c)
public actual fun isupper(c: CInt): CInt = libc.cinterop.libc_isupper(c)
public actual fun isxdigit(c: CInt): CInt = libc.cinterop.libc_isxdigit(c)
public actual fun isblank(c: CInt): CInt = libc.cinterop.libc_isblank(c)
public actual fun isatty(fd: CInt): CInt = libc.cinterop.libc_isatty(fd)
