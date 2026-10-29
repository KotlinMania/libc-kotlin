package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: Int): Int
