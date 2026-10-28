package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun threadPolicyGet(thread: UInt, flavor: UInt, policyInfo: Int?, count: UInt?, getDefault: Int?): Int
