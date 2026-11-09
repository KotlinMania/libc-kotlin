package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.unix.newlib.SaFamilyT

public open class SockaddrUn(public var sunFamily: SaFamilyT, public var sunPath: List<CChar>)
