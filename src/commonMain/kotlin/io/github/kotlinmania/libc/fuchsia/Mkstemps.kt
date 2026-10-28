package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun mkstemps(template: String?, suffixlen: Int): Int
