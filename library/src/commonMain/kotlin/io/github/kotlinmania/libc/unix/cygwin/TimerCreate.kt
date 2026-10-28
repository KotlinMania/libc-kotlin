package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun timerCreate(clockid: ULong, sevp: Sigevent?, timerid: ULong?): Int
