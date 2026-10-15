// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun portGet(port: Int, pe: PortEvent?, timeout: Timespec?): Int
