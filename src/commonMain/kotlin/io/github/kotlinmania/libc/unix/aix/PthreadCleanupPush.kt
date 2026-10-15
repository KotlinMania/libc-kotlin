// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadCleanupPush(routine: ((COpaquePointer?) -> Unit)?, arg: COpaquePointer?): COpaquePointer?
