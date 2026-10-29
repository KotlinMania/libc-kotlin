package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun getprotobyname(name: String?): Protoent?
