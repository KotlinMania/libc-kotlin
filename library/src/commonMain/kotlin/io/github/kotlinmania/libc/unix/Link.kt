package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun link(src: String?, dst: String?): Int
