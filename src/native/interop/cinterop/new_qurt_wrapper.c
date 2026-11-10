#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "new_qurt_wrapper.h"
#include <errno.h>
#include <string.h>
#include <ctype.h>
#if !defined(_WIN32)
#include <dirent.h>
#endif
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#else
#include <dlfcn.h>
#ifndef RTLD_DEFAULT
#define RTLD_DEFAULT ((void*)0)
#endif
#endif

void* libc_new_qurt_opendir(const char* name) {
#if !defined(_WIN32)
    return (void*)opendir(name);
#else
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

void* libc_new_qurt_readdir(void* dirp) {
#if !defined(_WIN32)
    return (void*)readdir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t libc_new_qurt_closedir(void* dirp) {
#if !defined(_WIN32)
    return (int32_t)closedir((DIR*)dirp);
#else
    (void)dirp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t libc_new_qurt_mkdir(const char* path, uint32_t mode) {
    typedef int32_t (*km_fn_t)(const char*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "mkdir");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_mkdir");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "mkdir");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_mkdir");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "mkdir");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, mode);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_new_qurt_pthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize) {
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_getstack");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_getstack");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_getstack");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_getstack");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_attr_getstack");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, stackaddr, stacksize);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_new_qurt_pthreadAttrSetstack(void* attr, void* stackaddr, uint64_t stacksize) {
    typedef int32_t (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "pthread_attr_setstack");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_pthread_attr_setstack");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "pthread_attr_setstack");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_pthread_attr_setstack");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "pthread_attr_setstack");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(attr, stackaddr, stacksize);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_new_qurt_clockGetcpuclockid(int32_t pid, void* clock_id) {
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "clock_getcpuclockid");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_clock_getcpuclockid");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "clock_getcpuclockid");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_clock_getcpuclockid");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "clock_getcpuclockid");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pid, clock_id);
    }
    errno = ENOSYS;
    return -1;
}

void* libc_new_qurt_semOpen(const char* name, int32_t oflag, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
    typedef void* (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_open");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_open");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_open");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_open");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_open");
    }
#endif
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(name, oflag);
            case 1: return km_fn_ptr(name, oflag, (intptr_t)km_va0);
            case 2: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(name, oflag, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return NULL;
}

int32_t libc_new_qurt_semClose(void* sem) {
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_close");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_close");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_close");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_close");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_close");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sem);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_new_qurt_semUnlink(const char* name) {
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "sem_unlink");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_sem_unlink");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "sem_unlink");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_sem_unlink");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "sem_unlink");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return -1;
}

void* libc_new_qurt_alignedAlloc(uint64_t alignment, uint64_t size) {
    typedef void* (*km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "aligned_alloc");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_aligned_alloc");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "aligned_alloc");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_aligned_alloc");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "aligned_alloc");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(alignment, size);
    }
    errno = ENOSYS;
    return NULL;
}

uint64_t libc_new_qurt_strlen(const char* s) {
    return (uint64_t)strlen(s);
}

char* libc_new_qurt_strcpy(char* dest, const char* src) {
    return (char*)strcpy(dest, src);
}

char* libc_new_qurt_strncpy(char* dest, const char* src, uint64_t n) {
    return (char*)strncpy(dest, src, n);
}

char* libc_new_qurt_strcat(char* dest, const char* src) {
    return (char*)strcat(dest, src);
}

char* libc_new_qurt_strncat(char* dest, const char* src, uint64_t n) {
    return (char*)strncat(dest, src, n);
}

int32_t libc_new_qurt_strcmp(const char* s1, const char* s2) {
    return (int32_t)strcmp(s1, s2);
}

int32_t libc_new_qurt_strncmp(const char* s1, const char* s2, uint64_t n) {
    return (int32_t)strncmp(s1, s2, n);
}

int32_t libc_new_qurt_strcoll(const char* s1, const char* s2) {
    return (int32_t)strcoll(s1, s2);
}

uint64_t libc_new_qurt_strxfrm(char* dest, const char* src, uint64_t n) {
    return (uint64_t)strxfrm(dest, src, n);
}

char* libc_new_qurt_strchr(const char* s, int32_t c) {
    return (char*)strchr(s, c);
}

char* libc_new_qurt_strrchr(const char* s, int32_t c) {
    return (char*)strrchr(s, c);
}

uint64_t libc_new_qurt_strspn(const char* s, const char* arg_1_accept) {
    return (uint64_t)strspn(s, arg_1_accept);
}

uint64_t libc_new_qurt_strcspn(const char* s, const char* reject) {
    return (uint64_t)strcspn(s, reject);
}

char* libc_new_qurt_strpbrk(const char* s, const char* arg_1_accept) {
    return (char*)strpbrk(s, arg_1_accept);
}

char* libc_new_qurt_strstr(const char* haystack, const char* needle) {
    return (char*)strstr(haystack, needle);
}

char* libc_new_qurt_strtok(char* s, const char* delim) {
    return (char*)strtok(s, delim);
}

char* libc_new_qurt_strerror(int32_t errnum) {
    return (char*)strerror(errnum);
}

void* libc_new_qurt_memchr(void* s, int32_t c, uint64_t n) {
    return (void*)memchr(s, c, n);
}

int32_t libc_new_qurt_memcmp(void* s1, void* s2, uint64_t n) {
    return (int32_t)memcmp(s1, s2, n);
}

void* libc_new_qurt_memcpy(void* dest, void* src, uint64_t n) {
    return (void*)memcpy(dest, src, n);
}

void* libc_new_qurt_memmove(void* dest, void* src, uint64_t n) {
    return (void*)memmove(dest, src, n);
}

void* libc_new_qurt_memset(void* s, int32_t c, uint64_t n) {
    return (void*)memset(s, c, n);
}

int32_t libc_new_qurt_fork(void) {
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "fork");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_fork");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "fork");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_fork");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "fork");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_new_qurt_execve(const char* filename, void* argv, void* envp) {
    typedef int32_t (*km_fn_t)(const char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
        if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
        if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "execve");
        if (km_fn_ptr == NULL && km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "_execve");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
            if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
            if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "execve");
            if (km_fn_ptr == NULL && km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "_execve");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "execve");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, argv, envp);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_new_qurt_isalnum(int32_t c) {
    return (int32_t)isalnum(c);
}

int32_t libc_new_qurt_isalpha(int32_t c) {
    return (int32_t)isalpha(c);
}

int32_t libc_new_qurt_iscntrl(int32_t c) {
    return (int32_t)iscntrl(c);
}

int32_t libc_new_qurt_isdigit(int32_t c) {
    return (int32_t)isdigit(c);
}

int32_t libc_new_qurt_isgraph(int32_t c) {
    return (int32_t)isgraph(c);
}

int32_t libc_new_qurt_islower(int32_t c) {
    return (int32_t)islower(c);
}

int32_t libc_new_qurt_isprint(int32_t c) {
    return (int32_t)isprint(c);
}

int32_t libc_new_qurt_ispunct(int32_t c) {
    return (int32_t)ispunct(c);
}

int32_t libc_new_qurt_isspace(int32_t c) {
    return (int32_t)isspace(c);
}

int32_t libc_new_qurt_isupper(int32_t c) {
    return (int32_t)isupper(c);
}

int32_t libc_new_qurt_isxdigit(int32_t c) {
    return (int32_t)isxdigit(c);
}

int32_t libc_new_qurt_tolower(int32_t c) {
    return (int32_t)tolower(c);
}

int32_t libc_new_qurt_toupper(int32_t c) {
    return (int32_t)toupper(c);
}

