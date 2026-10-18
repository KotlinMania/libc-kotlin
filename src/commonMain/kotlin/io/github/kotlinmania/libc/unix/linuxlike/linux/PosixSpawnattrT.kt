package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam

public data class PosixSpawnattrT(
    val flags: Short,
    val pgrp: Int,
    val sd: ULong,
    val ss: ULong,
    val prio: Int,
    val sp: SchedParam,
    val policy: Int,
)
