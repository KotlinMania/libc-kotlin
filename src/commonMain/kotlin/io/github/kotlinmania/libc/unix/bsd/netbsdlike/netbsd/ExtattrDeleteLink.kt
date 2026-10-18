package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int
