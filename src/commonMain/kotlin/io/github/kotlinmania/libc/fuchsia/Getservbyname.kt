package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun getservbyname(name: String?, proto: String?): Servent?
