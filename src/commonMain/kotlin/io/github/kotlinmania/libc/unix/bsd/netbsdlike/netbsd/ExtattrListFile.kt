package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun extattrListFile(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long
