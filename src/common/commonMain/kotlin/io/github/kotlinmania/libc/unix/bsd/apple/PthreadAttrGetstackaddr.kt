package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int
