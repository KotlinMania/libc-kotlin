package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun chown(path: String?, uid: UInt, gid: UInt): Int
