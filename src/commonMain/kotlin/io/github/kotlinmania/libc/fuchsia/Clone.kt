// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun clone(cb: ((COpaquePointer?) -> Int)?, childStack: COpaquePointer?, flags: Int, arg: COpaquePointer?, vararg args: Any?): Int
