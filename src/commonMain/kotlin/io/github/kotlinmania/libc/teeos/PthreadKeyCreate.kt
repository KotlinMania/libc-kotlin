// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadKeyCreate(key: UInt?, dtor: ((COpaquePointer?) -> Unit)?): Int
