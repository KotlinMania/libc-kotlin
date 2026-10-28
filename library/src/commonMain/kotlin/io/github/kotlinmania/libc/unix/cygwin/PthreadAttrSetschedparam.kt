package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int
