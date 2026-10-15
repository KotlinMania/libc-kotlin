// port-lint: source unix/nuttx/mod.rs
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun pthreadGetnameNp(thread: Int, name: String?, len: ULong): Int
