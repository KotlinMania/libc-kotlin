// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun execl(path: String?, arg0: String?, vararg args: Any?): Int
