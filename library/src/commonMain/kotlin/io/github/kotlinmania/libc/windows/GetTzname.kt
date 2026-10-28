package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: Int): Int
