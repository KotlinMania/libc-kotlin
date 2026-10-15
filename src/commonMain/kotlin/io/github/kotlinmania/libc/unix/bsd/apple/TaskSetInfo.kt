// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun taskSetInfo(targetTask: UInt, flavor: UInt, taskInfoIn: Int?, taskInfoInCnt: UInt): Int
