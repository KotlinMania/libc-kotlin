package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: Int): Int
