package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun ifIndextoname(ifindex: UInt, ifname: String?): String?
