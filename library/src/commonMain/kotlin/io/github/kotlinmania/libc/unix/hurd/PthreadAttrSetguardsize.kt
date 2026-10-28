package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?, guardsize: ULong): Int
