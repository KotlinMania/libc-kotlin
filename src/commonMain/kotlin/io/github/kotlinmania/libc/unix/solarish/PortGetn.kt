// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun portGetn(port: Int, peList: PortEvent?, max: UInt, nget: UInt?, timeout: Timespec?): Int
