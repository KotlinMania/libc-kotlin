// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun sendfilev(fildes: Int, vec: SendfilevecT?, sfvcnt: Int, xferred: ULong?): Long
