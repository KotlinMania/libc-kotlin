package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun processorInfo(processorid: Int, infop: ProcessorInfoT?): Int
