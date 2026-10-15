// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int
