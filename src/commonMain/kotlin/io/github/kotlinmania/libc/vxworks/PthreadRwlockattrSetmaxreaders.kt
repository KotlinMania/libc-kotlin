package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: UInt): Int
