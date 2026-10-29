package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetstack(attr: UInt?, stackaddr: COpaquePointer?, stacksize: ULong?): Int
