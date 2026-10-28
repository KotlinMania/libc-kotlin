package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun socket(domain: Int, ty: Int, protocol: Int): Int
