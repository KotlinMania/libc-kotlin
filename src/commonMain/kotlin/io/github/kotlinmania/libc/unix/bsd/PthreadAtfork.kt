package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int
