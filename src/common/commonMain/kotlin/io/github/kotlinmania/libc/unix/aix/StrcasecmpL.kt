package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun strcasecmpL(string1: String?, string2: String?, locale: io.github.kotlinmania.libc.COpaquePointer?): Int
