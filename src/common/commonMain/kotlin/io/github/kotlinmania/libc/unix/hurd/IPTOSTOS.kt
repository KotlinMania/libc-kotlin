package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public fun ipTosTos(tos: UByte): UByte = tos and IPTOS_TOS_MASK
