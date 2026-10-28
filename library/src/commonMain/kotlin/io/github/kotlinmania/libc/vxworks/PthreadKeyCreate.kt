package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadKeyCreate(key: ULong?, dtor: ((COpaquePointer?) -> Unit)?): Int
