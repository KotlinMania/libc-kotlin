package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun systemPropertyForeach(callback: ((PropInfo?, COpaquePointer?) -> Unit)?, cookie: COpaquePointer?): Int
