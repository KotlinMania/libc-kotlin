// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun newlocale(arg1: Int, arg2: String?, arg3: ULong): ULong
