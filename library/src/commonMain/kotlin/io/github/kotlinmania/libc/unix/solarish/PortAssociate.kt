package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun portAssociate(port: Int, source: Int, `object`: ULong, events: Int, user: COpaquePointer?): Int
