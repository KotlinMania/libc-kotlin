// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun readlinkat(dirfd: Int, pathname: String?, buf: COpaquePointer?, bufsiz: ULong): Int
