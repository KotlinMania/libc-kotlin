package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int
