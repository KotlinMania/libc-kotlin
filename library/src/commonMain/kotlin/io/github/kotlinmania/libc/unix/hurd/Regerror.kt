package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong
