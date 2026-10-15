package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun fhreadlink(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, buf: String?, bufsize: ULong): Int
