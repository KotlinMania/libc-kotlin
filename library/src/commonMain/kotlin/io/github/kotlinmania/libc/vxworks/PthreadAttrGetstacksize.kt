package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): Int
