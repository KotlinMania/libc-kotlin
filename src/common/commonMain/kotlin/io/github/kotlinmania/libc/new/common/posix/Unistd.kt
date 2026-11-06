// port-lint: source new/common/posix/unistd.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

// Header: `unistd.h`
//
// <https://pubs.opengroup.org/onlinepubs/007904975/basedefs/unistd.h.html>

public val STDIN_FILENO: CInt = 0

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2
