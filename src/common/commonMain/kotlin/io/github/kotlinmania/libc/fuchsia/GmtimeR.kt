package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun gmtimeR(timeP: Long?, result: Tm?): Tm?
