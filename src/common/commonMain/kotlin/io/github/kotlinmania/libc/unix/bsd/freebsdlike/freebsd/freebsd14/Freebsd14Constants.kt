package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public val RAND_MAX: CInt = 0x7fffffff

public val ELAST: CInt = 97

public val KF_TYPE_EVENTFD: CInt = 13

/**
 * max length of devicename
 */
public val SPECNAMELEN: CInt = 255

public val KI_NSPARE_PTR: Int = 5

/**
 * domainset policies
 */
public val DOMAINSET_POLICY_INVALID: CInt = 0

public val DOMAINSET_POLICY_ROUNDROBIN: CInt = 1

public val DOMAINSET_POLICY_FIRSTTOUCH: CInt = 2

public val DOMAINSET_POLICY_PREFER: CInt = 3

public val DOMAINSET_POLICY_INTERLEAVE: CInt = 4

public val MINCORE_SUPER: CInt = 0x60
