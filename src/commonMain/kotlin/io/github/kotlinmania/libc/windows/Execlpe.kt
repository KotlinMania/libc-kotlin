// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun execlpe(path: String?, arg0: String?, vararg args: Any?): Long
