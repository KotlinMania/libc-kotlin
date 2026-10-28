package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun getsid(pid: Int): Int
