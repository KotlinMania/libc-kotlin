package io.github.kotlinmania.libc.new.glibc

import posix.*
import sysdeps.nptl.*
import sysdeps.unix.linux.*

// GNU libc.
//
// * Headers: <https://sourceware.org/git/?p=glibc.git> (official)
// * Headers: <https://github.com/bminor/glibc> (mirror)
//
// This module structure is modeled after glibc's source tree. Its build system selects headers
// from different locations based on the platform, which we mimic here with reexports.

