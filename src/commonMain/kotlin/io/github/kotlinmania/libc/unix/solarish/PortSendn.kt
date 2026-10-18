package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun portSendn(portList: Int?, errorList: Int?, nent: UInt, events: Int, user: COpaquePointer?): Int
