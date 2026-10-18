package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): Int
