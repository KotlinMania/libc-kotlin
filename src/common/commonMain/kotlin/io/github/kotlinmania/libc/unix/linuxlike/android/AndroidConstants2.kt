package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort

public val SIOCGIFCONF: CUlong = 0x00008912uL

public val SIOCGIFFLAGS: CUlong = 0x00008913uL

public val SIOCSIFFLAGS: CUlong = 0x00008914uL

public val SIOCGIFADDR: CUlong = 0x00008915uL

public val SIOCSIFADDR: CUlong = 0x00008916uL

public val SIOCGIFDSTADDR: CUlong = 0x00008917uL

public val SIOCSIFDSTADDR: CUlong = 0x00008918uL

public val SIOCGIFBRDADDR: CUlong = 0x00008919uL

public val SIOCSIFBRDADDR: CUlong = 0x0000891AuL

public val SIOCGIFNETMASK: CUlong = 0x0000891BuL

public val SIOCSIFNETMASK: CUlong = 0x0000891CuL

public val SIOCGIFMETRIC: CUlong = 0x0000891DuL

public val SIOCSIFMETRIC: CUlong = 0x0000891EuL

public val SIOCGIFMEM: CUlong = 0x0000891FuL

public val SIOCSIFMEM: CUlong = 0x00008920uL

public val SIOCGIFMTU: CUlong = 0x00008921uL

public val SIOCSIFMTU: CUlong = 0x00008922uL

public val SIOCSIFNAME: CUlong = 0x00008923uL

public val SIOCSIFHWADDR: CUlong = 0x00008924uL

public val SIOCGIFENCAP: CUlong = 0x00008925uL

public val SIOCSIFENCAP: CUlong = 0x00008926uL

public val SIOCGIFHWADDR: CUlong = 0x00008927uL

public val SIOCGIFSLAVE: CUlong = 0x00008929uL

public val SIOCSIFSLAVE: CUlong = 0x00008930uL

public val SIOCADDMULTI: CUlong = 0x00008931uL

public val SIOCDELMULTI: CUlong = 0x00008932uL

public val SIOCGIFINDEX: CUlong = 0x00008933uL

public val SIOGIFINDEX: CUlong = SIOCGIFINDEX

public val SIOCSIFPFLAGS: CUlong = 0x00008934uL

public val SIOCGIFPFLAGS: CUlong = 0x00008935uL

public val SIOCDIFADDR: CUlong = 0x00008936uL

public val SIOCSIFHWBROADCAST: CUlong = 0x00008937uL

public val SIOCGIFCOUNT: CUlong = 0x00008938uL

public val SIOCGIFBR: CUlong = 0x00008940uL

public val SIOCSIFBR: CUlong = 0x00008941uL

public val SIOCGIFTXQLEN: CUlong = 0x00008942uL

public val SIOCSIFTXQLEN: CUlong = 0x00008943uL

public val SIOCETHTOOL: CUlong = 0x00008946uL

public val SIOCGMIIPHY: CUlong = 0x00008947uL

public val SIOCGMIIREG: CUlong = 0x00008948uL

public val SIOCSMIIREG: CUlong = 0x00008949uL

public val SIOCWANDEV: CUlong = 0x0000894AuL

public val SIOCOUTQNSD: CUlong = 0x0000894BuL

public val SIOCGSKNS: CUlong = 0x0000894CuL

public val SIOCDARP: CUlong = 0x00008953uL

public val SIOCGARP: CUlong = 0x00008954uL

public val SIOCSARP: CUlong = 0x00008955uL

public val SIOCDRARP: CUlong = 0x00008960uL

public val SIOCGRARP: CUlong = 0x00008961uL

public val SIOCSRARP: CUlong = 0x00008962uL

public val SIOCGIFMAP: CUlong = 0x00008970uL

public val SIOCSIFMAP: CUlong = 0x00008971uL

public val SIOCADDDLCI: CUlong = 0x00008980uL

public val SIOCDELDLCI: CUlong = 0x00008981uL

public val SIOCGIFVLAN: CUlong = 0x00008982uL

public val SIOCSIFVLAN: CUlong = 0x00008983uL

public val SIOCBONDENSLAVE: CUlong = 0x00008990uL

public val SIOCBONDRELEASE: CUlong = 0x00008991uL

public val SIOCBONDSETHWADDR: CUlong = 0x00008992uL

public val SIOCBONDSLAVEINFOQUERY: CUlong = 0x00008993uL

public val SIOCBONDINFOQUERY: CUlong = 0x00008994uL

public val SIOCBONDCHANGEACTIVE: CUlong = 0x00008995uL

public val SIOCBRADDBR: CUlong = 0x000089a0uL

public val SIOCBRDELBR: CUlong = 0x000089a1uL

public val SIOCBRADDIF: CUlong = 0x000089a2uL

public val SIOCBRDELIF: CUlong = 0x000089a3uL

public val SIOCSHWTSTAMP: CUlong = 0x000089b0uL

public val SIOCGHWTSTAMP: CUlong = 0x000089b1uL

public val SIOCDEVPRIVATE: CUlong = 0x000089F0uL

public val SIOCPROTOPRIVATE: CUlong = 0x000089E0uL

// linux/module.h
public val MODULE_INIT_IGNORE_MODVERSIONS: CUint = 0x0001u

public val MODULE_INIT_IGNORE_VERMAGIC: CUint = 0x0002u

// linux/netTstamp.h
public val SOF_TIMESTAMPING_TX_HARDWARE: CUint = 1u shl 0

public val SOF_TIMESTAMPING_TX_SOFTWARE: CUint = 1u shl 1

public val SOF_TIMESTAMPING_RX_HARDWARE: CUint = 1u shl 2

public val SOF_TIMESTAMPING_RX_SOFTWARE: CUint = 1u shl 3

public val SOF_TIMESTAMPING_SOFTWARE: CUint = 1u shl 4

public val SOF_TIMESTAMPING_SYS_HARDWARE: CUint = 1u shl 5

public val SOF_TIMESTAMPING_RAW_HARDWARE: CUint = 1u shl 6

public val SOF_TIMESTAMPING_OPT_ID: CUint = 1u shl 7

public val SOF_TIMESTAMPING_TX_SCHED: CUint = 1u shl 8

public val SOF_TIMESTAMPING_TX_ACK: CUint = 1u shl 9

public val SOF_TIMESTAMPING_OPT_CMSG: CUint = 1u shl 10

public val SOF_TIMESTAMPING_OPT_TSONLY: CUint = 1u shl 11

public val SOF_TIMESTAMPING_OPT_STATS: CUint = 1u shl 12

public val SOF_TIMESTAMPING_OPT_PKTINFO: CUint = 1u shl 13

public val SOF_TIMESTAMPING_OPT_TX_SWHW: CUint = 1u shl 14

public val SOF_TIMESTAMPING_BIND_PHC: CUint = 1u shl 15

public val SOF_TIMESTAMPING_OPT_ID_TCP: CUint = 1u shl 16

public val SOF_TIMESTAMPING_OPT_RX_FILTER: CUint = 1u shl 17

public val ENOATTR: CInt = ENODATA

// linux/ifAlg.h
public val ALG_SET_KEY: CInt = 1

public val ALG_SET_IV: CInt = 2

public val ALG_SET_OP: CInt = 3

public val ALG_SET_AEAD_ASSOCLEN: CInt = 4

public val ALG_SET_AEAD_AUTHSIZE: CInt = 5

public val ALG_SET_DRBG_ENTROPY: CInt = 6

public val ALG_OP_DECRYPT: CInt = 0

public val ALG_OP_ENCRYPT: CInt = 1

// sys/mman.h
public val MLOCK_ONFAULT: CInt = 0x01

// uapi/linux/vmSockets.h
public val VMADDR_CID_ANY: CUint = 0xFFFFFFFFu

public val VMADDR_CID_HYPERVISOR: CUint = 0u

public val VMADDR_CID_LOCAL: CUint = 1u

public val VMADDR_CID_HOST: CUint = 2u

public val VMADDR_PORT_ANY: CUint = 0xFFFFFFFFu

// uapi/linux/inotify.h
public val IN_ACCESS: UInt = 0x00000001u

public val IN_MODIFY: UInt = 0x00000002u

public val IN_ATTRIB: UInt = 0x00000004u

public val IN_CLOSE_WRITE: UInt = 0x00000008u

public val IN_CLOSE_NOWRITE: UInt = 0x00000010u

public val IN_CLOSE: UInt = IN_CLOSE_WRITE or IN_CLOSE_NOWRITE

public val IN_OPEN: UInt = 0x00000020u

public val IN_MOVED_FROM: UInt = 0x00000040u

public val IN_MOVED_TO: UInt = 0x00000080u

public val IN_MOVE: UInt = IN_MOVED_FROM or IN_MOVED_TO

public val IN_CREATE: UInt = 0x00000100u

public val IN_DELETE: UInt = 0x00000200u

public val IN_DELETE_SELF: UInt = 0x00000400u

public val IN_MOVE_SELF: UInt = 0x00000800u

public val IN_UNMOUNT: UInt = 0x00002000u

public val IN_Q_OVERFLOW: UInt = 0x00004000u

public val IN_IGNORED: UInt = 0x00008000u

public val IN_ONLYDIR: UInt = 0x01000000u

public val IN_DONT_FOLLOW: UInt = 0x02000000u

public val IN_EXCL_UNLINK: UInt = 0x04000000u

public val IN_MASK_CREATE: UInt = 0x10000000u

public val IN_MASK_ADD: UInt = 0x20000000u

public val IN_ISDIR: UInt = 0x40000000u

public val IN_ONESHOT: UInt = 0x80000000u

public val IN_ALL_EVENTS: UInt = IN_ACCESS or IN_MODIFY or IN_ATTRIB or IN_CLOSE_WRITE or IN_CLOSE_NOWRITE or IN_OPEN or IN_MOVED_FROM or IN_MOVED_TO or IN_DELETE or IN_CREATE or IN_DELETE_SELF or IN_MOVE_SELF

public val IN_CLOEXEC: CInt = O_CLOEXEC

public val IN_NONBLOCK: CInt = O_NONBLOCK

public val FUTEX_WAIT: CInt = 0

public val FUTEX_WAKE: CInt = 1

public val FUTEX_FD: CInt = 2

public val FUTEX_REQUEUE: CInt = 3

public val FUTEX_CMP_REQUEUE: CInt = 4

public val FUTEX_WAKE_OP: CInt = 5

public val FUTEX_LOCK_PI: CInt = 6

public val FUTEX_UNLOCK_PI: CInt = 7

public val FUTEX_TRYLOCK_PI: CInt = 8

public val FUTEX_WAIT_BITSET: CInt = 9

public val FUTEX_WAKE_BITSET: CInt = 10

public val FUTEX_WAIT_REQUEUE_PI: CInt = 11

public val FUTEX_CMP_REQUEUE_PI: CInt = 12

public val FUTEX_LOCK_PI2: CInt = 13

public val FUTEX_PRIVATE_FLAG: CInt = 128

public val FUTEX_CLOCK_REALTIME: CInt = 256

public val FUTEX_CMD_MASK: CInt = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()

// linux/errqueue.h
public val SO_EE_ORIGIN_NONE: UByte = 0u

public val SO_EE_ORIGIN_LOCAL: UByte = 1u

public val SO_EE_ORIGIN_ICMP: UByte = 2u

public val SO_EE_ORIGIN_ICMP6: UByte = 3u

public val SO_EE_ORIGIN_TXSTATUS: UByte = 4u

public val SO_EE_ORIGIN_TIMESTAMPING: UByte = SO_EE_ORIGIN_TXSTATUS

// errno.h
public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EWOULDBLOCK: CInt = EAGAIN

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

// linux/sched.h
public val SCHED_NORMAL: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_BATCH: CInt = 3

public val SCHED_IDLE: CInt = 5

public val SCHED_DEADLINE: CInt = 6

public val SCHED_RESET_ON_FORK: CInt = 0x40000000

public val CLONE_PIDFD: CInt = 0x1000

public val CLONE_CLEAR_SIGHAND: CUlonglong = 0x100000000uL

public val CLONE_INTO_CGROUP: CUlonglong = 0x200000000uL

// linux/membarrier.h
public val MEMBARRIER_CMD_QUERY: CInt = 0

public val MEMBARRIER_CMD_GLOBAL: CInt = 1 shl 0

public val MEMBARRIER_CMD_GLOBAL_EXPEDITED: CInt = 1 shl 1

public val MEMBARRIER_CMD_REGISTER_GLOBAL_EXPEDITED: CInt = 1 shl 2

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED: CInt = 1 shl 3

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED: CInt = 1 shl 4

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_SYNC_CORE: CInt = 1 shl 5

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_SYNC_CORE: CInt = 1 shl 6

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_RSEQ: CInt = 1 shl 7

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_RSEQ: CInt = 1 shl 8

// linux/mempolicy.h
public val MPOL_DEFAULT: CInt = 0

public val MPOL_PREFERRED: CInt = 1

public val MPOL_BIND: CInt = 2

public val MPOL_INTERLEAVE: CInt = 3

public val MPOL_LOCAL: CInt = 4

public val MPOL_F_NUMA_BALANCING: CInt = 1 shl 13

public val MPOL_F_RELATIVE_NODES: CInt = 1 shl 14

public val MPOL_F_STATIC_NODES: CInt = 1 shl 15

// bits/seekConstants.h
public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

// sys/socket.h
public val AF_NFC: CInt = 39

public val AF_VSOCK: CInt = 40

public val PF_NFC: CInt = AF_NFC

public val PF_VSOCK: CInt = AF_VSOCK

public val SOMAXCONN: CInt = 128

// sys/systemProperties.h
public val PROP_VALUE_MAX: CInt = 92

public val PROP_NAME_MAX: CInt = 32

// sys/prctl.h
public val PR_SET_PDEATHSIG: CInt = 1

public val PR_GET_PDEATHSIG: CInt = 2

public val PR_GET_DUMPABLE: CInt = 3

public val PR_SET_DUMPABLE: CInt = 4

public val PR_GET_UNALIGN: CInt = 5

public val PR_SET_UNALIGN: CInt = 6

public val PR_UNALIGN_NOPRINT: CInt = 1

public val PR_UNALIGN_SIGBUS: CInt = 2

public val PR_GET_KEEPCAPS: CInt = 7

public val PR_SET_KEEPCAPS: CInt = 8

public val PR_GET_FPEMU: CInt = 9

public val PR_SET_FPEMU: CInt = 10

public val PR_FPEMU_NOPRINT: CInt = 1

public val PR_FPEMU_SIGFPE: CInt = 2

public val PR_GET_FPEXC: CInt = 11

public val PR_SET_FPEXC: CInt = 12

public val PR_FP_EXC_SW_ENABLE: CInt = 0x80

public val PR_FP_EXC_DIV: CInt = 0x010000

public val PR_FP_EXC_OVF: CInt = 0x020000

public val PR_FP_EXC_UND: CInt = 0x040000

public val PR_FP_EXC_RES: CInt = 0x080000

public val PR_FP_EXC_INV: CInt = 0x100000

public val PR_FP_EXC_DISABLED: CInt = 0

public val PR_FP_EXC_NONRECOV: CInt = 1

public val PR_FP_EXC_ASYNC: CInt = 2

public val PR_FP_EXC_PRECISE: CInt = 3

public val PR_GET_TIMING: CInt = 13

public val PR_SET_TIMING: CInt = 14

public val PR_TIMING_STATISTICAL: CInt = 0

public val PR_TIMING_TIMESTAMP: CInt = 1

public val PR_SET_NAME: CInt = 15

public val PR_GET_NAME: CInt = 16

public val PR_GET_ENDIAN: CInt = 19

public val PR_SET_ENDIAN: CInt = 20

public val PR_ENDIAN_BIG: CInt = 0

public val PR_ENDIAN_LITTLE: CInt = 1

public val PR_ENDIAN_PPC_LITTLE: CInt = 2

public val PR_GET_SECCOMP: CInt = 21

public val PR_SET_SECCOMP: CInt = 22

public val PR_CAPBSET_READ: CInt = 23

public val PR_CAPBSET_DROP: CInt = 24

public val PR_GET_TSC: CInt = 25

public val PR_SET_TSC: CInt = 26

public val PR_TSC_ENABLE: CInt = 1

public val PR_TSC_SIGSEGV: CInt = 2

public val PR_GET_SECUREBITS: CInt = 27

public val PR_SET_SECUREBITS: CInt = 28

public val PR_SET_TIMERSLACK: CInt = 29

public val PR_GET_TIMERSLACK: CInt = 30

public val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31

public val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32

public val PR_MCE_KILL: CInt = 33

public val PR_MCE_KILL_CLEAR: CInt = 0

public val PR_MCE_KILL_SET: CInt = 1

public val PR_MCE_KILL_LATE: CInt = 0

public val PR_MCE_KILL_EARLY: CInt = 1

public val PR_MCE_KILL_DEFAULT: CInt = 2

public val PR_MCE_KILL_GET: CInt = 34

public val PR_SET_MM: CInt = 35

public val PR_SET_MM_START_CODE: CInt = 1

public val PR_SET_MM_END_CODE: CInt = 2

public val PR_SET_MM_START_DATA: CInt = 3

public val PR_SET_MM_END_DATA: CInt = 4

public val PR_SET_MM_START_STACK: CInt = 5

public val PR_SET_MM_START_BRK: CInt = 6

public val PR_SET_MM_BRK: CInt = 7

public val PR_SET_MM_ARG_START: CInt = 8

public val PR_SET_MM_ARG_END: CInt = 9

public val PR_SET_MM_ENV_START: CInt = 10

public val PR_SET_MM_ENV_END: CInt = 11

public val PR_SET_MM_AUXV: CInt = 12

public val PR_SET_MM_EXE_FILE: CInt = 13

public val PR_SET_MM_MAP: CInt = 14

public val PR_SET_MM_MAP_SIZE: CInt = 15

public val PR_SET_PTRACER: CInt = 0x59616d61

public val PR_SET_PTRACER_ANY: CUlong = 0xffffffffffffffffuL

public val PR_SET_CHILD_SUBREAPER: CInt = 36

public val PR_GET_CHILD_SUBREAPER: CInt = 37

public val PR_SET_NO_NEW_PRIVS: CInt = 38

public val PR_GET_NO_NEW_PRIVS: CInt = 39

public val PR_GET_TID_ADDRESS: CInt = 40

public val PR_SET_THP_DISABLE: CInt = 41

public val PR_GET_THP_DISABLE: CInt = 42

public val PR_MPX_ENABLE_MANAGEMENT: CInt = 43

public val PR_MPX_DISABLE_MANAGEMENT: CInt = 44

public val PR_SET_FP_MODE: CInt = 45

public val PR_GET_FP_MODE: CInt = 46

public val PR_FP_MODE_FR: CInt = 1 shl 0

public val PR_FP_MODE_FRE: CInt = 1 shl 1

public val PR_CAP_AMBIENT: CInt = 47

public val PR_CAP_AMBIENT_IS_SET: CInt = 1

public val PR_CAP_AMBIENT_RAISE: CInt = 2

public val PR_CAP_AMBIENT_LOWER: CInt = 3

public val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4

public val PR_SVE_SET_VL: CInt = 50

public val PR_SVE_SET_VL_ONEXEC: CInt = 1 shl 18

public val PR_SVE_GET_VL: CInt = 51

public val PR_SVE_VL_LEN_MASK: CInt = 0xffff

public val PR_SVE_VL_INHERIT: CInt = 1 shl 17

public val PR_GET_SPECULATION_CTRL: CInt = 52

public val PR_SET_SPECULATION_CTRL: CInt = 53

public val PR_SPEC_STORE_BYPASS: CInt = 0

public val PR_SPEC_INDIRECT_BRANCH: CInt = 1

public val PR_SPEC_L1D_FLUSH: CInt = 2

public val PR_SPEC_NOT_AFFECTED: CInt = 0

public val PR_SPEC_PRCTL: CUlong = 1uL shl 0

public val PR_SPEC_ENABLE: CUlong = 1uL shl 1

public val PR_SPEC_DISABLE: CUlong = 1uL shl 2

public val PR_SPEC_FORCE_DISABLE: CUlong = 1uL shl 3

public val PR_SPEC_DISABLE_NOEXEC: CUlong = 1uL shl 4

public val PR_PAC_RESET_KEYS: CInt = 54

public val PR_PAC_APIAKEY: CUlong = 1uL shl 0

public val PR_PAC_APIBKEY: CUlong = 1uL shl 1

public val PR_PAC_APDAKEY: CUlong = 1uL shl 2

public val PR_PAC_APDBKEY: CUlong = 1uL shl 3

public val PR_PAC_APGAKEY: CUlong = 1uL shl 4

public val PR_SET_TAGGED_ADDR_CTRL: CInt = 55

public val PR_GET_TAGGED_ADDR_CTRL: CInt = 56

public val PR_TAGGED_ADDR_ENABLE: CUlong = 1uL shl 0

public val PR_MTE_TCF_NONE: CUlong = 0uL

public val PR_MTE_TCF_SYNC: CUlong = 1uL shl 1

public val PR_MTE_TCF_ASYNC: CUlong = 1uL shl 2

public val PR_MTE_TCF_MASK: CUlong = PR_MTE_TCF_SYNC or PR_MTE_TCF_ASYNC

public val PR_MTE_TAG_SHIFT: CUlong = 3uL

public val PR_MTE_TAG_MASK: CUlong = 0xffffuL shl PR_MTE_TAG_SHIFT.toInt()

public val PR_MTE_TCF_SHIFT: CUlong = 1uL

public val PR_SET_IO_FLUSHER: CInt = 57

public val PR_GET_IO_FLUSHER: CInt = 58

public val PR_SET_SYSCALL_USER_DISPATCH: CInt = 59

public val PR_SYS_DISPATCH_OFF: CInt = 0

public val PR_SYS_DISPATCH_ON: CInt = 1

public val SYSCALL_DISPATCH_FILTER_ALLOW: CInt = 0

public val SYSCALL_DISPATCH_FILTER_BLOCK: CInt = 1

public val PR_PAC_SET_ENABLED_KEYS: CInt = 60

public val PR_PAC_GET_ENABLED_KEYS: CInt = 61

public val PR_SCHED_CORE: CInt = 62

public val PR_SCHED_CORE_GET: CInt = 0

public val PR_SCHED_CORE_CREATE: CInt = 1

public val PR_SCHED_CORE_SHARE_TO: CInt = 2

public val PR_SCHED_CORE_SHARE_FROM: CInt = 3

public val PR_SCHED_CORE_MAX: CInt = 4

public val PR_SCHED_CORE_SCOPE_THREAD: CInt = 0

public val PR_SCHED_CORE_SCOPE_THREAD_GROUP: CInt = 1

public val PR_SCHED_CORE_SCOPE_PROCESS_GROUP: CInt = 2

public val PR_SME_SET_VL: CInt = 63

public val PR_SME_SET_VL_ONEXEC: CInt = 1 shl 18

public val PR_SME_GET_VL: CInt = 64

public val PR_SME_VL_LEN_MASK: CInt = 0xffff

public val PR_SME_VL_INHERIT: CInt = 1 shl 17

public val PR_SET_MDWE: CInt = 65

public val PR_MDWE_REFUSE_EXEC_GAIN: CUlong = 1uL shl 0

public val PR_MDWE_NO_INHERIT: CUlong = 1uL shl 1

public val PR_GET_MDWE: CInt = 66

public val PR_SET_VMA: CInt = 0x53564d41

public val PR_SET_VMA_ANON_NAME: CInt = 0

public val PR_GET_AUXV: CInt = 0x41555856

public val PR_SET_MEMORY_MERGE: CInt = 67

public val PR_GET_MEMORY_MERGE: CInt = 68

public val PR_RISCV_V_SET_CONTROL: CInt = 69

public val PR_RISCV_V_GET_CONTROL: CInt = 70

public val PR_RISCV_V_VSTATE_CTRL_DEFAULT: CInt = 0

public val PR_RISCV_V_VSTATE_CTRL_OFF: CInt = 1

public val PR_RISCV_V_VSTATE_CTRL_ON: CInt = 2

public val PR_RISCV_V_VSTATE_CTRL_INHERIT: CInt = 1 shl 4

public val PR_RISCV_V_VSTATE_CTRL_CUR_MASK: CInt = 0x3

public val PR_RISCV_V_VSTATE_CTRL_NEXT_MASK: CInt = 0xc

public val PR_RISCV_V_VSTATE_CTRL_MASK: CInt = 0x1f

// linux/ifAddr.h
public val IFA_UNSPEC: CUshort = 0u

public val IFA_ADDRESS: CUshort = 1u

public val IFA_LOCAL: CUshort = 2u

public val IFA_LABEL: CUshort = 3u

public val IFA_BROADCAST: CUshort = 4u

public val IFA_ANYCAST: CUshort = 5u

public val IFA_CACHEINFO: CUshort = 6u

public val IFA_MULTICAST: CUshort = 7u

public val IFA_F_SECONDARY: UInt = 0x01u

public val IFA_F_TEMPORARY: UInt = 0x01u

public val IFA_F_NODAD: UInt = 0x02u

public val IFA_F_OPTIMISTIC: UInt = 0x04u

public val IFA_F_DADFAILED: UInt = 0x08u

public val IFA_F_HOMEADDRESS: UInt = 0x10u

public val IFA_F_DEPRECATED: UInt = 0x20u

public val IFA_F_TENTATIVE: UInt = 0x40u

public val IFA_F_PERMANENT: UInt = 0x80u

// linux/ifLink.h
public val IFLA_UNSPEC: CUshort = 0u

public val IFLA_ADDRESS: CUshort = 1u

public val IFLA_BROADCAST: CUshort = 2u

public val IFLA_IFNAME: CUshort = 3u

public val IFLA_MTU: CUshort = 4u

public val IFLA_LINK: CUshort = 5u

public val IFLA_QDISC: CUshort = 6u

public val IFLA_STATS: CUshort = 7u

public val IFLA_COST: CUshort = 8u

public val IFLA_PRIORITY: CUshort = 9u

public val IFLA_MASTER: CUshort = 10u

public val IFLA_WIRELESS: CUshort = 11u

public val IFLA_PROTINFO: CUshort = 12u

public val IFLA_TXQLEN: CUshort = 13u

public val IFLA_MAP: CUshort = 14u

public val IFLA_WEIGHT: CUshort = 15u

public val IFLA_OPERSTATE: CUshort = 16u

public val IFLA_LINKMODE: CUshort = 17u

public val IFLA_LINKINFO: CUshort = 18u

public val IFLA_NET_NS_PID: CUshort = 19u

public val IFLA_IFALIAS: CUshort = 20u

public val IFLA_NUM_VF: CUshort = 21u

public val IFLA_VFINFO_LIST: CUshort = 22u

public val IFLA_STATS64: CUshort = 23u

public val IFLA_VF_PORTS: CUshort = 24u

public val IFLA_PORT_SELF: CUshort = 25u

public val IFLA_AF_SPEC: CUshort = 26u

public val IFLA_GROUP: CUshort = 27u

public val IFLA_NET_NS_FD: CUshort = 28u

public val IFLA_EXT_MASK: CUshort = 29u

public val IFLA_PROMISCUITY: CUshort = 30u

public val IFLA_NUM_TX_QUEUES: CUshort = 31u

public val IFLA_NUM_RX_QUEUES: CUshort = 32u

public val IFLA_CARRIER: CUshort = 33u

public val IFLA_PHYS_PORT_ID: CUshort = 34u

public val IFLA_CARRIER_CHANGES: CUshort = 35u

public val IFLA_PHYS_SWITCH_ID: CUshort = 36u

public val IFLA_LINK_NETNSID: CUshort = 37u

public val IFLA_PHYS_PORT_NAME: CUshort = 38u

public val IFLA_PROTO_DOWN: CUshort = 39u

public val IFLA_GSO_MAX_SEGS: CUshort = 40u

public val IFLA_GSO_MAX_SIZE: CUshort = 41u

public val IFLA_PAD: CUshort = 42u

public val IFLA_XDP: CUshort = 43u

public val IFLA_EVENT: CUshort = 44u

public val IFLA_NEW_NETNSID: CUshort = 45u

public val IFLA_IF_NETNSID: CUshort = 46u

public val IFLA_TARGET_NETNSID: CUshort = IFLA_IF_NETNSID

public val IFLA_CARRIER_UP_COUNT: CUshort = 47u

public val IFLA_CARRIER_DOWN_COUNT: CUshort = 48u

public val IFLA_NEW_IFINDEX: CUshort = 49u

public val IFLA_MIN_MTU: CUshort = 50u

public val IFLA_MAX_MTU: CUshort = 51u

public val IFLA_PROP_LIST: CUshort = 52u

public val IFLA_ALT_IFNAME: CUshort = 53u

public val IFLA_PERM_ADDRESS: CUshort = 54u

public val IFLA_PROTO_DOWN_REASON: CUshort = 55u

public val IFLA_PARENT_DEV_NAME: CUshort = 56u

public val IFLA_PARENT_DEV_BUS_NAME: CUshort = 57u

public val IFLA_GRO_MAX_SIZE: CUshort = 58u

public val IFLA_TSO_MAX_SIZE: CUshort = 59u

public val IFLA_TSO_MAX_SEGS: CUshort = 60u

public val IFLA_ALLMULTI: CUshort = 61u

public val IFLA_DEVLINK_PORT: CUshort = 62u

public val IFLA_GSO_IPV4_MAX_SIZE: CUshort = 63u

public val IFLA_GRO_IPV4_MAX_SIZE: CUshort = 64u

public val IFLA_INFO_UNSPEC: CUshort = 0u

public val IFLA_INFO_KIND: CUshort = 1u

public val IFLA_INFO_DATA: CUshort = 2u

public val IFLA_INFO_XSTATS: CUshort = 3u

public val IFLA_INFO_SLAVE_KIND: CUshort = 4u

public val IFLA_INFO_SLAVE_DATA: CUshort = 5u

// linux/rtnetlink.h
public val TCA_UNSPEC: CUshort = 0u

public val TCA_KIND: CUshort = 1u

public val TCA_OPTIONS: CUshort = 2u

public val TCA_STATS: CUshort = 3u

public val TCA_XSTATS: CUshort = 4u

public val TCA_RATE: CUshort = 5u

public val TCA_FCNT: CUshort = 6u

public val TCA_STATS2: CUshort = 7u

public val TCA_STAB: CUshort = 8u

public val RTM_NEWLINK: UShort = 16u

public val RTM_DELLINK: UShort = 17u

public val RTM_GETLINK: UShort = 18u

public val RTM_SETLINK: UShort = 19u

public val RTM_NEWADDR: UShort = 20u

public val RTM_DELADDR: UShort = 21u

public val RTM_GETADDR: UShort = 22u

public val RTM_NEWROUTE: UShort = 24u

public val RTM_DELROUTE: UShort = 25u

public val RTM_GETROUTE: UShort = 26u

public val RTM_NEWNEIGH: UShort = 28u

public val RTM_DELNEIGH: UShort = 29u

public val RTM_GETNEIGH: UShort = 30u

public val RTM_NEWRULE: UShort = 32u

public val RTM_DELRULE: UShort = 33u

public val RTM_GETRULE: UShort = 34u

public val RTM_NEWQDISC: UShort = 36u

public val RTM_DELQDISC: UShort = 37u

public val RTM_GETQDISC: UShort = 38u

public val RTM_NEWTCLASS: UShort = 40u

public val RTM_DELTCLASS: UShort = 41u

public val RTM_GETTCLASS: UShort = 42u

public val RTM_NEWTFILTER: UShort = 44u

public val RTM_DELTFILTER: UShort = 45u

public val RTM_GETTFILTER: UShort = 46u

public val RTM_NEWACTION: UShort = 48u

public val RTM_DELACTION: UShort = 49u

public val RTM_GETACTION: UShort = 50u

public val RTM_NEWPREFIX: UShort = 52u

public val RTM_GETMULTICAST: UShort = 58u

public val RTM_GETANYCAST: UShort = 62u

public val RTM_NEWNEIGHTBL: UShort = 64u

public val RTM_GETNEIGHTBL: UShort = 66u

public val RTM_SETNEIGHTBL: UShort = 67u

public val RTM_NEWNDUSEROPT: UShort = 68u

public val RTM_NEWADDRLABEL: UShort = 72u

public val RTM_DELADDRLABEL: UShort = 73u

public val RTM_GETADDRLABEL: UShort = 74u

public val RTM_GETDCB: UShort = 78u

public val RTM_SETDCB: UShort = 79u

public val RTM_NEWNETCONF: UShort = 80u

public val RTM_GETNETCONF: UShort = 82u

public val RTM_NEWMDB: UShort = 84u

public val RTM_DELMDB: UShort = 85u

public val RTM_GETMDB: UShort = 86u

public val RTM_NEWNSID: UShort = 88u

public val RTM_DELNSID: UShort = 89u

public val RTM_GETNSID: UShort = 90u

public val RTM_F_NOTIFY: CUint = 0x100u

public val RTM_F_CLONED: CUint = 0x200u

public val RTM_F_EQUALIZE: CUint = 0x400u

public val RTM_F_PREFIX: CUint = 0x800u

public val RTA_UNSPEC: CUshort = 0u

public val RTA_DST: CUshort = 1u

public val RTA_SRC: CUshort = 2u

public val RTA_IIF: CUshort = 3u

public val RTA_OIF: CUshort = 4u

public val RTA_GATEWAY: CUshort = 5u

public val RTA_PRIORITY: CUshort = 6u

public val RTA_PREFSRC: CUshort = 7u

public val RTA_METRICS: CUshort = 8u

public val RTA_MULTIPATH: CUshort = 9u

public val RTA_PROTOINFO: CUshort = 10u

// No longer used
public val RTA_FLOW: CUshort = 11u

public val RTA_CACHEINFO: CUshort = 12u

public val RTA_SESSION: CUshort = 13u

// No longer used
public val RTA_MP_ALGO: CUshort = 14u

// No longer used
public val RTA_TABLE: CUshort = 15u

public val RTA_MARK: CUshort = 16u

public val RTA_MFC_STATS: CUshort = 17u

public val RTN_UNSPEC: CUchar = 0u

public val RTN_UNICAST: CUchar = 1u

public val RTN_LOCAL: CUchar = 2u

public val RTN_BROADCAST: CUchar = 3u

public val RTN_ANYCAST: CUchar = 4u

public val RTN_MULTICAST: CUchar = 5u

public val RTN_BLACKHOLE: CUchar = 6u

public val RTN_UNREACHABLE: CUchar = 7u

public val RTN_PROHIBIT: CUchar = 8u

public val RTN_THROW: CUchar = 9u

public val RTN_NAT: CUchar = 10u

public val RTN_XRESOLVE: CUchar = 11u

public val RTPROT_UNSPEC: CUchar = 0u

public val RTPROT_REDIRECT: CUchar = 1u

public val RTPROT_KERNEL: CUchar = 2u

public val RTPROT_BOOT: CUchar = 3u

public val RTPROT_STATIC: CUchar = 4u

public val RT_SCOPE_UNIVERSE: CUchar = 0u

public val RT_SCOPE_SITE: CUchar = 200u

public val RT_SCOPE_LINK: CUchar = 253u

public val RT_SCOPE_HOST: CUchar = 254u

public val RT_SCOPE_NOWHERE: CUchar = 255u

public val RT_TABLE_UNSPEC: CUchar = 0u

public val RT_TABLE_COMPAT: CUchar = 252u

public val RT_TABLE_DEFAULT: CUchar = 253u

public val RT_TABLE_MAIN: CUchar = 254u

public val RT_TABLE_LOCAL: CUchar = 255u

public val RTMSG_NEWDEVICE: UInt = 0x11u

public val RTMSG_DELDEVICE: UInt = 0x12u

public val RTMSG_NEWROUTE: UInt = 0x21u

public val RTMSG_DELROUTE: UInt = 0x22u

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_NET: CInt = 3

public val CTL_FS: CInt = 5

public val CTL_DEBUG: CInt = 6

public val CTL_DEV: CInt = 7

public val CTL_BUS: CInt = 8

public val CTL_ABI: CInt = 9

public val CTL_CPU: CInt = 10

public val CTL_BUS_ISA: CInt = 1

public val INOTIFY_MAX_USER_INSTANCES: CInt = 1

public val INOTIFY_MAX_USER_WATCHES: CInt = 2

public val INOTIFY_MAX_QUEUED_EVENTS: CInt = 3

public val KERN_OSTYPE: CInt = 1

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_VERSION: CInt = 4

public val KERN_SECUREMASK: CInt = 5

public val KERN_PROF: CInt = 6

public val KERN_NODENAME: CInt = 7

public val KERN_DOMAINNAME: CInt = 8

public val KERN_PANIC: CInt = 15

public val KERN_REALROOTDEV: CInt = 16

public val KERN_SPARC_REBOOT: CInt = 21

public val KERN_CTLALTDEL: CInt = 22

public val KERN_PRINTK: CInt = 23

public val KERN_NAMETRANS: CInt = 24

public val KERN_PPC_HTABRECLAIM: CInt = 25

public val KERN_PPC_ZEROPAGED: CInt = 26

public val KERN_PPC_POWERSAVE_NAP: CInt = 27

public val KERN_MODPROBE: CInt = 28

public val KERN_SG_BIG_BUFF: CInt = 29

public val KERN_ACCT: CInt = 30

public val KERN_PPC_L2CR: CInt = 31

public val KERN_RTSIGNR: CInt = 32

public val KERN_RTSIGMAX: CInt = 33

public val KERN_SHMMAX: CInt = 34

public val KERN_MSGMAX: CInt = 35

public val KERN_MSGMNB: CInt = 36

public val KERN_MSGPOOL: CInt = 37

public val KERN_SYSRQ: CInt = 38

public val KERN_MAX_THREADS: CInt = 39

public val KERN_RANDOM: CInt = 40

public val KERN_SHMALL: CInt = 41

public val KERN_MSGMNI: CInt = 42

public val KERN_SEM: CInt = 43

public val KERN_SPARC_STOP_A: CInt = 44

public val KERN_SHMMNI: CInt = 45

public val KERN_OVERFLOWUID: CInt = 46

public val KERN_OVERFLOWGID: CInt = 47

public val KERN_SHMPATH: CInt = 48

public val KERN_HOTPLUG: CInt = 49

public val KERN_IEEE_EMULATION_WARNINGS: CInt = 50

public val KERN_S390_USER_DEBUG_LOGGING: CInt = 51

public val KERN_CORE_USES_PID: CInt = 52

public val KERN_TAINTED: CInt = 53

public val KERN_CADPID: CInt = 54

public val KERN_PIDMAX: CInt = 55

public val KERN_CORE_PATTERN: CInt = 56

public val KERN_PANIC_ON_OOPS: CInt = 57

public val KERN_HPPA_PWRSW: CInt = 58

public val KERN_HPPA_UNALIGNED: CInt = 59

public val KERN_PRINTK_RATELIMIT: CInt = 60

public val KERN_PRINTK_RATELIMIT_BURST: CInt = 61

public val KERN_PTY: CInt = 62

public val KERN_NGROUPS_MAX: CInt = 63

public val KERN_SPARC_SCONS_PWROFF: CInt = 64

public val KERN_HZ_TIMER: CInt = 65

public val KERN_UNKNOWN_NMI_PANIC: CInt = 66

public val KERN_BOOTLOADER_TYPE: CInt = 67

public val KERN_RANDOMIZE: CInt = 68

public val KERN_SETUID_DUMPABLE: CInt = 69

public val KERN_SPIN_RETRY: CInt = 70

public val KERN_ACPI_VIDEO_FLAGS: CInt = 71

public val KERN_IA64_UNALIGNED: CInt = 72

public val KERN_COMPAT_LOG: CInt = 73

public val KERN_MAX_LOCK_DEPTH: CInt = 74

public val VM_OVERCOMMIT_MEMORY: CInt = 5

public val VM_PAGE_CLUSTER: CInt = 10

public val VM_DIRTY_BACKGROUND: CInt = 11

public val VM_DIRTY_RATIO: CInt = 12

public val VM_DIRTY_WB_CS: CInt = 13

public val VM_DIRTY_EXPIRE_CS: CInt = 14

public val VM_NR_PDFLUSH_THREADS: CInt = 15

public val VM_OVERCOMMIT_RATIO: CInt = 16

public val VM_PAGEBUF: CInt = 17

public val VM_HUGETLB_PAGES: CInt = 18

public val VM_SWAPPINESS: CInt = 19

public val VM_LOWMEM_RESERVE_RATIO: CInt = 20

public val VM_MIN_FREE_KBYTES: CInt = 21

public val VM_MAX_MAP_COUNT: CInt = 22

public val VM_LAPTOP_MODE: CInt = 23

public val VM_BLOCK_DUMP: CInt = 24

public val VM_HUGETLB_GROUP: CInt = 25

public val VM_VFS_CACHE_PRESSURE: CInt = 26

public val VM_LEGACY_VA_LAYOUT: CInt = 27

public val VM_SWAP_TOKEN_TIMEOUT: CInt = 28

public val VM_DROP_PAGECACHE: CInt = 29

public val VM_PERCPU_PAGELIST_FRACTION: CInt = 30

public val VM_ZONE_RECLAIM_MODE: CInt = 31

public val VM_MIN_UNMAPPED: CInt = 32

public val VM_PANIC_ON_OOM: CInt = 33

public val VM_VDSO_ENABLED: CInt = 34

public val NET_CORE: CInt = 1

public val NET_ETHER: CInt = 2

public val NET_802: CInt = 3

public val NET_UNIX: CInt = 4

public val NET_IPV4: CInt = 5

public val NET_IPX: CInt = 6

public val NET_ATALK: CInt = 7

public val NET_NETROM: CInt = 8

public val NET_AX25: CInt = 9

public val NET_BRIDGE: CInt = 10

public val NET_ROSE: CInt = 11

public val NET_IPV6: CInt = 12

public val NET_X25: CInt = 13

public val NET_TR: CInt = 14

public val NET_DECNET: CInt = 15

public val NET_ECONET: CInt = 16

public val NET_SCTP: CInt = 17

public val NET_LLC: CInt = 18

public val NET_NETFILTER: CInt = 19

public val NET_DCCP: CInt = 20

public val HUGETLB_FLAG_ENCODE_SHIFT: CInt = 26

public val MAP_HUGE_SHIFT: CInt = HUGETLB_FLAG_ENCODE_SHIFT

// include/linux/sched.h
public val PF_VCPU: CInt = 0x00000001

public val PF_IDLE: CInt = 0x00000002

public val PF_EXITING: CInt = 0x00000004

public val PF_POSTCOREDUMP: CInt = 0x00000008

public val PF_IO_WORKER: CInt = 0x00000010

public val PF_WQ_WORKER: CInt = 0x00000020

public val PF_FORKNOEXEC: CInt = 0x00000040

public val PF_MCE_PROCESS: CInt = 0x00000080

public val PF_SUPERPRIV: CInt = 0x00000100

public val PF_DUMPCORE: CInt = 0x00000200

public val PF_SIGNALED: CInt = 0x00000400

public val PF_MEMALLOC: CInt = 0x00000800

public val PF_NPROC_EXCEEDED: CInt = 0x00001000

public val PF_USED_MATH: CInt = 0x00002000

public val PF_USER_WORKER: CInt = 0x00004000

public val PF_NOFREEZE: CInt = 0x00008000

public val PF_KSWAPD: CInt = 0x00020000

public val PF_MEMALLOC_NOFS: CInt = 0x00040000

public val PF_MEMALLOC_NOIO: CInt = 0x00080000

public val PF_LOCAL_THROTTLE: CInt = 0x00100000

public val PF_KTHREAD: CInt = 0x00200000

public val PF_RANDOMIZE: CInt = 0x00400000

public val PF_NO_SETAFFINITY: CInt = 0x04000000

public val PF_MCE_EARLY: CInt = 0x08000000

public val PF_MEMALLOC_PIN: CInt = 0x10000000

public val PF_SUSPEND_TASK: CInt = 0x80000000

public val KLOG_CLOSE: CInt = 0

public val KLOG_OPEN: CInt = 1

public val KLOG_READ: CInt = 2

public val KLOG_READ_ALL: CInt = 3

public val KLOG_READ_CLEAR: CInt = 4

public val KLOG_CLEAR: CInt = 5

public val KLOG_CONSOLE_OFF: CInt = 6

public val KLOG_CONSOLE_ON: CInt = 7

public val KLOG_CONSOLE_LEVEL: CInt = 8

public val KLOG_SIZE_UNREAD: CInt = 9

public val KLOG_SIZE_BUFFER: CInt = 10

// From NDK's linux/auxvec.h
public val AT_NULL: CUlong = 0uL

public val AT_IGNORE: CUlong = 1uL

public val AT_EXECFD: CUlong = 2uL

public val AT_PHDR: CUlong = 3uL

public val AT_PHENT: CUlong = 4uL

public val AT_PHNUM: CUlong = 5uL

public val AT_PAGESZ: CUlong = 6uL

public val AT_BASE: CUlong = 7uL

public val AT_FLAGS: CUlong = 8uL

public val AT_ENTRY: CUlong = 9uL

public val AT_NOTELF: CUlong = 10uL

public val AT_UID: CUlong = 11uL

public val AT_EUID: CUlong = 12uL

public val AT_GID: CUlong = 13uL

public val AT_EGID: CUlong = 14uL

public val AT_PLATFORM: CUlong = 15uL

public val AT_HWCAP: CUlong = 16uL

public val AT_CLKTCK: CUlong = 17uL

public val AT_SECURE: CUlong = 23uL

public val AT_BASE_PLATFORM: CUlong = 24uL

public val AT_RANDOM: CUlong = 25uL

public val AT_HWCAP2: CUlong = 26uL

public val AT_RSEQ_FEATURE_SIZE: CUlong = 27uL

public val AT_RSEQ_ALIGN: CUlong = 28uL

public val AT_HWCAP3: CUlong = 29uL

public val AT_HWCAP4: CUlong = 30uL

public val AT_EXECFN: CUlong = 31uL

public val AT_MINSIGSTKSZ: CUlong = 51uL

// siginfo.h
public val SI_DETHREAD: CInt = -7

public val TRAP_PERF: CInt = 6

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public val XFS_SUPER_MAGIC: CLong = 0x58465342L

public val XFS_SUPER_MAGIC1: CUint = 0x58465342u
