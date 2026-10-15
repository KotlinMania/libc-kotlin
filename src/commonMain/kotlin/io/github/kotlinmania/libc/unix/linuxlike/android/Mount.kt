// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int
