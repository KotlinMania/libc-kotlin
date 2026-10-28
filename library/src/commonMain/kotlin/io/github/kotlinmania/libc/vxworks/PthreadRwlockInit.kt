package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): Int
