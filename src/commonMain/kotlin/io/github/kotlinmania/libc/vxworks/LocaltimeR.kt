package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun localtimeR(timeP: Long?, result: Tm?): Tm?
