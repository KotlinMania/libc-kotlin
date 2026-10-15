// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun hostProcessorInfo(host: UInt, flavor: Int, outProcessorCount: UInt?, outProcessorInfo: Int?, outProcessorInfoCnt: UInt?): Int
