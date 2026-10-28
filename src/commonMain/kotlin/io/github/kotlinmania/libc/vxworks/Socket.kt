package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun socket(domain: Int, type: Int, protocol: Int): Int
