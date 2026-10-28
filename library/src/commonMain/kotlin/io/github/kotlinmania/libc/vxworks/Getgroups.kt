package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun getgroups(ngroupsMax: Int, groups: UShort?): Int
