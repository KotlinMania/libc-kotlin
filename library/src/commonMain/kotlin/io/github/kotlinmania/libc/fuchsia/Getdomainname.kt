package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun getdomainname(name: String?, len: ULong): Int
