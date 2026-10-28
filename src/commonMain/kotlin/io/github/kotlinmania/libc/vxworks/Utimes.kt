package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun utimes(filename: String?, times: Timeval?): Int
