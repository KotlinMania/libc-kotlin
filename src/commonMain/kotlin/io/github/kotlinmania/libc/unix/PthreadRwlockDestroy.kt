// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockDestroy(lock: io.github.kotlinmania.libc.COpaquePointer?): Int
