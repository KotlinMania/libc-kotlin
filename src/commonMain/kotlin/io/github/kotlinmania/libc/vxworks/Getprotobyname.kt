package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun getprotobyname(name: String?): Protoent?
