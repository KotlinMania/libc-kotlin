package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.loongarch64

import io.github.kotlinmania.libc.*

public const val SYS_io_setup: Long = 0

public const val SYS_io_destroy: Long = 1

public const val SYS_io_submit: Long = 2

public const val SYS_io_cancel: Long = 3

public const val SYS_io_getevents: Long = 4

public const val SYS_setxattr: Long = 5

public const val SYS_lsetxattr: Long = 6

public const val SYS_fsetxattr: Long = 7

public const val SYS_getxattr: Long = 8

public const val SYS_lgetxattr: Long = 9

public const val SYS_fgetxattr: Long = 10

public const val SYS_listxattr: Long = 11

public const val SYS_llistxattr: Long = 12

public const val SYS_flistxattr: Long = 13

public const val SYS_removexattr: Long = 14

public const val SYS_lremovexattr: Long = 15

public const val SYS_fremovexattr: Long = 16

public const val SYS_getcwd: Long = 17

public const val SYS_lookup_dcookie: Long = 18

public const val SYS_eventfd2: Long = 19

public const val SYS_epoll_create1: Long = 20

public const val SYS_epoll_ctl: Long = 21

public const val SYS_epoll_pwait: Long = 22

public const val SYS_dup: Long = 23

public const val SYS_dup3: Long = 24

public const val SYS_fcntl: Long = 25

public const val SYS_inotify_init1: Long = 26

public const val SYS_inotify_add_watch: Long = 27

public const val SYS_inotify_rm_watch: Long = 28

public const val SYS_ioctl: Long = 29

public const val SYS_ioprio_set: Long = 30

public const val SYS_ioprio_get: Long = 31

public const val SYS_flock: Long = 32

public const val SYS_mknodat: Long = 33

public const val SYS_mkdirat: Long = 34

public const val SYS_unlinkat: Long = 35

public const val SYS_symlinkat: Long = 36

public const val SYS_linkat: Long = 37

public const val SYS_umount2: Long = 39

public const val SYS_mount: Long = 40

public const val SYS_pivot_root: Long = 41

public const val SYS_nfsservctl: Long = 42

public const val SYS_statfs: Long = 43

public const val SYS_fstatfs: Long = 44

public const val SYS_truncate: Long = 45

public const val SYS_ftruncate: Long = 46

public const val SYS_fallocate: Long = 47

public const val SYS_faccessat: Long = 48

public const val SYS_chdir: Long = 49

public const val SYS_fchdir: Long = 50

public const val SYS_chroot: Long = 51

public const val SYS_fchmod: Long = 52

public const val SYS_fchmodat: Long = 53

public const val SYS_fchownat: Long = 54

public const val SYS_fchown: Long = 55

public const val SYS_openat: Long = 56

public const val SYS_close: Long = 57

public const val SYS_vhangup: Long = 58

public const val SYS_pipe2: Long = 59

public const val SYS_quotactl: Long = 60

public const val SYS_getdents64: Long = 61

public const val SYS_lseek: Long = 62

public const val SYS_read: Long = 63

public const val SYS_write: Long = 64

public const val SYS_readv: Long = 65

public const val SYS_writev: Long = 66

public const val SYS_pread64: Long = 67

public const val SYS_pwrite64: Long = 68

public const val SYS_preadv: Long = 69

public const val SYS_pwritev: Long = 70

public const val SYS_sendfile: Long = 71

public const val SYS_pselect6: Long = 72

public const val SYS_ppoll: Long = 73

public const val SYS_signalfd4: Long = 74

public const val SYS_vmsplice: Long = 75

public const val SYS_splice: Long = 76

public const val SYS_tee: Long = 77

public const val SYS_readlinkat: Long = 78

public const val SYS_sync: Long = 81

public const val SYS_fsync: Long = 82

public const val SYS_fdatasync: Long = 83

public const val SYS_sync_file_range: Long = 84

public const val SYS_timerfd_create: Long = 85

public const val SYS_timerfd_settime: Long = 86

public const val SYS_timerfd_gettime: Long = 87

public const val SYS_utimensat: Long = 88

public const val SYS_acct: Long = 89

public const val SYS_capget: Long = 90

public const val SYS_capset: Long = 91

public const val SYS_personality: Long = 92

public const val SYS_exit: Long = 93

public const val SYS_exit_group: Long = 94

public const val SYS_waitid: Long = 95

public const val SYS_set_tid_address: Long = 96

public const val SYS_unshare: Long = 97

public const val SYS_futex: Long = 98

public const val SYS_set_robust_list: Long = 99

public const val SYS_get_robust_list: Long = 100

public const val SYS_nanosleep: Long = 101

public const val SYS_getitimer: Long = 102

public const val SYS_setitimer: Long = 103

public const val SYS_kexec_load: Long = 104

public const val SYS_init_module: Long = 105

public const val SYS_delete_module: Long = 106

public const val SYS_timer_create: Long = 107

public const val SYS_timer_gettime: Long = 108

public const val SYS_timer_getoverrun: Long = 109

public const val SYS_timer_settime: Long = 110

public const val SYS_timer_delete: Long = 111

public const val SYS_clock_settime: Long = 112

public const val SYS_clock_gettime: Long = 113

public const val SYS_clock_getres: Long = 114

public const val SYS_clock_nanosleep: Long = 115

public const val SYS_syslog: Long = 116

public const val SYS_ptrace: Long = 117

public const val SYS_sched_setparam: Long = 118

public const val SYS_sched_setscheduler: Long = 119

public const val SYS_sched_getscheduler: Long = 120

public const val SYS_sched_getparam: Long = 121

public const val SYS_sched_setaffinity: Long = 122

public const val SYS_sched_getaffinity: Long = 123

public const val SYS_sched_yield: Long = 124

public const val SYS_sched_get_priority_max: Long = 125

public const val SYS_sched_get_priority_min: Long = 126

public const val SYS_sched_rr_get_interval: Long = 127

public const val SYS_restart_syscall: Long = 128

public const val SYS_kill: Long = 129

public const val SYS_tkill: Long = 130

public const val SYS_tgkill: Long = 131

public const val SYS_sigaltstack: Long = 132

public const val SYS_rt_sigsuspend: Long = 133

public const val SYS_rt_sigaction: Long = 134

public const val SYS_rt_sigprocmask: Long = 135

public const val SYS_rt_sigpending: Long = 136

public const val SYS_rt_sigtimedwait: Long = 137

public const val SYS_rt_sigqueueinfo: Long = 138

public const val SYS_rt_sigreturn: Long = 139

public const val SYS_setpriority: Long = 140

public const val SYS_getpriority: Long = 141

public const val SYS_reboot: Long = 142

public const val SYS_setregid: Long = 143

public const val SYS_setgid: Long = 144

public const val SYS_setreuid: Long = 145

public const val SYS_setuid: Long = 146

public const val SYS_setresuid: Long = 147

public const val SYS_getresuid: Long = 148

public const val SYS_setresgid: Long = 149

public const val SYS_getresgid: Long = 150

public const val SYS_setfsuid: Long = 151

public const val SYS_setfsgid: Long = 152

public const val SYS_times: Long = 153

public const val SYS_setpgid: Long = 154

public const val SYS_getpgid: Long = 155

public const val SYS_getsid: Long = 156

public const val SYS_setsid: Long = 157

public const val SYS_getgroups: Long = 158

public const val SYS_setgroups: Long = 159

public const val SYS_uname: Long = 160

public const val SYS_sethostname: Long = 161

public const val SYS_setdomainname: Long = 162

public const val SYS_getrusage: Long = 165

public const val SYS_umask: Long = 166

public const val SYS_prctl: Long = 167

public const val SYS_getcpu: Long = 168

public const val SYS_gettimeofday: Long = 169

public const val SYS_settimeofday: Long = 170

public const val SYS_adjtimex: Long = 171

public const val SYS_getpid: Long = 172

public const val SYS_getppid: Long = 173

public const val SYS_getuid: Long = 174

public const val SYS_geteuid: Long = 175

public const val SYS_getgid: Long = 176

public const val SYS_getegid: Long = 177

public const val SYS_gettid: Long = 178

public const val SYS_sysinfo: Long = 179

public const val SYS_mq_open: Long = 180

public const val SYS_mq_unlink: Long = 181

public const val SYS_mq_timedsend: Long = 182

public const val SYS_mq_timedreceive: Long = 183

public const val SYS_mq_notify: Long = 184

public const val SYS_mq_getsetattr: Long = 185

public const val SYS_msgget: Long = 186

public const val SYS_msgctl: Long = 187

public const val SYS_msgrcv: Long = 188

public const val SYS_msgsnd: Long = 189

public const val SYS_semget: Long = 190

public const val SYS_semctl: Long = 191

public const val SYS_semtimedop: Long = 192

public const val SYS_semop: Long = 193

public const val SYS_shmget: Long = 194

public const val SYS_shmctl: Long = 195

public const val SYS_shmat: Long = 196

public const val SYS_shmdt: Long = 197

public const val SYS_socket: Long = 198

public const val SYS_socketpair: Long = 199

public const val SYS_bind: Long = 200

public const val SYS_listen: Long = 201

public const val SYS_accept: Long = 202

public const val SYS_connect: Long = 203

public const val SYS_getsockname: Long = 204

public const val SYS_getpeername: Long = 205

public const val SYS_sendto: Long = 206

public const val SYS_recvfrom: Long = 207

public const val SYS_setsockopt: Long = 208

public const val SYS_getsockopt: Long = 209

public const val SYS_shutdown: Long = 210

public const val SYS_sendmsg: Long = 211

public const val SYS_recvmsg: Long = 212

public const val SYS_readahead: Long = 213

public const val SYS_brk: Long = 214

public const val SYS_munmap: Long = 215

public const val SYS_mremap: Long = 216

public const val SYS_add_key: Long = 217

public const val SYS_request_key: Long = 218

public const val SYS_keyctl: Long = 219

public const val SYS_clone: Long = 220

public const val SYS_execve: Long = 221

public const val SYS_mmap: Long = 222

public const val SYS_fadvise64: Long = 223

public const val SYS_swapon: Long = 224

public const val SYS_swapoff: Long = 225

public const val SYS_mprotect: Long = 226

public const val SYS_msync: Long = 227

public const val SYS_mlock: Long = 228

public const val SYS_munlock: Long = 229

public const val SYS_mlockall: Long = 230

public const val SYS_munlockall: Long = 231

public const val SYS_mincore: Long = 232

public const val SYS_madvise: Long = 233

public const val SYS_remap_file_pages: Long = 234

public const val SYS_mbind: Long = 235

public const val SYS_get_mempolicy: Long = 236

public const val SYS_set_mempolicy: Long = 237

public const val SYS_migrate_pages: Long = 238

public const val SYS_move_pages: Long = 239

public const val SYS_rt_tgsigqueueinfo: Long = 240

public const val SYS_perf_event_open: Long = 241

public const val SYS_accept4: Long = 242

public const val SYS_recvmmsg: Long = 243

public const val SYS_arch_specific_syscall: Long = 244

public const val SYS_wait4: Long = 260

public const val SYS_prlimit64: Long = 261

public const val SYS_fanotify_init: Long = 262

public const val SYS_fanotify_mark: Long = 263

public const val SYS_name_to_handle_at: Long = 264

public const val SYS_open_by_handle_at: Long = 265

public const val SYS_clock_adjtime: Long = 266

public const val SYS_syncfs: Long = 267

public const val SYS_setns: Long = 268

public const val SYS_sendmmsg: Long = 269

public const val SYS_process_vm_readv: Long = 270

public const val SYS_process_vm_writev: Long = 271

public const val SYS_kcmp: Long = 272

public const val SYS_finit_module: Long = 273

public const val SYS_sched_setattr: Long = 274

public const val SYS_sched_getattr: Long = 275

public const val SYS_renameat2: Long = 276

public const val SYS_seccomp: Long = 277

public const val SYS_getrandom: Long = 278

public const val SYS_memfd_create: Long = 279

public const val SYS_bpf: Long = 280

public const val SYS_execveat: Long = 281

public const val SYS_userfaultfd: Long = 282

public const val SYS_membarrier: Long = 283

public const val SYS_mlock2: Long = 284

public const val SYS_copy_file_range: Long = 285

public const val SYS_preadv2: Long = 286

public const val SYS_pwritev2: Long = 287

public const val SYS_pkey_mprotect: Long = 288

public const val SYS_pkey_alloc: Long = 289

public const val SYS_pkey_free: Long = 290

public const val SYS_statx: Long = 291

public const val SYS_io_pgetevents: Long = 292

public const val SYS_rseq: Long = 293

public const val SYS_kexec_file_load: Long = 294

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

public const val SYS_process_mrelease: Long = 448

public const val SYS_futex_waitv: Long = 449

public const val SYS_set_mempolicy_home_node: Long = 450

public const val SYS_cachestat: Long = 451

public const val SYS_fchmodat2: Long = 452

public const val SYS_map_shadow_stack: Long = 453

public const val SYS_futex_wake: Long = 454

public const val SYS_futex_wait: Long = 455

public const val SYS_futex_requeue: Long = 456

public const val O_APPEND: Int = 1024

public const val O_DIRECT: Int = 0x4000

public const val O_DIRECTORY: Int = 0x10000

public const val O_LARGEFILE: Int = 32768

public const val O_NOFOLLOW: Int = 0x20000

public const val O_CREAT: Int = 64

public const val O_EXCL: Int = 128

public const val O_NOCTTY: Int = 256

public const val O_NONBLOCK: Int = 2048

public const val O_SYNC: Int = 1052672

public const val O_RSYNC: Int = 1052672

public const val O_DSYNC: Int = 4096

public const val O_ASYNC: Int = 8192

public const val SIGSTKSZ: ULong = 16384uL

public const val MINSIGSTKSZ: ULong = 4096uL

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

public const val ENOTSUP: Int = EOPNOTSUPP

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

public const val EUCLEAN: Int = 117

public const val ENOTNAM: Int = 118

public const val ENAVAIL: Int = 119

public const val EISNAM: Int = 120

public const val EREMOTEIO: Int = 121

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

public const val MADV_SOFT_OFFLINE: Int = 101

public const val SA_ONSTACK: Int = 0x08000000

public const val SA_SIGINFO: Int = 0x00000004

public const val SA_NOCLDWAIT: Int = 0x00000002

public const val SIGCHLD: Int = 17

public const val SIGBUS: Int = 7

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGUSR1: Int = 10

public const val SIGUSR2: Int = 12

public const val SIGCONT: Int = 18

public const val SIGSTOP: Int = 19

public const val SIGTSTP: Int = 20

public const val SIGURG: Int = 23

public const val SIGIO: Int = 29

public const val SIGSYS: Int = 31

public const val SIGSTKFLT: Int = 16

public const val SIGPOLL: Int = 29

public const val SIGPWR: Int = 30

public const val SIG_SETMASK: Int = 2

public const val SIG_BLOCK: Int = 0

public const val SIG_UNBLOCK: Int = 1

public const val F_GETLK: Int = 5

public const val F_GETOWN: Int = 9

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val F_SETOWN: Int = 8

public const val VEOF: ULong = 4uL

public const val POLLWRNORM: Short = 0x100

public const val POLLWRBAND: Short = 0x200

public const val MAP_ANON: Int = 0x0020

public const val MAP_GROWSDOWN: Int = 0x0100

public const val MAP_DENYWRITE: Int = 0x0800

public const val MAP_EXECUTABLE: Int = 0x01000

public const val MAP_LOCKED: Int = 0x02000

public const val MAP_NORESERVE: Int = 0x04000

public const val MAP_POPULATE: Int = 0x08000

public const val MAP_NONBLOCK: Int = 0x010000

public const val MAP_STACK: Int = 0x020000

public const val MAP_HUGETLB: Int = 0x040000

public const val MAP_SYNC: Int = 0x080000

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MCL_ONFAULT: Int = 0x0004

public const val CBAUD: UInt = 4111u

public const val TAB1: Int = 0x00000800

public const val TAB2: Int = 0x00001000

public const val TAB3: Int = 0x00001800

public const val CR1: Int = 0x00000200

public const val CR2: Int = 0x00000400

public const val CR3: Int = 0x00000600

public const val FF1: Int = 0x00008000

public const val BS1: Int = 0x00002000

public const val VT1: Int = 0x00004000

public const val VWERASE: ULong = 14uL

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 5uL

public const val IXON: UInt = 0x00000400u

public const val IXOFF: UInt = 0x00001000u

public const val ONLCR: UInt = 0x4u

public const val CSIZE: UInt = 0x00000030u

public const val CS6: UInt = 0x00000010u

public const val CS7: UInt = 0x00000020u

public const val CS8: UInt = 0x00000030u

public const val CSTOPB: UInt = 0x00000040u

public const val CREAD: UInt = 0x00000080u

public const val PARENB: UInt = 0x00000100u

public const val PARODD: UInt = 0x00000200u

public const val HUPCL: UInt = 0x00000400u

public const val CLOCAL: UInt = 0x00000800u

public const val ECHOKE: UInt = 0x00000800u

public const val ECHOE: UInt = 0x00000010u

public const val ECHOK: UInt = 0x00000020u

public const val ECHONL: UInt = 0x00000040u

public const val ECHOPRT: UInt = 0x00000400u

public const val ECHOCTL: UInt = 0x00000200u

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val PENDIN: UInt = 0x00004000u

public const val NOFLSH: UInt = 0x00000080u

public const val CIBAUD: UInt = 269418496u

public const val CBAUDEX: UInt = 4096u

public const val VSWTC: ULong = 7uL

public const val OLCUC: UInt = 2u

public const val NLDLY: UInt = 256u

public const val CRDLY: UInt = 1536u

public const val TABDLY: UInt = 6144u

public const val BSDLY: UInt = 8192u

public const val FFDLY: UInt = 32768u

public const val VTDLY: UInt = 16384u

public const val XTABS: UInt = 6144u

public const val B57600: UInt = 4097u

public const val B115200: UInt = 4098u

public const val B230400: UInt = 4099u

public const val B460800: UInt = 4100u

public const val B500000: UInt = 4101u

public const val B576000: UInt = 4102u

public const val B921600: UInt = 4103u

public const val B1000000: UInt = 4104u

public const val B1152000: UInt = 4105u

public const val B1500000: UInt = 4106u

public const val B2000000: UInt = 4107u

public const val B2500000: UInt = 4108u

public const val B3000000: UInt = 4109u

public const val B3500000: UInt = 4110u

public const val B4000000: UInt = 4111u

public const val EDEADLK: Int = 35

public const val EDEADLOCK: Int = EDEADLK

public const val EXTPROC: UInt = 0x00010000u

public const val VEOL: ULong = 11uL

public const val VEOL2: ULong = 16uL

public const val VMIN: ULong = 6uL

public const val IEXTEN: UInt = 0x00008000u

public const val TOSTOP: UInt = 0x00000100u

public const val FLUSHO: UInt = 0x00001000u
