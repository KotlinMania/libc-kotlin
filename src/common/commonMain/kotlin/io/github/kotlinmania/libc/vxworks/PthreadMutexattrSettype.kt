package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: Int): Int
