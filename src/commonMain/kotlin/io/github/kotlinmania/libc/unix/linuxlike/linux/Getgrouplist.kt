package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int
