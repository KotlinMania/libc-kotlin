// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public fun cpuCountS(size: ULong, cpuset: CpuSetT): Int {
    val words = size / 8uL
    require(words <= cpuset.bits.size.toULong())
    var count = 0
    for (index in 0 until words.toInt()) {
        count += cpuset.bits[index].countOneBits()
    }
    return count
}
