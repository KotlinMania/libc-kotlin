package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun timegm(tm: Tm?): Long
