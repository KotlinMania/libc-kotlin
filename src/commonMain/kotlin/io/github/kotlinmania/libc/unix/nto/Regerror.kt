// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong
