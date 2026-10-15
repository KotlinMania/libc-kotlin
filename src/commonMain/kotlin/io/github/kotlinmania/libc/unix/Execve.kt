// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int
