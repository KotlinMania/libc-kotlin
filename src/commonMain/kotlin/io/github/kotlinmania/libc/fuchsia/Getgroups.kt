package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun getgroups(ngroupsMax: Int, groups: UInt?): Int
