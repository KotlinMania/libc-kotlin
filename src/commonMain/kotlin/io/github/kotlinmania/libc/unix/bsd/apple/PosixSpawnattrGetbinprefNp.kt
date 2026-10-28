package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetbinprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, ocount: ULong?): Int
