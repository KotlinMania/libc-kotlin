// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int
