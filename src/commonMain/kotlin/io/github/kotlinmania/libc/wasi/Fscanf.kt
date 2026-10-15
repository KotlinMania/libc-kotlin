// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int
