package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun getgrouplist(name: String?, basegid: UInt, groups: UInt?, ngroups: Int?): Int
