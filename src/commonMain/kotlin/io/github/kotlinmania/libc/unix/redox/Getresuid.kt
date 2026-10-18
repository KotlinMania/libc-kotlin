package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun getresuid(ruid: Int?, euid: Int?, suid: Int?): Int
