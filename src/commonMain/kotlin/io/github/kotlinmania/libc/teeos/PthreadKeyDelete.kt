// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadKeyDelete(key: UInt): Int
