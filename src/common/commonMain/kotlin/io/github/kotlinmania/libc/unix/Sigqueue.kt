package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun sigqueue(pid: Int, sig: Int, value: Sigval): Int
