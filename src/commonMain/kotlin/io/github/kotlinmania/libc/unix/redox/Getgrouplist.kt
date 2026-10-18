package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun getgrouplist(user: String?, group: Int, groups: Int?, ngroups: Int?): Int
