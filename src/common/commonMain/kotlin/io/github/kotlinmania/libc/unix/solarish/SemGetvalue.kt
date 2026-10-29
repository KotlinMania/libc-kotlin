package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun semGetvalue(sem: SemT?, sval: Int?): Int
