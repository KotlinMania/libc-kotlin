package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun semGetvalue(sem: SemT?, sval: Int?): Int
