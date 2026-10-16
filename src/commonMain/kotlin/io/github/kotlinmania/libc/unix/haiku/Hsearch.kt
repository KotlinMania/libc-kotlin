package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun hsearch(entry: io.github.kotlinmania.libc.unix.haiku.Entry, action: Int): io.github.kotlinmania.libc.unix.haiku.Entry?
