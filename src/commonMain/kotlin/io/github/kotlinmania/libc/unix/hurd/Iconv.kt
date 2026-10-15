package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong
