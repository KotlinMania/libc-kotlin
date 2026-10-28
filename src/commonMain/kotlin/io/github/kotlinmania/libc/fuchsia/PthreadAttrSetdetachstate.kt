package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int
