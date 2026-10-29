package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int
