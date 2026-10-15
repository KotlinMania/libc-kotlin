package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun capRightsClear(rights: CapRightsT?, vararg args: Any?): CapRightsT?
