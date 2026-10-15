// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun quotactl(cmd: Int, special: String?, id: Int, data: String?): Int
