package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): Int
