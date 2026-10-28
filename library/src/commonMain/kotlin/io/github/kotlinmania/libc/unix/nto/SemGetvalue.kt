package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun semGetvalue(sem: io.github.kotlinmania.libc.unix.nto.SyncT?, sval: Int?): Int
