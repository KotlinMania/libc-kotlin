@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

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

public actual fun isalnum(c: Int): Int = libc.cinterop.libc_isalnum(c)

public actual fun isalpha(c: Int): Int = libc.cinterop.libc_isalpha(c)

public actual fun iscntrl(c: Int): Int = libc.cinterop.libc_iscntrl(c)

public actual fun isdigit(c: Int): Int = libc.cinterop.libc_isdigit(c)

public actual fun isgraph(c: Int): Int = libc.cinterop.libc_isgraph(c)

public actual fun islower(c: Int): Int = libc.cinterop.libc_islower(c)

public actual fun isprint(c: Int): Int = libc.cinterop.libc_isprint(c)

public actual fun ispunct(c: Int): Int = libc.cinterop.libc_ispunct(c)

public actual fun isspace(c: Int): Int = libc.cinterop.libc_isspace(c)

public actual fun isupper(c: Int): Int = libc.cinterop.libc_isupper(c)

public actual fun isxdigit(c: Int): Int = libc.cinterop.libc_isxdigit(c)

public actual fun isblank(c: Int): Int = libc.cinterop.libc_isblank(c)

public actual fun isatty(fd: Int): Int = libc.cinterop.libc_isatty(fd)
