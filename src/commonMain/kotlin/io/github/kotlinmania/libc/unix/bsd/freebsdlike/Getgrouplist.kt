// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun getgrouplist(name: String?, basegid: UInt, groups: UInt?, ngroups: Int?): Int
