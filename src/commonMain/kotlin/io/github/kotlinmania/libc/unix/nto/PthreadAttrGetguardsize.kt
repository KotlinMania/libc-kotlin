package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int
