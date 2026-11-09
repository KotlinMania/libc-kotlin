package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

public expect fun timegm64(tm: COpaquePointer?): Time64T
