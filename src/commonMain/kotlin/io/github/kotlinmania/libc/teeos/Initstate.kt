package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun initstate(seed: UInt, state: String?, size: ULong): String?
