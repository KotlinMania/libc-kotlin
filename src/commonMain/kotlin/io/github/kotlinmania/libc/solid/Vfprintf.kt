// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun vfprintf(arg1: FILE?, arg2: String?, arg3: String?): Int
