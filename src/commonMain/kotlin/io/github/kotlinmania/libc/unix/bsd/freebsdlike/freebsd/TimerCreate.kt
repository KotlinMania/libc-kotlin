package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun timerCreate(clockId: Int, evp: Sigevent?, timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int
