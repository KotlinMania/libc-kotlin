@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali

import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead(a1, a2, a3)

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite(a1, a2, a3)

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen(a1, a2, a3)

public actual fun syscallSysClose(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose(a1)

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat(a1, a2)

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat(a1, a2)

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat(a1, a2)

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll(a1, a2, a3)

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek(a1, a2, a3)

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect(a1, a2, a3)

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap(a1, a2)

public actual fun syscallSysBrk(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk(a1)

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction(a1, a2, a3, a4)

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask(a1, a2, a3, a4)

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn(a1)

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl(a1, a2, a3)

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64(a1, a2, a3, a4)

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64(a1, a2, a3, a4)

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv(a1, a2, a3)

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev(a1, a2, a3)

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess(a1, a2)

public actual fun syscallSysPipe(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe(a1)

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect(a1, a2, a3, a4, a5)

public actual fun syscallSysSchedYield(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield()

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap(a1, a2, a3, a4, a5)

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync(a1, a2, a3)

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise(a1, a2, a3)

public actual fun syscallSysDup(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup(a1)

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2(a1, a2)

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep(a1, a2)

public actual fun syscallSysAlarm(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm(a1)

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer(a1, a2, a3)

public actual fun syscallSysGetpid(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid()

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket(a1, a2, a3)

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect(a1, a2, a3)

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept(a1, a2, a3)

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg(a1, a2, a3)

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg(a1, a2, a3)

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown(a1, a2)

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind(a1, a2, a3)

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen(a1, a2)

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname(a1, a2, a3)

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername(a1, a2, a3)

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair(a1, a2, a3, a4)

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt(a1, a2, a3, a4, a5)

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt(a1, a2, a3, a4, a5)

public actual fun syscallSysFork(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork()

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve(a1, a2, a3)

public actual fun syscallSysExit(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit(a1)

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4(a1, a2, a3, a4)

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill(a1, a2)

public actual fun syscallSysUname(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname(a1)

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl(a1, a2, a3)

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock(a1, a2)

public actual fun syscallSysFsync(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync(a1)

public actual fun syscallSysFdatasync(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync(a1)

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate(a1, a2)

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents(a1, a2, a3)

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd(a1, a2)

public actual fun syscallSysChdir(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir(a1)

public actual fun syscallSysFchdir(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir(a1)

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename(a1, a2)

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir(a1, a2)

public actual fun syscallSysRmdir(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir(a1)

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink(a1, a2)

public actual fun syscallSysUnlink(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink(a1)

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink(a1, a2)

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink(a1, a2, a3)

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod(a1, a2)

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod(a1, a2)

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown(a1, a2, a3)

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown(a1, a2, a3)

public actual fun syscallSysUmask(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask(a1)

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit(a1, a2)

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage(a1, a2)

public actual fun syscallSysSysinfo(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo(a1)

public actual fun syscallSysGetuid(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid()

public actual fun syscallSysGetgid(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid()

public actual fun syscallSysSetuid(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid(a1)

public actual fun syscallSysSetgid(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid(a1)

public actual fun syscallSysGeteuid(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid()

public actual fun syscallSysGetegid(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid()

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid(a1, a2)

public actual fun syscallSysGetppid(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid()

public actual fun syscallSysSetsid(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid()

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid(a1, a2)

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid(a1, a2)

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups(a1, a2)

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups(a1, a2)

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid(a1, a2, a3)

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid(a1, a2, a3)

public actual fun syscallSysGetpgid(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid(a1)

public actual fun syscallSysGetsid(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid(a1)

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending(a1, a2)

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend(a1, a2)

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack(a1, a2)

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime(a1, a2)

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs(a1, a2)

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs(a1, a2)

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl(a1, a2, a3, a4, a5)

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit(a1, a2)

public actual fun syscallSysChroot(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot(a1)

public actual fun syscallSysGettid(): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid()

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill(a1, a2)

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity(a1, a2, a3)

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64(a1, a2, a3)

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress(a1)

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise(a1, a2, a3, a4)

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime(a1, a2)

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres(a1, a2)

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep(a1, a2, a3, a4)

public actual fun syscallSysExitGroup(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup(a1)

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl(a1, a2, a3, a4)

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat(a1, a2, a3, a4)

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat(a1, a2, a3)

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat(a1, a2, a3, a4, a5)

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat(a1, a2, a3, a4)

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat(a1, a2, a3)

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat(a1, a2, a3, a4, a5)

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat(a1, a2, a3)

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat(a1, a2, a3, a4)

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat(a1, a2, a3, a4)

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat(a1, a2, a3, a4)

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll(a1, a2, a3, a4, a5)

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat(a1, a2, a3, a4)

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysEventfd(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd(a1)

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4(a1, a2, a3, a4)

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2(a1, a2)

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1(a1)

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3(a1, a2, a3)

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2(a1, a2)

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64(a1, a2, a3, a4)

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2(a1, a2, a3, a4, a5)

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom(a1, a2, a3)

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx(a1, a2, a3, a4, a5)

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2(a1, a2, a3, a4)
