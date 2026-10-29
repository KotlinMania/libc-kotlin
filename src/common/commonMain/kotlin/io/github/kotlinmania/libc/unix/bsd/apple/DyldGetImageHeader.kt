package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun dyldGetImageHeader(imageIndex: UInt): MachHeader?
