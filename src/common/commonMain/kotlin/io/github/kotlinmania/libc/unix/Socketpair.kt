package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun socketpair(domain: Int, type: Int, protocol: Int, socketVector: Int?): Int
