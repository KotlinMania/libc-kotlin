package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): Int
