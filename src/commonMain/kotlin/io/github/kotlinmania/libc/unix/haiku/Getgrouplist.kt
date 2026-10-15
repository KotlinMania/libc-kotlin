// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun getgrouplist(user: String?, basegroup: UInt, grouplist: UInt?, groupcount: Int?): Int
