package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.unix.bsd.apple.GlobT

import io.github.kotlinmania.libc.*

public expect fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int
