package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long
