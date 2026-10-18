package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: io.github.kotlinmania.libc.COpaquePointer?): Int
