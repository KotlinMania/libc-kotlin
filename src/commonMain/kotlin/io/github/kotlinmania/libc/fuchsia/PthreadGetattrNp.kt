package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadGetattrNp(native: ULong, attr: PthreadAttrT?): Int
