package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int
