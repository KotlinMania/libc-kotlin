package io.github.kotlinmania.libc.unix.linuxlike.android.b64
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

import io.github.kotlinmania.libc.*

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int
