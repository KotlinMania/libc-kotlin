package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun adjtime(delta: Timeval?, olddelta: Timeval?): Int
