package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val RTLD_DEEPBIND: Int = 0x8

public const val RTLD_GLOBAL: Int = 0x100

public const val RTLD_NOLOAD: Int = 0x4

public const val VEOF: ULong = 4uL

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL

public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL

public const val __NGREG: ULong = 48uL

public const val __NFPREG: ULong = 33uL

public const val __NVRREG: ULong = 34uL

public const val O_APPEND: Int = 1024

public const val O_CREAT: Int = 64

public const val O_EXCL: Int = 128

public const val O_NOCTTY: Int = 256

public const val O_NONBLOCK: Int = 2048

public const val O_SYNC: Int = 1052672

public const val O_RSYNC: Int = 1052672

public const val O_DSYNC: Int = 4096

public const val O_FSYNC: Int = 0x101000

public const val O_NOATIME: Int = 262144

public const val O_PATH: Int = 2097152

public val O_TMPFILE: Int = 4194304 or O_DIRECTORY

public const val MADV_SOFT_OFFLINE: Int = 101

public const val MAP_GROWSDOWN: Int = 0x0100

public const val MAP_ANON: Int = 0x0020

public const val MAP_ANONYMOUS: Int = 0x0020

public const val MAP_DENYWRITE: Int = 0x0800

public const val MAP_EXECUTABLE: Int = 0x01000

public const val MAP_POPULATE: Int = 0x08000

public const val MAP_NONBLOCK: Int = 0x010000

public const val MAP_STACK: Int = 0x020000

public const val MAP_HUGETLB: Int = 0x040000

public const val EDEADLK: Int = 35

public const val ENAMETOOLONG: Int = 36

public const val ENOLCK: Int = 37

public const val ENOSYS: Int = 38

public const val ENOTEMPTY: Int = 39

public const val ELOOP: Int = 40

public const val ENOMSG: Int = 42

public const val EIDRM: Int = 43

public const val ECHRNG: Int = 44

public const val EL2NSYNC: Int = 45

public const val EL3HLT: Int = 46

public const val EL3RST: Int = 47

public const val ELNRNG: Int = 48

public const val EUNATCH: Int = 49

public const val ENOCSI: Int = 50

public const val EL2HLT: Int = 51

public const val EBADE: Int = 52

public const val EBADR: Int = 53

public const val EXFULL: Int = 54

public const val ENOANO: Int = 55

public const val EBADRQC: Int = 56

public const val EBADSLT: Int = 57

public const val EMULTIHOP: Int = 72

public const val EOVERFLOW: Int = 75

public const val ENOTUNIQ: Int = 76

public const val EBADFD: Int = 77

public const val EBADMSG: Int = 74

public const val EREMCHG: Int = 78

public const val ELIBACC: Int = 79

public const val ELIBBAD: Int = 80

public const val ELIBSCN: Int = 81

public const val ELIBMAX: Int = 82

public const val ELIBEXEC: Int = 83

public const val EILSEQ: Int = 84

public const val ERESTART: Int = 85

public const val ESTRPIPE: Int = 86

public const val EUSERS: Int = 87

public const val ENOTSOCK: Int = 88

public const val EDESTADDRREQ: Int = 89

public const val EMSGSIZE: Int = 90

public const val EPROTOTYPE: Int = 91

public const val ENOPROTOOPT: Int = 92

public const val EPROTONOSUPPORT: Int = 93

public const val ESOCKTNOSUPPORT: Int = 94

public const val EOPNOTSUPP: Int = 95

public const val EPFNOSUPPORT: Int = 96

public const val EAFNOSUPPORT: Int = 97

public const val EADDRINUSE: Int = 98

public const val EADDRNOTAVAIL: Int = 99

public const val ENETDOWN: Int = 100

public const val ENETUNREACH: Int = 101

public const val ENETRESET: Int = 102

public const val ECONNABORTED: Int = 103

public const val ECONNRESET: Int = 104

public const val ENOBUFS: Int = 105

public const val EISCONN: Int = 106

public const val ENOTCONN: Int = 107

public const val ESHUTDOWN: Int = 108

public const val ETOOMANYREFS: Int = 109

public const val ETIMEDOUT: Int = 110

public const val ECONNREFUSED: Int = 111

public const val EHOSTDOWN: Int = 112

public const val EHOSTUNREACH: Int = 113

public const val EALREADY: Int = 114

public const val EINPROGRESS: Int = 115

public const val ESTALE: Int = 116

public const val EDQUOT: Int = 122

public const val ENOMEDIUM: Int = 123

public const val EMEDIUMTYPE: Int = 124

public const val ECANCELED: Int = 125

public const val ENOKEY: Int = 126

public const val EKEYEXPIRED: Int = 127

public const val EKEYREVOKED: Int = 128

public const val EKEYREJECTED: Int = 129

public const val EOWNERDEAD: Int = 130

public const val ENOTRECOVERABLE: Int = 131

public const val EHWPOISON: Int = 133

public const val ERFKILL: Int = 132

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SA_ONSTACK: Int = 0x08000000

public const val SA_SIGINFO: Int = 0x00000004

public const val SA_NOCLDWAIT: Int = 0x00000002

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGCHLD: Int = 17

public const val SIGBUS: Int = 7

public const val SIGUSR1: Int = 10

public const val SIGUSR2: Int = 12

public const val SIGCONT: Int = 18

public const val SIGSTOP: Int = 19

public const val SIGTSTP: Int = 20

public const val SIGURG: Int = 23

public const val SIGIO: Int = 29

public const val SIGSYS: Int = 31

public const val SIGSTKFLT: Int = 16

public const val SIGUNUSED: Int = 31

public const val SIGPOLL: Int = 29

public const val SIGPWR: Int = 30

public const val SIG_SETMASK: Int = 2

public const val SIG_BLOCK: Int = 0x000000

public const val SIG_UNBLOCK: Int = 0x01

public const val POLLWRNORM: Short = 0x100

public const val POLLWRBAND: Short = 0x200

public const val O_ASYNC: Int = 0x2000

public const val O_NDELAY: Int = 0x800

public const val PTRACE_DETACH: UInt = 17u

public const val EFD_NONBLOCK: Int = 0x800

public const val F_GETLK: Int = 5

public const val F_GETOWN: Int = 9

public const val F_SETOWN: Int = 8

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val F_RDLCK: Int = 0

public const val F_WRLCK: Int = 1

public const val F_UNLCK: Int = 2

public const val SFD_NONBLOCK: Int = 0x0800

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public const val SFD_CLOEXEC: Int = 0x080000

public const val NCCS: ULong = 32uL

public const val O_TRUNC: Int = 512

public const val O_CLOEXEC: Int = 0x80000

public const val EBFONT: Int = 59

public const val ENOSTR: Int = 60

public const val ENODATA: Int = 61

public const val ETIME: Int = 62

public const val ENOSR: Int = 63

public const val ENONET: Int = 64

public const val ENOPKG: Int = 65

public const val EREMOTE: Int = 66

public const val ENOLINK: Int = 67

public const val EADV: Int = 68

public const val ESRMNT: Int = 69

public const val ECOMM: Int = 70

public const val EPROTO: Int = 71

public const val EDOTDOT: Int = 73

public const val SA_NODEFER: Int = 0x40000000

public const val SA_RESETHAND: Int = 0x80000000.toInt()

public const val SA_RESTART: Int = 0x10000000

public const val SA_NOCLDSTOP: Int = 0x00000001

public const val EPOLL_CLOEXEC: Int = 0x80000

public const val EFD_CLOEXEC: Int = 0x80000

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public const val O_DIRECTORY: Int = 0x4000

public const val O_NOFOLLOW: Int = 0x8000

public const val O_DIRECT: Int = 0x20000

public const val MAP_LOCKED: Int = 0x00080

public const val MAP_NORESERVE: Int = 0x00040

public const val MAP_SYNC: Int = 0x080000

public const val EDEADLOCK: Int = 58

public const val EUCLEAN: Int = 117

public const val ENOTNAM: Int = 118

public const val ENAVAIL: Int = 119

public const val EISNAM: Int = 120

public const val EREMOTEIO: Int = 121

public const val MCL_CURRENT: Int = 0x2000

public const val MCL_FUTURE: Int = 0x4000

public const val MCL_ONFAULT: Int = 0x8000

public const val SIGSTKSZ: ULong = 0x4000uL

public const val MINSIGSTKSZ: ULong = 4096uL

public const val CBAUD: UInt = 0xffu

public const val TAB1: UInt = 0x400u

public const val TAB2: UInt = 0x800u

public const val TAB3: UInt = 0xc00u

public const val CR1: UInt = 0x1000u

public const val CR2: UInt = 0x2000u

public const val CR3: UInt = 0x3000u

public const val FF1: UInt = 0x4000u

public const val BS1: UInt = 0x8000u

public const val VT1: UInt = 0x10000u

public const val VWERASE: ULong = 0xauL

public const val VREPRINT: ULong = 0xbuL

public const val VSUSP: ULong = 0xcuL

public const val VSTART: ULong = 0xduL

public const val VSTOP: ULong = 0xeuL

public const val VDISCARD: ULong = 0x10uL

public const val VTIME: ULong = 0x7uL

public const val IXON: UInt = 0x200u

public const val IXOFF: UInt = 0x400u

public const val ONLCR: UInt = 0x2u

public const val CSIZE: UInt = 0x300u

public const val CS6: UInt = 0x100u

public const val CS7: UInt = 0x200u

public const val CS8: UInt = 0x300u

public const val CSTOPB: UInt = 0x400u

public const val CREAD: UInt = 0x800u

public const val PARENB: UInt = 0x1000u

public const val PARODD: UInt = 0x2000u

public const val HUPCL: UInt = 0x4000u

public const val CLOCAL: UInt = 0x8000u

public const val ECHOKE: UInt = 0x1u

public const val ECHOE: UInt = 0x2u

public const val ECHOK: UInt = 0x4u

public const val ECHONL: UInt = 0x10u

public const val ECHOPRT: UInt = 0x20u

public const val ECHOCTL: UInt = 0x40u

public const val ISIG: UInt = 0x80u

public const val ICANON: UInt = 0x100u

public const val PENDIN: UInt = 0x20000000u

public const val NOFLSH: UInt = 0x80000000u

public const val VSWTC: ULong = 9uL

public const val OLCUC: UInt = 4u

public const val NLDLY: UInt = 768u

public const val CRDLY: UInt = 12288u

public const val TABDLY: UInt = 3072u

public const val BSDLY: UInt = 32768u

public const val FFDLY: UInt = 16384u

public const val VTDLY: UInt = 65536u

public const val XTABS: UInt = 3072u

public const val B0: UInt = 0u

public const val B50: UInt = 1u

public const val B75: UInt = 2u

public const val B110: UInt = 3u

public const val B134: UInt = 4u

public const val B150: UInt = 5u

public const val B200: UInt = 6u

public const val B300: UInt = 7u

public const val B600: UInt = 8u

public const val B1200: UInt = 9u

public const val B1800: UInt = 10u

public const val B2400: UInt = 11u

public const val B4800: UInt = 12u

public const val B9600: UInt = 13u

public const val B19200: UInt = 14u

public const val B38400: UInt = 15u

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val CBAUDEX: UInt = 16u

public const val B57600: UInt = 16u

public const val B115200: UInt = 17u

public const val B230400: UInt = 18u

public const val B460800: UInt = 19u

public const val B500000: UInt = 20u

public const val B576000: UInt = 21u

public const val B921600: UInt = 22u

public const val B1000000: UInt = 23u

public const val B1152000: UInt = 24u

public const val B1500000: UInt = 25u

public const val B2000000: UInt = 26u

public const val B2500000: UInt = 27u

public const val B3000000: UInt = 28u

public const val B3500000: UInt = 29u

public const val B4000000: UInt = 30u

public const val VEOL: ULong = 6uL

public const val VEOL2: ULong = 8uL

public const val VMIN: ULong = 5uL

public const val IEXTEN: UInt = 0x400u

public const val TOSTOP: UInt = 0x400000u

public const val FLUSHO: UInt = 0x800000u

public const val EXTPROC: UInt = 0x10000000u

public const val SYS_restart_syscall: Long = 0

public const val SYS_exit: Long = 1

public const val SYS_fork: Long = 2

public const val SYS_read: Long = 3

public const val SYS_write: Long = 4

public const val SYS_open: Long = 5

public const val SYS_close: Long = 6

public const val SYS_waitpid: Long = 7

public const val SYS_creat: Long = 8

public const val SYS_link: Long = 9

public const val SYS_unlink: Long = 10

public const val SYS_execve: Long = 11

public const val SYS_chdir: Long = 12

public const val SYS_time: Long = 13

public const val SYS_mknod: Long = 14

public const val SYS_chmod: Long = 15

public const val SYS_lchown: Long = 16

public const val SYS_break: Long = 17

public const val SYS_oldstat: Long = 18

public const val SYS_lseek: Long = 19

public const val SYS_getpid: Long = 20

public const val SYS_mount: Long = 21

public const val SYS_umount: Long = 22

public const val SYS_setuid: Long = 23

public const val SYS_getuid: Long = 24

public const val SYS_stime: Long = 25

public const val SYS_ptrace: Long = 26

public const val SYS_alarm: Long = 27

public const val SYS_oldfstat: Long = 28

public const val SYS_pause: Long = 29

public const val SYS_utime: Long = 30

public const val SYS_stty: Long = 31

public const val SYS_gtty: Long = 32

public const val SYS_access: Long = 33

public const val SYS_nice: Long = 34

public const val SYS_ftime: Long = 35

public const val SYS_sync: Long = 36

public const val SYS_kill: Long = 37

public const val SYS_rename: Long = 38

public const val SYS_mkdir: Long = 39

public const val SYS_rmdir: Long = 40

public const val SYS_dup: Long = 41

public const val SYS_pipe: Long = 42

public const val SYS_times: Long = 43

public const val SYS_prof: Long = 44

public const val SYS_brk: Long = 45

public const val SYS_setgid: Long = 46

public const val SYS_getgid: Long = 47

public const val SYS_signal: Long = 48

public const val SYS_geteuid: Long = 49

public const val SYS_getegid: Long = 50

public const val SYS_acct: Long = 51

public const val SYS_umount2: Long = 52

public const val SYS_lock: Long = 53

public const val SYS_ioctl: Long = 54

public const val SYS_fcntl: Long = 55

public const val SYS_mpx: Long = 56

public const val SYS_setpgid: Long = 57

public const val SYS_ulimit: Long = 58

public const val SYS_oldolduname: Long = 59

public const val SYS_umask: Long = 60

public const val SYS_chroot: Long = 61

public const val SYS_ustat: Long = 62

public const val SYS_dup2: Long = 63

public const val SYS_getppid: Long = 64

public const val SYS_getpgrp: Long = 65

public const val SYS_setsid: Long = 66

public const val SYS_sigaction: Long = 67

public const val SYS_sgetmask: Long = 68

public const val SYS_ssetmask: Long = 69

public const val SYS_setreuid: Long = 70

public const val SYS_setregid: Long = 71

public const val SYS_sigsuspend: Long = 72

public const val SYS_sigpending: Long = 73

public const val SYS_sethostname: Long = 74

public const val SYS_setrlimit: Long = 75

public const val SYS_getrlimit: Long = 76

public const val SYS_getrusage: Long = 77

public const val SYS_gettimeofday: Long = 78

public const val SYS_settimeofday: Long = 79

public const val SYS_getgroups: Long = 80

public const val SYS_setgroups: Long = 81

public const val SYS_select: Long = 82

public const val SYS_symlink: Long = 83

public const val SYS_oldlstat: Long = 84

public const val SYS_readlink: Long = 85

public const val SYS_uselib: Long = 86

public const val SYS_swapon: Long = 87

public const val SYS_reboot: Long = 88

public const val SYS_readdir: Long = 89

public const val SYS_mmap: Long = 90

public const val SYS_munmap: Long = 91

public const val SYS_truncate: Long = 92

public const val SYS_ftruncate: Long = 93

public const val SYS_fchmod: Long = 94

public const val SYS_fchown: Long = 95

public const val SYS_getpriority: Long = 96

public const val SYS_setpriority: Long = 97

public const val SYS_profil: Long = 98

public const val SYS_statfs: Long = 99

public const val SYS_fstatfs: Long = 100

public const val SYS_ioperm: Long = 101

public const val SYS_socketcall: Long = 102

public const val SYS_syslog: Long = 103

public const val SYS_setitimer: Long = 104

public const val SYS_getitimer: Long = 105

public const val SYS_stat: Long = 106

public const val SYS_lstat: Long = 107

public const val SYS_fstat: Long = 108

public const val SYS_olduname: Long = 109

public const val SYS_iopl: Long = 110

public const val SYS_vhangup: Long = 111

public const val SYS_idle: Long = 112

public const val SYS_vm86: Long = 113

public const val SYS_wait4: Long = 114

public const val SYS_swapoff: Long = 115

public const val SYS_sysinfo: Long = 116

public const val SYS_ipc: Long = 117

public const val SYS_fsync: Long = 118

public const val SYS_sigreturn: Long = 119

public const val SYS_clone: Long = 120

public const val SYS_setdomainname: Long = 121

public const val SYS_uname: Long = 122

public const val SYS_modify_ldt: Long = 123

public const val SYS_adjtimex: Long = 124

public const val SYS_mprotect: Long = 125

public const val SYS_sigprocmask: Long = 126

public const val SYS_create_module: Long = 127

public const val SYS_init_module: Long = 128

public const val SYS_delete_module: Long = 129

public const val SYS_get_kernel_syms: Long = 130

public const val SYS_quotactl: Long = 131

public const val SYS_getpgid: Long = 132

public const val SYS_fchdir: Long = 133

public const val SYS_bdflush: Long = 134

public const val SYS_sysfs: Long = 135

public const val SYS_personality: Long = 136

public const val SYS_afs_syscall: Long = 137

public const val SYS_setfsuid: Long = 138

public const val SYS_setfsgid: Long = 139

public const val SYS__llseek: Long = 140

public const val SYS_getdents: Long = 141

public const val SYS__newselect: Long = 142

public const val SYS_flock: Long = 143

public const val SYS_msync: Long = 144

public const val SYS_readv: Long = 145

public const val SYS_writev: Long = 146

public const val SYS_getsid: Long = 147

public const val SYS_fdatasync: Long = 148

public const val SYS__sysctl: Long = 149

public const val SYS_mlock: Long = 150

public const val SYS_munlock: Long = 151

public const val SYS_mlockall: Long = 152

public const val SYS_munlockall: Long = 153

public const val SYS_sched_setparam: Long = 154

public const val SYS_sched_getparam: Long = 155

public const val SYS_sched_setscheduler: Long = 156

public const val SYS_sched_getscheduler: Long = 157

public const val SYS_sched_yield: Long = 158

public const val SYS_sched_get_priority_max: Long = 159

public const val SYS_sched_get_priority_min: Long = 160

public const val SYS_sched_rr_get_interval: Long = 161

public const val SYS_nanosleep: Long = 162

public const val SYS_mremap: Long = 163

public const val SYS_setresuid: Long = 164

public const val SYS_getresuid: Long = 165

public const val SYS_query_module: Long = 166

public const val SYS_poll: Long = 167

public const val SYS_nfsservctl: Long = 168

public const val SYS_setresgid: Long = 169

public const val SYS_getresgid: Long = 170

public const val SYS_prctl: Long = 171

public const val SYS_rt_sigreturn: Long = 172

public const val SYS_rt_sigaction: Long = 173

public const val SYS_rt_sigprocmask: Long = 174

public const val SYS_rt_sigpending: Long = 175

public const val SYS_rt_sigtimedwait: Long = 176

public const val SYS_rt_sigqueueinfo: Long = 177

public const val SYS_rt_sigsuspend: Long = 178

public const val SYS_pread64: Long = 179

public const val SYS_pwrite64: Long = 180

public const val SYS_chown: Long = 181

public const val SYS_getcwd: Long = 182

public const val SYS_capget: Long = 183

public const val SYS_capset: Long = 184

public const val SYS_sigaltstack: Long = 185

public const val SYS_sendfile: Long = 186

public const val SYS_getpmsg: Long = 187

public const val SYS_putpmsg: Long = 188

public const val SYS_vfork: Long = 189

public const val SYS_ugetrlimit: Long = 190

public const val SYS_readahead: Long = 191

public const val SYS_pciconfig_read: Long = 198

public const val SYS_pciconfig_write: Long = 199

public const val SYS_pciconfig_iobase: Long = 200

public const val SYS_multiplexer: Long = 201

public const val SYS_getdents64: Long = 202

public const val SYS_pivot_root: Long = 203

public const val SYS_madvise: Long = 205

public const val SYS_mincore: Long = 206

public const val SYS_gettid: Long = 207

public const val SYS_tkill: Long = 208

public const val SYS_setxattr: Long = 209

public const val SYS_lsetxattr: Long = 210

public const val SYS_fsetxattr: Long = 211

public const val SYS_getxattr: Long = 212

public const val SYS_lgetxattr: Long = 213

public const val SYS_fgetxattr: Long = 214

public const val SYS_listxattr: Long = 215

public const val SYS_llistxattr: Long = 216

public const val SYS_flistxattr: Long = 217

public const val SYS_removexattr: Long = 218

public const val SYS_lremovexattr: Long = 219

public const val SYS_fremovexattr: Long = 220

public const val SYS_futex: Long = 221

public const val SYS_sched_setaffinity: Long = 222

public const val SYS_sched_getaffinity: Long = 223

public const val SYS_tuxcall: Long = 225

public const val SYS_io_setup: Long = 227

public const val SYS_io_destroy: Long = 228

public const val SYS_io_getevents: Long = 229

public const val SYS_io_submit: Long = 230

public const val SYS_io_cancel: Long = 231

public const val SYS_set_tid_address: Long = 232

public const val SYS_exit_group: Long = 234

public const val SYS_lookup_dcookie: Long = 235

public const val SYS_epoll_create: Long = 236

public const val SYS_epoll_ctl: Long = 237

public const val SYS_epoll_wait: Long = 238

public const val SYS_remap_file_pages: Long = 239

public const val SYS_timer_create: Long = 240

public const val SYS_timer_settime: Long = 241

public const val SYS_timer_gettime: Long = 242

public const val SYS_timer_getoverrun: Long = 243

public const val SYS_timer_delete: Long = 244

public const val SYS_clock_settime: Long = 245

public const val SYS_clock_gettime: Long = 246

public const val SYS_clock_getres: Long = 247

public const val SYS_clock_nanosleep: Long = 248

public const val SYS_swapcontext: Long = 249

public const val SYS_tgkill: Long = 250

public const val SYS_utimes: Long = 251

public const val SYS_statfs64: Long = 252

public const val SYS_fstatfs64: Long = 253

public const val SYS_rtas: Long = 255

public const val SYS_sys_debug_setcontext: Long = 256

public const val SYS_migrate_pages: Long = 258

public const val SYS_mbind: Long = 259

public const val SYS_get_mempolicy: Long = 260

public const val SYS_set_mempolicy: Long = 261

public const val SYS_mq_open: Long = 262

public const val SYS_mq_unlink: Long = 263

public const val SYS_mq_timedsend: Long = 264

public const val SYS_mq_timedreceive: Long = 265

public const val SYS_mq_notify: Long = 266

public const val SYS_mq_getsetattr: Long = 267

public const val SYS_kexec_load: Long = 268

public const val SYS_add_key: Long = 269

public const val SYS_request_key: Long = 270

public const val SYS_keyctl: Long = 271

public const val SYS_waitid: Long = 272

public const val SYS_ioprio_set: Long = 273

public const val SYS_ioprio_get: Long = 274

public const val SYS_inotify_init: Long = 275

public const val SYS_inotify_add_watch: Long = 276

public const val SYS_inotify_rm_watch: Long = 277

public const val SYS_spu_run: Long = 278

public const val SYS_spu_create: Long = 279

public const val SYS_pselect6: Long = 280

public const val SYS_ppoll: Long = 281

public const val SYS_unshare: Long = 282

public const val SYS_splice: Long = 283

public const val SYS_tee: Long = 284

public const val SYS_vmsplice: Long = 285

public const val SYS_openat: Long = 286

public const val SYS_mkdirat: Long = 287

public const val SYS_mknodat: Long = 288

public const val SYS_fchownat: Long = 289

public const val SYS_futimesat: Long = 290

public const val SYS_newfstatat: Long = 291

public const val SYS_unlinkat: Long = 292

public const val SYS_renameat: Long = 293

public const val SYS_linkat: Long = 294

public const val SYS_symlinkat: Long = 295

public const val SYS_readlinkat: Long = 296

public const val SYS_fchmodat: Long = 297

public const val SYS_faccessat: Long = 298

public const val SYS_get_robust_list: Long = 299

public const val SYS_set_robust_list: Long = 300

public const val SYS_move_pages: Long = 301

public const val SYS_getcpu: Long = 302

public const val SYS_epoll_pwait: Long = 303

public const val SYS_utimensat: Long = 304

public const val SYS_signalfd: Long = 305

public const val SYS_timerfd_create: Long = 306

public const val SYS_eventfd: Long = 307

public const val SYS_sync_file_range2: Long = 308

public const val SYS_fallocate: Long = 309

public const val SYS_subpage_prot: Long = 310

public const val SYS_timerfd_settime: Long = 311

public const val SYS_timerfd_gettime: Long = 312

public const val SYS_signalfd4: Long = 313

public const val SYS_eventfd2: Long = 314

public const val SYS_epoll_create1: Long = 315

public const val SYS_dup3: Long = 316

public const val SYS_pipe2: Long = 317

public const val SYS_inotify_init1: Long = 318

public const val SYS_perf_event_open: Long = 319

public const val SYS_preadv: Long = 320

public const val SYS_pwritev: Long = 321

public const val SYS_rt_tgsigqueueinfo: Long = 322

public const val SYS_fanotify_init: Long = 323

public const val SYS_fanotify_mark: Long = 324

public const val SYS_prlimit64: Long = 325

public const val SYS_socket: Long = 326

public const val SYS_bind: Long = 327

public const val SYS_connect: Long = 328

public const val SYS_listen: Long = 329

public const val SYS_accept: Long = 330

public const val SYS_getsockname: Long = 331

public const val SYS_getpeername: Long = 332

public const val SYS_socketpair: Long = 333

public const val SYS_send: Long = 334

public const val SYS_sendto: Long = 335

public const val SYS_recv: Long = 336

public const val SYS_recvfrom: Long = 337

public const val SYS_shutdown: Long = 338

public const val SYS_setsockopt: Long = 339

public const val SYS_getsockopt: Long = 340

public const val SYS_sendmsg: Long = 341

public const val SYS_recvmsg: Long = 342

public const val SYS_recvmmsg: Long = 343

public const val SYS_accept4: Long = 344

public const val SYS_name_to_handle_at: Long = 345

public const val SYS_open_by_handle_at: Long = 346

public const val SYS_clock_adjtime: Long = 347

public const val SYS_syncfs: Long = 348

public const val SYS_sendmmsg: Long = 349

public const val SYS_setns: Long = 350

public const val SYS_process_vm_readv: Long = 351

public const val SYS_process_vm_writev: Long = 352

public const val SYS_finit_module: Long = 353

public const val SYS_kcmp: Long = 354

public const val SYS_sched_setattr: Long = 355

public const val SYS_sched_getattr: Long = 356

public const val SYS_renameat2: Long = 357

public const val SYS_seccomp: Long = 358

public const val SYS_getrandom: Long = 359

public const val SYS_memfd_create: Long = 360

public const val SYS_bpf: Long = 361

public const val SYS_execveat: Long = 362

public const val SYS_switch_endian: Long = 363

public const val SYS_userfaultfd: Long = 364

public const val SYS_membarrier: Long = 365

public const val SYS_mlock2: Long = 378

public const val SYS_copy_file_range: Long = 379

public const val SYS_preadv2: Long = 380

public const val SYS_pwritev2: Long = 381

public const val SYS_kexec_file_load: Long = 382

public const val SYS_statx: Long = 383

public const val SYS_rseq: Long = 387

public const val SYS_pidfd_send_signal: Long = 424

public const val SYS_io_uring_setup: Long = 425

public const val SYS_io_uring_enter: Long = 426

public const val SYS_io_uring_register: Long = 427

public const val SYS_open_tree: Long = 428

public const val SYS_move_mount: Long = 429

public const val SYS_fsopen: Long = 430

public const val SYS_fsconfig: Long = 431

public const val SYS_fsmount: Long = 432

public const val SYS_fspick: Long = 433

public const val SYS_pidfd_open: Long = 434

public const val SYS_clone3: Long = 435

public const val SYS_close_range: Long = 436

public const val SYS_openat2: Long = 437

public const val SYS_pidfd_getfd: Long = 438

public const val SYS_faccessat2: Long = 439

public const val SYS_process_madvise: Long = 440

public const val SYS_epoll_pwait2: Long = 441

public const val SYS_mount_setattr: Long = 442

public const val SYS_quotactl_fd: Long = 443

public const val SYS_landlock_create_ruleset: Long = 444

public const val SYS_landlock_add_rule: Long = 445

public const val SYS_landlock_restrict_self: Long = 446

public const val SYS_memfd_secret: Long = 447

public const val SYS_process_mrelease: Long = 448

public const val SYS_futex_waitv: Long = 449

public const val SYS_set_mempolicy_home_node: Long = 450
