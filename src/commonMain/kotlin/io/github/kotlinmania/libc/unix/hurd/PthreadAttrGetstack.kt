package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?, stackaddr: COpaquePointer?, stacksize: ULong?): Int
