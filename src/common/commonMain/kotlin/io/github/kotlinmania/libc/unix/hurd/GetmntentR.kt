package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: Int): Mntent?
