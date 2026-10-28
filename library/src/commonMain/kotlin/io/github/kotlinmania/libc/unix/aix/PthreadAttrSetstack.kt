package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong): Int
