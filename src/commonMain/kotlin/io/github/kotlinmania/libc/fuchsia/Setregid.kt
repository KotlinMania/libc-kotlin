package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun setregid(rgid: UInt, egid: UInt): Int
