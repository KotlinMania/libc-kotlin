// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int
