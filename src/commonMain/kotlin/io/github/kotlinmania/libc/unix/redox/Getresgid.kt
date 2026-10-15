package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun getresgid(rgid: Int?, egid: Int?, sgid: Int?): Int
