// port-lint: source unix/linux_like/android/b32/x86/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86

import io.github.kotlinmania.libc.*

public const val O_DIRECT: Int = 0x4000

public const val O_DIRECTORY: Int = 0x10000

public const val O_NOFOLLOW: Int = 0x20000

public const val O_LARGEFILE: Int = 32768

public const val MAP_32BIT: Int = 0x40

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

public const val SYS_vm86old: Long = 113

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

public const val SYS_vm86: Long = 166

public const val SYS_query_module: Long = 167

public const val SYS_poll: Long = 168

public const val SYS_nfsservctl: Long = 169

public const val SYS_setresgid: Long = 170

public const val SYS_getresgid: Long = 171

public const val SYS_prctl: Long = 172

public const val SYS_rt_sigreturn: Long = 173

public const val SYS_rt_sigaction: Long = 174

public const val SYS_rt_sigprocmask: Long = 175

public const val SYS_rt_sigpending: Long = 176

public const val SYS_rt_sigtimedwait: Long = 177

public const val SYS_rt_sigqueueinfo: Long = 178

public const val SYS_rt_sigsuspend: Long = 179

public const val SYS_pread64: Long = 180

public const val SYS_pwrite64: Long = 181

public const val SYS_chown: Long = 182

public const val SYS_getcwd: Long = 183

public const val SYS_capget: Long = 184

public const val SYS_capset: Long = 185

public const val SYS_sigaltstack: Long = 186

public const val SYS_sendfile: Long = 187

public const val SYS_getpmsg: Long = 188

public const val SYS_putpmsg: Long = 189

public const val SYS_vfork: Long = 190

public const val SYS_ugetrlimit: Long = 191

public const val SYS_mmap2: Long = 192

public const val SYS_truncate64: Long = 193

public const val SYS_ftruncate64: Long = 194

public const val SYS_stat64: Long = 195

public const val SYS_lstat64: Long = 196

public const val SYS_fstat64: Long = 197

public const val SYS_lchown32: Long = 198

public const val SYS_getuid32: Long = 199

public const val SYS_getgid32: Long = 200

public const val SYS_geteuid32: Long = 201

public const val SYS_getegid32: Long = 202

public const val SYS_setreuid32: Long = 203

public const val SYS_setregid32: Long = 204

public const val SYS_getgroups32: Long = 205

public const val SYS_setgroups32: Long = 206

public const val SYS_fchown32: Long = 207

public const val SYS_setresuid32: Long = 208

public const val SYS_getresuid32: Long = 209

public const val SYS_setresgid32: Long = 210

public const val SYS_getresgid32: Long = 211

public const val SYS_chown32: Long = 212

public const val SYS_setuid32: Long = 213

public const val SYS_setgid32: Long = 214

public const val SYS_setfsuid32: Long = 215

public const val SYS_setfsgid32: Long = 216

public const val SYS_pivot_root: Long = 217

public const val SYS_mincore: Long = 218

public const val SYS_madvise: Long = 219

public const val SYS_getdents64: Long = 220

public const val SYS_fcntl64: Long = 221

public const val SYS_gettid: Long = 224

public const val SYS_readahead: Long = 225

public const val SYS_setxattr: Long = 226

public const val SYS_lsetxattr: Long = 227

public const val SYS_fsetxattr: Long = 228

public const val SYS_getxattr: Long = 229

public const val SYS_lgetxattr: Long = 230

public const val SYS_fgetxattr: Long = 231

public const val SYS_listxattr: Long = 232

public const val SYS_llistxattr: Long = 233

public const val SYS_flistxattr: Long = 234

public const val SYS_removexattr: Long = 235

public const val SYS_lremovexattr: Long = 236

public const val SYS_fremovexattr: Long = 237

public const val SYS_tkill: Long = 238

public const val SYS_sendfile64: Long = 239

public const val SYS_futex: Long = 240

public const val SYS_sched_setaffinity: Long = 241

public const val SYS_sched_getaffinity: Long = 242

public const val SYS_set_thread_area: Long = 243

public const val SYS_get_thread_area: Long = 244

public const val SYS_io_setup: Long = 245

public const val SYS_io_destroy: Long = 246

public const val SYS_io_getevents: Long = 247

public const val SYS_io_submit: Long = 248

public const val SYS_io_cancel: Long = 249

public const val SYS_fadvise64: Long = 250

public const val SYS_exit_group: Long = 252

public const val SYS_lookup_dcookie: Long = 253

public const val SYS_epoll_create: Long = 254

public const val SYS_epoll_ctl: Long = 255

public const val SYS_epoll_wait: Long = 256

public const val SYS_remap_file_pages: Long = 257

public const val SYS_set_tid_address: Long = 258

public const val SYS_timer_create: Long = 259

public const val SYS_timer_settime: Long = 260

public const val SYS_timer_gettime: Long = 261

public const val SYS_timer_getoverrun: Long = 262

public const val SYS_timer_delete: Long = 263

public const val SYS_clock_settime: Long = 264

public const val SYS_clock_gettime: Long = 265

public const val SYS_clock_getres: Long = 266

public const val SYS_clock_nanosleep: Long = 267

public const val SYS_statfs64: Long = 268

public const val SYS_fstatfs64: Long = 269

public const val SYS_tgkill: Long = 270

public const val SYS_utimes: Long = 271

public const val SYS_fadvise64_64: Long = 272

public const val SYS_vserver: Long = 273

public const val SYS_mbind: Long = 274

public const val SYS_get_mempolicy: Long = 275

public const val SYS_set_mempolicy: Long = 276

public const val SYS_mq_open: Long = 277

public const val SYS_mq_unlink: Long = 278

public const val SYS_mq_timedsend: Long = 279

public const val SYS_mq_timedreceive: Long = 280

public const val SYS_mq_notify: Long = 281

public const val SYS_mq_getsetattr: Long = 282

public const val SYS_kexec_load: Long = 283

public const val SYS_waitid: Long = 284

public const val SYS_add_key: Long = 286

public const val SYS_request_key: Long = 287

public const val SYS_keyctl: Long = 288

public const val SYS_ioprio_set: Long = 289

public const val SYS_ioprio_get: Long = 290

public const val SYS_inotify_init: Long = 291

public const val SYS_inotify_add_watch: Long = 292

public const val SYS_inotify_rm_watch: Long = 293

public const val SYS_migrate_pages: Long = 294

public const val SYS_openat: Long = 295

public const val SYS_mkdirat: Long = 296

public const val SYS_mknodat: Long = 297

public const val SYS_fchownat: Long = 298

public const val SYS_futimesat: Long = 299

public const val SYS_fstatat64: Long = 300

public const val SYS_unlinkat: Long = 301

public const val SYS_renameat: Long = 302

public const val SYS_linkat: Long = 303

public const val SYS_symlinkat: Long = 304

public const val SYS_readlinkat: Long = 305

public const val SYS_fchmodat: Long = 306

public const val SYS_faccessat: Long = 307

public const val SYS_pselect6: Long = 308

public const val SYS_ppoll: Long = 309

public const val SYS_unshare: Long = 310

public const val SYS_set_robust_list: Long = 311

public const val SYS_get_robust_list: Long = 312

public const val SYS_splice: Long = 313

public const val SYS_sync_file_range: Long = 314

public const val SYS_tee: Long = 315

public const val SYS_vmsplice: Long = 316

public const val SYS_move_pages: Long = 317

public const val SYS_getcpu: Long = 318

public const val SYS_epoll_pwait: Long = 319

public const val SYS_utimensat: Long = 320

public const val SYS_signalfd: Long = 321

public const val SYS_timerfd_create: Long = 322

public const val SYS_eventfd: Long = 323

public const val SYS_fallocate: Long = 324

public const val SYS_timerfd_settime: Long = 325

public const val SYS_timerfd_gettime: Long = 326

public const val SYS_signalfd4: Long = 327

public const val SYS_eventfd2: Long = 328

public const val SYS_epoll_create1: Long = 329

public const val SYS_dup3: Long = 330

public const val SYS_pipe2: Long = 331

public const val SYS_inotify_init1: Long = 332

public const val SYS_preadv: Long = 333

public const val SYS_pwritev: Long = 334

public const val SYS_rt_tgsigqueueinfo: Long = 335

public const val SYS_perf_event_open: Long = 336

public const val SYS_recvmmsg: Long = 337

public const val SYS_fanotify_init: Long = 338

public const val SYS_fanotify_mark: Long = 339

public const val SYS_prlimit64: Long = 340

public const val SYS_name_to_handle_at: Long = 341

public const val SYS_open_by_handle_at: Long = 342

public const val SYS_clock_adjtime: Long = 343

public const val SYS_syncfs: Long = 344

public const val SYS_sendmmsg: Long = 345

public const val SYS_setns: Long = 346

public const val SYS_process_vm_readv: Long = 347

public const val SYS_process_vm_writev: Long = 348

public const val SYS_kcmp: Long = 349

public const val SYS_finit_module: Long = 350

public const val SYS_sched_setattr: Long = 351

public const val SYS_sched_getattr: Long = 352

public const val SYS_renameat2: Long = 353

public const val SYS_seccomp: Long = 354

public const val SYS_getrandom: Long = 355

public const val SYS_memfd_create: Long = 356

public const val SYS_bpf: Long = 357

public const val SYS_execveat: Long = 358

public const val SYS_socket: Long = 359

public const val SYS_socketpair: Long = 360

public const val SYS_bind: Long = 361

public const val SYS_connect: Long = 362

public const val SYS_listen: Long = 363

public const val SYS_accept4: Long = 364

public const val SYS_getsockopt: Long = 365

public const val SYS_setsockopt: Long = 366

public const val SYS_getsockname: Long = 367

public const val SYS_getpeername: Long = 368

public const val SYS_sendto: Long = 369

public const val SYS_sendmsg: Long = 370

public const val SYS_recvfrom: Long = 371

public const val SYS_recvmsg: Long = 372

public const val SYS_shutdown: Long = 373

public const val SYS_userfaultfd: Long = 374

public const val SYS_membarrier: Long = 375

public const val SYS_mlock2: Long = 376

public const val SYS_copy_file_range: Long = 377

public const val SYS_preadv2: Long = 378

public const val SYS_pwritev2: Long = 379

public const val SYS_pkey_mprotect: Long = 380

public const val SYS_pkey_alloc: Long = 381

public const val SYS_pkey_free: Long = 382

public const val SYS_statx: Long = 383

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

public const val EBX: Int = 0

public const val ECX: Int = 1

public const val EDX: Int = 2

public const val ESI: Int = 3

public const val EDI: Int = 4

public const val EBP: Int = 5

public const val EAX: Int = 6

public const val DS: Int = 7

public const val ES: Int = 8

public const val FS: Int = 9

public const val GS: Int = 10

public const val ORIG_EAX: Int = 11

public const val EIP: Int = 12

public const val CS: Int = 13

public const val EFL: Int = 14

public const val UESP: Int = 15

public const val SS: Int = 16

public const val REG_GS: Int = 0

public const val REG_FS: Int = 1

public const val REG_ES: Int = 2

public const val REG_DS: Int = 3

public const val REG_EDI: Int = 4

public const val REG_ESI: Int = 5

public const val REG_EBP: Int = 6

public const val REG_ESP: Int = 7

public const val REG_EBX: Int = 8

public const val REG_EDX: Int = 9

public const val REG_ECX: Int = 10

public const val REG_EAX: Int = 11

public const val REG_TRAPNO: Int = 12

public const val REG_ERR: Int = 13

public const val REG_EIP: Int = 14

public const val REG_CS: Int = 15

public const val REG_EFL: Int = 16

public const val REG_UESP: Int = 17

public const val REG_SS: Int = 18

public const val AT_SYSINFO: ULong = 32uL

public const val AT_SYSINFO_EHDR: ULong = 33uL

public const val AT_VECTOR_SIZE_ARCH: ULong = 3uL
