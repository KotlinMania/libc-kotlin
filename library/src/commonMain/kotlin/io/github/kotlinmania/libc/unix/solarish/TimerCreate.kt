package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun timerCreate(clockId: Int, evp: Sigevent?, timerid: Int?): Int
