package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun semGetvalue(sem: SemT?, valp: Int?): Int
