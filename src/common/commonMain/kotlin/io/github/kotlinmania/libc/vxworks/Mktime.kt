package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun mktime(tm: Tm?): Long
