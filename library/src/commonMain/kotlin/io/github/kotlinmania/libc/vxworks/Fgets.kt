package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fgets(buf: String?, n: Int, stream: FILE?): String?
