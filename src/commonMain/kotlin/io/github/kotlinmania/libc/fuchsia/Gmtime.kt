package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun gmtime(timeP: Long?): Tm?
