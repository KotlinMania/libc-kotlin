// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun regexec(preg: RegexT?, str: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int
