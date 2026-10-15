// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int
