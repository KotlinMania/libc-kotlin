// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PosixSpawnattrT(
    val flags: Short,
    val pgrp: Int,
    val sd: ULong,
    val ss: ULong,
    val sp: SchedParam,
    val policy: Int,
)
