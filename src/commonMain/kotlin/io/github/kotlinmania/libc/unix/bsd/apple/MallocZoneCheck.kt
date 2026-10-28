package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun mallocZoneCheck(zone: io.github.kotlinmania.libc.COpaquePointer?): Int
