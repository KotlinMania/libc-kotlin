package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public expect fun timegm64(tm: ConstPtr): Time64T
