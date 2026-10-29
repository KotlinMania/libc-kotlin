package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun lchown(path: String?, uid: UInt, gid: UInt): Int
