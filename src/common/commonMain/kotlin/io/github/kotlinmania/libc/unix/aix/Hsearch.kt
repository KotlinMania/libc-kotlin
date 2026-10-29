package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun hsearch(entry: Entry, action: ACTION): Entry?
