// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun socket(domain: Int, ty: Int, protocol: Int): Int
