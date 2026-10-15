// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int
