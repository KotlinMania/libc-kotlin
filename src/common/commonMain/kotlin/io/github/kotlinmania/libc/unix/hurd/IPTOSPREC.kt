package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public fun ipTosPrec(tos: UByte): UByte = tos and IPTOS_PREC_MASK
