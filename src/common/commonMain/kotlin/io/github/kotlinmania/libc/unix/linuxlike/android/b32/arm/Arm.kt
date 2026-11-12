// port-lint: source unix/linux_like/android/b32/arm.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.android.StackT
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.Sigset64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.android.syscall
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias WcharT = UInt

public typealias GregT = Int

public typealias McontextT = Sigcontext

public class Sigcontext(
    public var trapNo: CUlong = 0uL,
    public var errorCode: CUlong = 0uL,
    public var oldmask: CUlong = 0uL,
    public var armR0: CUlong = 0uL,
    public var armR1: CUlong = 0uL,
    public var armR2: CUlong = 0uL,
    public var armR3: CUlong = 0uL,
    public var armR4: CUlong = 0uL,
    public var armR5: CUlong = 0uL,
    public var armR6: CUlong = 0uL,
    public var armR7: CUlong = 0uL,
    public var armR8: CUlong = 0uL,
    public var armR9: CUlong = 0uL,
    public var armR10: CUlong = 0uL,
    public var armFp: CUlong = 0uL,
    public var armIp: CUlong = 0uL,
    public var armSp: CUlong = 0uL,
    public var armLr: CUlong = 0uL,
    public var armPc: CUlong = 0uL,
    public var armCpsr: CUlong = 0uL,
    public var faultAddress: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigcontext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigcontext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): Sigcontext =
                    Sigcontext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: Sigcontext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.trapNo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.errorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.oldmask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.armR0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.armR1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.armR2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.armR3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.armR4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.armR5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.armR6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.armR7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.armR8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.armR9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.armR10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.armFp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.armIp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.armSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.armLr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.armPc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.armCpsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.faultAddress)
                }
            }
    }
}

public data class CAnonymousUcSigmaskWithPadding(
    public var ucSigmask: SigsetT = 0uL,
    // Android has a wrong (smaller) sigsetT on x86.
    public var paddingRtSigset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousUcSigmaskWithPadding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousUcSigmaskWithPadding> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CAnonymousUcSigmaskWithPadding =
                    CAnonymousUcSigmaskWithPadding(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousUcSigmaskWithPadding) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ucSigmask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.paddingRtSigset)
                }
            }
    }
}

public class UcontextT internal constructor(
    public var ucFlags: CUlong,
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
    public var ucSigmaskCAnonymousUnion: CAnonymousUcSigmask,
    // The kernel adds extra padding after ucSigmask to match
    // glibc sigsetT on ARM.
    public var padding: UByteArray,
    public var align: LongArray,
    public var ucRegspace: ULongArray,
) {
    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucFlags = 0uL,
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        ucMcontextCtorArg = Sigcontext(),
        ucSigmaskCAnonymousUnion = CAnonymousUcSigmask(),
        padding = UByteArray(120),
        align = LongArray(0),
        ucRegspace = ULongArray(128),
    )

    public operator fun component1(): CUlong = this.ucFlags

    public operator fun component2(): MutPtr<UcontextT> = this.ucLink

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): McontextT = this.ucMcontext

    public operator fun component5(): CAnonymousUcSigmask = this.ucSigmaskCAnonymousUnion

    public operator fun component6(): UByteArray = this.padding

    public operator fun component7(): LongArray = this.align

    public operator fun component8(): ULongArray = this.ucRegspace

    public fun copy(ucFlags: CUlong = this.ucFlags, ucLink: MutPtr<UcontextT> = this.ucLink, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext, ucSigmaskCAnonymousUnion: CAnonymousUcSigmask = this.ucSigmaskCAnonymousUnion, padding: UByteArray = this.padding, align: LongArray = this.align, ucRegspace: ULongArray = this.ucRegspace): UcontextT = UcontextT(ucFlags = ucFlags, ucLinkCtorArg = ucLink, ucStack = ucStack, ucMcontextCtorArg = ucMcontext, ucSigmaskCAnonymousUnion = ucSigmaskCAnonymousUnion, padding = padding, align = align, ucRegspace = ucRegspace)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucSigmaskCAnonymousUnion != other.ucSigmaskCAnonymousUnion) return false
        if (!this.padding.contentEquals(other.padding)) return false
        if (!this.align.contentEquals(other.align)) return false
        if (!this.ucRegspace.contentEquals(other.ucRegspace)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucSigmaskCAnonymousUnion.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        result = 31 * result + this.align.contentHashCode()
        result = 31 * result + this.ucRegspace.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucFlags: CUlong = 0uL,
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = Sigcontext(),
            ucSigmaskCAnonymousUnion: CAnonymousUcSigmask = CAnonymousUcSigmask(),
            padding: UByteArray = UByteArray(120),
            align: LongArray = LongArray(0),
            ucRegspace: ULongArray = ULongArray(128),
        ): UcontextT =
            UcontextT(
                ucFlags = ucFlags,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
                ucSigmaskCAnonymousUnion = ucSigmaskCAnonymousUnion,
                padding = padding,
                align = align,
                ucRegspace = ucRegspace,
            )
    }
}

public data class CAnonymousUcSigmask(
    public var ucSigmask: CAnonymousUcSigmaskWithPadding = CAnonymousUcSigmaskWithPadding(),
    public var ucSigmask64: Sigset64T = Sigset64T(),
) {
    public fun eq(other: CAnonymousUcSigmask): Boolean = this.ucSigmask == other.ucSigmask

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ucSigmask).hashCode()
        return state
    }
}

public val O_DIRECT: CInt = 0x10000

public val O_DIRECTORY: CInt = 0x4000

public val O_NOFOLLOW: CInt = 0x8000

public val O_LARGEFILE: CInt = 131072

public val SYS_RESTART_SYSCALL: CLong = 0L

public val SYS_EXIT: CLong = 1L

public val SYS_FORK: CLong = 2L

public val SYS_READ: CLong = 3L

public val SYS_WRITE: CLong = 4L

public val SYS_OPEN: CLong = 5L

public val SYS_CLOSE: CLong = 6L

public val SYS_CREAT: CLong = 8L

public val SYS_LINK: CLong = 9L

public val SYS_UNLINK: CLong = 10L

public val SYS_EXECVE: CLong = 11L

public val SYS_CHDIR: CLong = 12L

public val SYS_MKNOD: CLong = 14L

public val SYS_CHMOD: CLong = 15L

public val SYS_LCHOWN: CLong = 16L

public val SYS_LSEEK: CLong = 19L

public val SYS_GETPID: CLong = 20L

public val SYS_MOUNT: CLong = 21L

public val SYS_SETUID: CLong = 23L

public val SYS_GETUID: CLong = 24L

public val SYS_PTRACE: CLong = 26L

public val SYS_PAUSE: CLong = 29L

public val SYS_ACCESS: CLong = 33L

public val SYS_NICE: CLong = 34L

public val SYS_SYNC: CLong = 36L

public val SYS_KILL: CLong = 37L

public val SYS_RENAME: CLong = 38L

public val SYS_MKDIR: CLong = 39L

public val SYS_RMDIR: CLong = 40L

public val SYS_DUP: CLong = 41L

public val SYS_PIPE: CLong = 42L

public val SYS_TIMES: CLong = 43L

public val SYS_BRK: CLong = 45L

public val SYS_SETGID: CLong = 46L

public val SYS_GETGID: CLong = 47L

public val SYS_GETEUID: CLong = 49L

public val SYS_GETEGID: CLong = 50L

public val SYS_ACCT: CLong = 51L

public val SYS_UMOUNT2: CLong = 52L

public val SYS_IOCTL: CLong = 54L

public val SYS_FCNTL: CLong = 55L

public val SYS_SETPGID: CLong = 57L

public val SYS_UMASK: CLong = 60L

public val SYS_CHROOT: CLong = 61L

public val SYS_USTAT: CLong = 62L

public val SYS_DUP2: CLong = 63L

public val SYS_GETPPID: CLong = 64L

public val SYS_GETPGRP: CLong = 65L

public val SYS_SETSID: CLong = 66L

public val SYS_SIGACTION: CLong = 67L

public val SYS_SETREUID: CLong = 70L

public val SYS_SETREGID: CLong = 71L

public val SYS_SIGSUSPEND: CLong = 72L

public val SYS_SIGPENDING: CLong = 73L

public val SYS_SETHOSTNAME: CLong = 74L

public val SYS_SETRLIMIT: CLong = 75L

public val SYS_GETRUSAGE: CLong = 77L

public val SYS_GETTIMEOFDAY: CLong = 78L

public val SYS_SETTIMEOFDAY: CLong = 79L

public val SYS_GETGROUPS: CLong = 80L

public val SYS_SETGROUPS: CLong = 81L

public val SYS_SYMLINK: CLong = 83L

public val SYS_READLINK: CLong = 85L

public val SYS_USELIB: CLong = 86L

public val SYS_SWAPON: CLong = 87L

public val SYS_REBOOT: CLong = 88L

public val SYS_MUNMAP: CLong = 91L

public val SYS_TRUNCATE: CLong = 92L

public val SYS_FTRUNCATE: CLong = 93L

public val SYS_FCHMOD: CLong = 94L

public val SYS_FCHOWN: CLong = 95L

public val SYS_GETPRIORITY: CLong = 96L

public val SYS_SETPRIORITY: CLong = 97L

public val SYS_STATFS: CLong = 99L

public val SYS_FSTATFS: CLong = 100L

public val SYS_SYSLOG: CLong = 103L

public val SYS_SETITIMER: CLong = 104L

public val SYS_GETITIMER: CLong = 105L

public val SYS_STAT: CLong = 106L

public val SYS_LSTAT: CLong = 107L

public val SYS_FSTAT: CLong = 108L

public val SYS_VHANGUP: CLong = 111L

public val SYS_WAIT4: CLong = 114L

public val SYS_SWAPOFF: CLong = 115L

public val SYS_SYSINFO: CLong = 116L

public val SYS_FSYNC: CLong = 118L

public val SYS_SIGRETURN: CLong = 119L

public val SYS_CLONE: CLong = 120L

public val SYS_SETDOMAINNAME: CLong = 121L

public val SYS_UNAME: CLong = 122L

public val SYS_ADJTIMEX: CLong = 124L

public val SYS_MPROTECT: CLong = 125L

public val SYS_SIGPROCMASK: CLong = 126L

public val SYS_INIT_MODULE: CLong = 128L

public val SYS_DELETE_MODULE: CLong = 129L

public val SYS_QUOTACTL: CLong = 131L

public val SYS_GETPGID: CLong = 132L

public val SYS_FCHDIR: CLong = 133L

public val SYS_BDFLUSH: CLong = 134L

public val SYS_SYSFS: CLong = 135L

public val SYS_PERSONALITY: CLong = 136L

public val SYS_SETFSUID: CLong = 138L

public val SYS_SETFSGID: CLong = 139L

public val SYS_GETDENTS: CLong = 141L

public val SYS_FLOCK: CLong = 143L

public val SYS_MSYNC: CLong = 144L

public val SYS_READV: CLong = 145L

public val SYS_WRITEV: CLong = 146L

public val SYS_GETSID: CLong = 147L

public val SYS_FDATASYNC: CLong = 148L

public val SYS_MLOCK: CLong = 150L

public val SYS_MUNLOCK: CLong = 151L

public val SYS_MLOCKALL: CLong = 152L

public val SYS_MUNLOCKALL: CLong = 153L

public val SYS_SCHED_SETPARAM: CLong = 154L

public val SYS_SCHED_GETPARAM: CLong = 155L

public val SYS_SCHED_SETSCHEDULER: CLong = 156L

public val SYS_SCHED_GETSCHEDULER: CLong = 157L

public val SYS_SCHED_YIELD: CLong = 158L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 159L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 160L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 161L

public val SYS_NANOSLEEP: CLong = 162L

public val SYS_MREMAP: CLong = 163L

public val SYS_SETRESUID: CLong = 164L

public val SYS_GETRESUID: CLong = 165L

public val SYS_POLL: CLong = 168L

public val SYS_NFSSERVCTL: CLong = 169L

public val SYS_SETRESGID: CLong = 170L

public val SYS_GETRESGID: CLong = 171L

public val SYS_PRCTL: CLong = 172L

public val SYS_RT_SIGRETURN: CLong = 173L

public val SYS_RT_SIGACTION: CLong = 174L

public val SYS_RT_SIGPROCMASK: CLong = 175L

public val SYS_RT_SIGPENDING: CLong = 176L

public val SYS_RT_SIGTIMEDWAIT: CLong = 177L

public val SYS_RT_SIGQUEUEINFO: CLong = 178L

public val SYS_RT_SIGSUSPEND: CLong = 179L

public val SYS_PREAD64: CLong = 180L

public val SYS_PWRITE64: CLong = 181L

public val SYS_CHOWN: CLong = 182L

public val SYS_GETCWD: CLong = 183L

public val SYS_CAPGET: CLong = 184L

public val SYS_CAPSET: CLong = 185L

public val SYS_SIGALTSTACK: CLong = 186L

public val SYS_SENDFILE: CLong = 187L

public val SYS_VFORK: CLong = 190L

public val SYS_UGETRLIMIT: CLong = 191L

public val SYS_MMAP2: CLong = 192L

public val SYS_TRUNCATE64: CLong = 193L

public val SYS_FTRUNCATE64: CLong = 194L

public val SYS_STAT64: CLong = 195L

public val SYS_LSTAT64: CLong = 196L

public val SYS_FSTAT64: CLong = 197L

public val SYS_LCHOWN32: CLong = 198L

public val SYS_GETUID32: CLong = 199L

public val SYS_GETGID32: CLong = 200L

public val SYS_GETEUID32: CLong = 201L

public val SYS_GETEGID32: CLong = 202L

public val SYS_SETREUID32: CLong = 203L

public val SYS_SETREGID32: CLong = 204L

public val SYS_GETGROUPS32: CLong = 205L

public val SYS_SETGROUPS32: CLong = 206L

public val SYS_FCHOWN32: CLong = 207L

public val SYS_SETRESUID32: CLong = 208L

public val SYS_GETRESUID32: CLong = 209L

public val SYS_SETRESGID32: CLong = 210L

public val SYS_GETRESGID32: CLong = 211L

public val SYS_CHOWN32: CLong = 212L

public val SYS_SETUID32: CLong = 213L

public val SYS_SETGID32: CLong = 214L

public val SYS_SETFSUID32: CLong = 215L

public val SYS_SETFSGID32: CLong = 216L

public val SYS_GETDENTS64: CLong = 217L

public val SYS_PIVOT_ROOT: CLong = 218L

public val SYS_MINCORE: CLong = 219L

public val SYS_MADVISE: CLong = 220L

public val SYS_FCNTL64: CLong = 221L

public val SYS_GETTID: CLong = 224L

public val SYS_READAHEAD: CLong = 225L

public val SYS_SETXATTR: CLong = 226L

public val SYS_LSETXATTR: CLong = 227L

public val SYS_FSETXATTR: CLong = 228L

public val SYS_GETXATTR: CLong = 229L

public val SYS_LGETXATTR: CLong = 230L

public val SYS_FGETXATTR: CLong = 231L

public val SYS_LISTXATTR: CLong = 232L

public val SYS_LLISTXATTR: CLong = 233L

public val SYS_FLISTXATTR: CLong = 234L

public val SYS_REMOVEXATTR: CLong = 235L

public val SYS_LREMOVEXATTR: CLong = 236L

public val SYS_FREMOVEXATTR: CLong = 237L

public val SYS_TKILL: CLong = 238L

public val SYS_SENDFILE64: CLong = 239L

public val SYS_FUTEX: CLong = 240L

public val SYS_SCHED_SETAFFINITY: CLong = 241L

public val SYS_SCHED_GETAFFINITY: CLong = 242L

public val SYS_IO_SETUP: CLong = 243L

public val SYS_IO_DESTROY: CLong = 244L

public val SYS_IO_GETEVENTS: CLong = 245L

public val SYS_IO_SUBMIT: CLong = 246L

public val SYS_IO_CANCEL: CLong = 247L

public val SYS_EXIT_GROUP: CLong = 248L

public val SYS_LOOKUP_DCOOKIE: CLong = 249L

public val SYS_EPOLL_CREATE: CLong = 250L

public val SYS_EPOLL_CTL: CLong = 251L

public val SYS_EPOLL_WAIT: CLong = 252L

public val SYS_REMAP_FILE_PAGES: CLong = 253L

public val SYS_SET_TID_ADDRESS: CLong = 256L

public val SYS_TIMER_CREATE: CLong = 257L

public val SYS_TIMER_SETTIME: CLong = 258L

public val SYS_TIMER_GETTIME: CLong = 259L

public val SYS_TIMER_GETOVERRUN: CLong = 260L

public val SYS_TIMER_DELETE: CLong = 261L

public val SYS_CLOCK_SETTIME: CLong = 262L

public val SYS_CLOCK_GETTIME: CLong = 263L

public val SYS_CLOCK_GETRES: CLong = 264L

public val SYS_CLOCK_NANOSLEEP: CLong = 265L

public val SYS_STATFS64: CLong = 266L

public val SYS_FSTATFS64: CLong = 267L

public val SYS_TGKILL: CLong = 268L

public val SYS_UTIMES: CLong = 269L

public val SYS_ARM_FADVISE64_64: CLong = 270L

public val SYS_PCICONFIG_IOBASE: CLong = 271L

public val SYS_PCICONFIG_READ: CLong = 272L

public val SYS_PCICONFIG_WRITE: CLong = 273L

public val SYS_MQ_OPEN: CLong = 274L

public val SYS_MQ_UNLINK: CLong = 275L

public val SYS_MQ_TIMEDSEND: CLong = 276L

public val SYS_MQ_TIMEDRECEIVE: CLong = 277L

public val SYS_MQ_NOTIFY: CLong = 278L

public val SYS_MQ_GETSETATTR: CLong = 279L

public val SYS_WAITID: CLong = 280L

public val SYS_SOCKET: CLong = 281L

public val SYS_BIND: CLong = 282L

public val SYS_CONNECT: CLong = 283L

public val SYS_LISTEN: CLong = 284L

public val SYS_ACCEPT: CLong = 285L

public val SYS_GETSOCKNAME: CLong = 286L

public val SYS_GETPEERNAME: CLong = 287L

public val SYS_SOCKETPAIR: CLong = 288L

public val SYS_SEND: CLong = 289L

public val SYS_SENDTO: CLong = 290L

public val SYS_RECV: CLong = 291L

public val SYS_RECVFROM: CLong = 292L

public val SYS_SHUTDOWN: CLong = 293L

public val SYS_SETSOCKOPT: CLong = 294L

public val SYS_GETSOCKOPT: CLong = 295L

public val SYS_SENDMSG: CLong = 296L

public val SYS_RECVMSG: CLong = 297L

public val SYS_SEMOP: CLong = 298L

public val SYS_SEMGET: CLong = 299L

public val SYS_SEMCTL: CLong = 300L

public val SYS_MSGSND: CLong = 301L

public val SYS_MSGRCV: CLong = 302L

public val SYS_MSGGET: CLong = 303L

public val SYS_MSGCTL: CLong = 304L

public val SYS_SHMAT: CLong = 305L

public val SYS_SHMDT: CLong = 306L

public val SYS_SHMGET: CLong = 307L

public val SYS_SHMCTL: CLong = 308L

public val SYS_ADD_KEY: CLong = 309L

public val SYS_REQUEST_KEY: CLong = 310L

public val SYS_KEYCTL: CLong = 311L

public val SYS_SEMTIMEDOP: CLong = 312L

public val SYS_VSERVER: CLong = 313L

public val SYS_IOPRIO_SET: CLong = 314L

public val SYS_IOPRIO_GET: CLong = 315L

public val SYS_INOTIFY_INIT: CLong = 316L

public val SYS_INOTIFY_ADD_WATCH: CLong = 317L

public val SYS_INOTIFY_RM_WATCH: CLong = 318L

public val SYS_MBIND: CLong = 319L

public val SYS_GET_MEMPOLICY: CLong = 320L

public val SYS_SET_MEMPOLICY: CLong = 321L

public val SYS_OPENAT: CLong = 322L

public val SYS_MKDIRAT: CLong = 323L

public val SYS_MKNODAT: CLong = 324L

public val SYS_FCHOWNAT: CLong = 325L

public val SYS_FUTIMESAT: CLong = 326L

public val SYS_FSTATAT64: CLong = 327L

public val SYS_UNLINKAT: CLong = 328L

public val SYS_RENAMEAT: CLong = 329L

public val SYS_LINKAT: CLong = 330L

public val SYS_SYMLINKAT: CLong = 331L

public val SYS_READLINKAT: CLong = 332L

public val SYS_FCHMODAT: CLong = 333L

public val SYS_FACCESSAT: CLong = 334L

public val SYS_PSELECT6: CLong = 335L

public val SYS_PPOLL: CLong = 336L

public val SYS_UNSHARE: CLong = 337L

public val SYS_SET_ROBUST_LIST: CLong = 338L

public val SYS_GET_ROBUST_LIST: CLong = 339L

public val SYS_SPLICE: CLong = 340L

public val SYS_ARM_SYNC_FILE_RANGE: CLong = 341L

public val SYS_TEE: CLong = 342L

public val SYS_VMSPLICE: CLong = 343L

public val SYS_MOVE_PAGES: CLong = 344L

public val SYS_GETCPU: CLong = 345L

public val SYS_EPOLL_PWAIT: CLong = 346L

public val SYS_KEXEC_LOAD: CLong = 347L

public val SYS_UTIMENSAT: CLong = 348L

public val SYS_SIGNALFD: CLong = 349L

public val SYS_TIMERFD_CREATE: CLong = 350L

public val SYS_EVENTFD: CLong = 351L

public val SYS_FALLOCATE: CLong = 352L

public val SYS_TIMERFD_SETTIME: CLong = 353L

public val SYS_TIMERFD_GETTIME: CLong = 354L

public val SYS_SIGNALFD4: CLong = 355L

public val SYS_EVENTFD2: CLong = 356L

public val SYS_EPOLL_CREATE1: CLong = 357L

public val SYS_DUP3: CLong = 358L

public val SYS_PIPE2: CLong = 359L

public val SYS_INOTIFY_INIT1: CLong = 360L

public val SYS_PREADV: CLong = 361L

public val SYS_PWRITEV: CLong = 362L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 363L

public val SYS_PERF_EVENT_OPEN: CLong = 364L

public val SYS_RECVMMSG: CLong = 365L

public val SYS_ACCEPT4: CLong = 366L

public val SYS_FANOTIFY_INIT: CLong = 367L

public val SYS_FANOTIFY_MARK: CLong = 368L

public val SYS_PRLIMIT64: CLong = 369L

public val SYS_NAME_TO_HANDLE_AT: CLong = 370L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 371L

public val SYS_CLOCK_ADJTIME: CLong = 372L

public val SYS_SYNCFS: CLong = 373L

public val SYS_SENDMMSG: CLong = 374L

public val SYS_SETNS: CLong = 375L

public val SYS_PROCESS_VM_READV: CLong = 376L

public val SYS_PROCESS_VM_WRITEV: CLong = 377L

public val SYS_KCMP: CLong = 378L

public val SYS_FINIT_MODULE: CLong = 379L

public val SYS_SCHED_SETATTR: CLong = 380L

public val SYS_SCHED_GETATTR: CLong = 381L

public val SYS_RENAMEAT2: CLong = 382L

public val SYS_SECCOMP: CLong = 383L

public val SYS_GETRANDOM: CLong = 384L

public val SYS_MEMFD_CREATE: CLong = 385L

public val SYS_BPF: CLong = 386L

public val SYS_EXECVEAT: CLong = 387L

public val SYS_USERFAULTFD: CLong = 388L

public val SYS_MEMBARRIER: CLong = 389L

public val SYS_MLOCK2: CLong = 390L

public val SYS_COPY_FILE_RANGE: CLong = 391L

public val SYS_PREADV2: CLong = 392L

public val SYS_PWRITEV2: CLong = 393L

public val SYS_PKEY_MPROTECT: CLong = 394L

public val SYS_PKEY_ALLOC: CLong = 395L

public val SYS_PKEY_FREE: CLong = 396L

public val SYS_STATX: CLong = 397L

public val SYS_PIDFD_SEND_SIGNAL: CLong = 424L

public val SYS_IO_URING_SETUP: CLong = 425L

public val SYS_IO_URING_ENTER: CLong = 426L

public val SYS_IO_URING_REGISTER: CLong = 427L

public val SYS_OPEN_TREE: CLong = 428L

public val SYS_MOVE_MOUNT: CLong = 429L

public val SYS_FSOPEN: CLong = 430L

public val SYS_FSCONFIG: CLong = 431L

public val SYS_FSMOUNT: CLong = 432L

public val SYS_FSPICK: CLong = 433L

public val SYS_PIDFD_OPEN: CLong = 434L

public val SYS_CLONE3: CLong = 435L

public val SYS_CLOSE_RANGE: CLong = 436L

public val SYS_OPENAT2: CLong = 437L

public val SYS_PIDFD_GETFD: CLong = 438L

public val SYS_FACCESSAT2: CLong = 439L

public val SYS_PROCESS_MADVISE: CLong = 440L

public val SYS_EPOLL_PWAIT2: CLong = 441L

public val SYS_MOUNT_SETATTR: CLong = 442L

public val SYS_QUOTACTL_FD: CLong = 443L

public val SYS_LANDLOCK_CREATE_RULESET: CLong = 444L

public val SYS_LANDLOCK_ADD_RULE: CLong = 445L

public val SYS_LANDLOCK_RESTRICT_SELF: CLong = 446L

public val SYS_PROCESS_MRELEASE: CLong = 448L

public val SYS_FUTEX_WAITV: CLong = 449L

public val SYS_SET_MEMPOLICY_HOME_NODE: CLong = 450L

// offsets in mcontextT.gregs from sys/ucontext.h
public val REG_R0: CInt = 0

public val REG_R1: CInt = 1

public val REG_R2: CInt = 2

public val REG_R3: CInt = 3

public val REG_R4: CInt = 4

public val REG_R5: CInt = 5

public val REG_R6: CInt = 6

public val REG_R7: CInt = 7

public val REG_R8: CInt = 8

public val REG_R9: CInt = 9

public val REG_R10: CInt = 10

public val REG_R11: CInt = 11

public val REG_R12: CInt = 12

public val REG_R13: CInt = 13

public val REG_R14: CInt = 14

public val REG_R15: CInt = 15

public val NGREG: CInt = 18

// From NDK's asm/auxvec.h
public val AT_SYSINFO_EHDR: CUlong = 33uL

public fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt = syscall(SYS_ACCEPT4, fd.toLong(), addr.rawAddress, len.rawAddress, flg.toLong()).toInt()
