package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun ecvt(x: Double, n: Int, dp: Int?, sign: Int?): String?
