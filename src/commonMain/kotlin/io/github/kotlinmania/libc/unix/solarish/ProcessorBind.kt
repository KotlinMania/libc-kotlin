package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun processorBind(idtype: UInt, id: Int, newBinding: Int, oldBinding: Int?): Int
