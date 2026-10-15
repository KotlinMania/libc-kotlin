// port-lint: source unix/linux_like/android/b64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int
