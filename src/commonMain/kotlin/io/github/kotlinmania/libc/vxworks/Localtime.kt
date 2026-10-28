package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun localtime(timeP: Long?): Tm?
