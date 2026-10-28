package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun getdomainname(name: String?, len: Int): Int
