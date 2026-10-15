// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int
