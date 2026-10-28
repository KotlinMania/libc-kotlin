package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun setreuid(ruid: UInt, euid: UInt): Int
