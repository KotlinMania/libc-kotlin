package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun utimes(filename: String?, times: Timeval?): Int
