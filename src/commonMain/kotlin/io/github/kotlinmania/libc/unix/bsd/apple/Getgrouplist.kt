// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun getgrouplist(name: String?, basegid: Int, groups: Int?, ngroups: Int?): Int
