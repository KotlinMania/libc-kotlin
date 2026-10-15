// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun clone(cb: ((COpaquePointer?) -> Int)?, childStack: COpaquePointer?, flags: Int, arg: COpaquePointer?, vararg args: Any?): Int
