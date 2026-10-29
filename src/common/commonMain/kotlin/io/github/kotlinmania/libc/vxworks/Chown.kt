package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun chown(path: String?, uid: UShort, gid: UShort): Int
