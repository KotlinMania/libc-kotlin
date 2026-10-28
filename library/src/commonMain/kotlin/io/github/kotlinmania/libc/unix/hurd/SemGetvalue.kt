package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun semGetvalue(sem: SemT?, sval: Int?): Int
