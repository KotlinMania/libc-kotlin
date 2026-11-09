package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public val RAND_MAX: CInt = 0x7ffffffd

public val ELAST: CInt = 97

/**
 * max length of devicename
 */
public val SPECNAMELEN: CInt = 63

public val KI_NSPARE_PTR: Int = 6

public val MINCORE_SUPER: CInt = 0x20
