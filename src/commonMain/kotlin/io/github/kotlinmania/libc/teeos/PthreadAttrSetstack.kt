package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: ULong): Int
