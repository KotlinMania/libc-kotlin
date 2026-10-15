// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int
