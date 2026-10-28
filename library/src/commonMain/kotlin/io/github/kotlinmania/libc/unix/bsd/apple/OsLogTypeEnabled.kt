package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun osLogTypeEnabled(oslog: io.github.kotlinmania.libc.COpaquePointer?, tpe: UByte): Boolean
