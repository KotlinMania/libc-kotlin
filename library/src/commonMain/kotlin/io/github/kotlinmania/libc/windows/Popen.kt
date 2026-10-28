package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun popen(command: String?, mode: String?): FILE?
