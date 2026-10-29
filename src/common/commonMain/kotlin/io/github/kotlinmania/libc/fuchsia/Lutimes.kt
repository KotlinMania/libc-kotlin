package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun lutimes(file: String?, times: Timeval?): Int
