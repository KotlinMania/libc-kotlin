package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun closedir(dirp: DIR?): Int
