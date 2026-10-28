package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: UInt?): Int
