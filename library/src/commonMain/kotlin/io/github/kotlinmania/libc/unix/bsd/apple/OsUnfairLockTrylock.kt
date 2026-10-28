package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun osUnfairLockTrylock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Boolean
