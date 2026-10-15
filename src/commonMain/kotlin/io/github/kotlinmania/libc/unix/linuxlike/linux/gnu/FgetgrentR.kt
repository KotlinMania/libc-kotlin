package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
