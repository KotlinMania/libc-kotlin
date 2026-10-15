// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int
