package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun threadPolicySet(thread: UInt, flavor: UInt, policyInfo: Int?, count: UInt): Int
