package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun capRightsIsSet(rights: CapRightsT?, vararg args: Any?): Boolean
