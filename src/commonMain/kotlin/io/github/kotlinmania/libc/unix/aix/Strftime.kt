// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong
