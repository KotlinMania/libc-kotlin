#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <napi.h>
#include <cstdint>
#include <cstddef>
#include <cstdlib>
#include <cstring>
#include <cerrno>
#include <string>
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

struct KmNapiRegistrarNode {
    void (*register_fn)(Napi::Env, Napi::Object);
    KmNapiRegistrarNode* next;
};
#if defined(__GNUC__) || defined(__clang__)
__attribute__((visibility("hidden")))
#endif
extern KmNapiRegistrarNode* km_napi_registrar_head;

namespace {

static int64_t km_napi_arg_i64(const Napi::Value& v) {
    if (v.IsNull() || v.IsUndefined()) return 0;
    if (v.IsString()) {
        std::string s = v.As<Napi::String>().Utf8Value();
        return static_cast<int64_t>(std::strtoll(s.c_str(), nullptr, 10));
    }
    if (v.IsNumber()) return v.As<Napi::Number>().Int64Value();
    return 0;
}

static uint64_t km_napi_arg_u64(const Napi::Value& v) {
    if (v.IsNull() || v.IsUndefined()) return 0;
    if (v.IsString()) {
        std::string s = v.As<Napi::String>().Utf8Value();
        return static_cast<uint64_t>(std::strtoull(s.c_str(), nullptr, 10));
    }
    if (v.IsNumber()) return static_cast<uint64_t>(v.As<Napi::Number>().Int64Value());
    return 0;
}

static Napi::Value libc_unix_bsd_apple_get_MACH_TASK_SELF_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    static uint32_t* km_sym_ptr = nullptr;
#ifdef _WIN32
    if (km_sym_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_sym_ptr = reinterpret_cast<uint32_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mach_task_self_")));
        if (km_sym_ptr == nullptr && km_h_ucrt != nullptr) km_sym_ptr = reinterpret_cast<uint32_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mach_task_self_")));
        if (km_sym_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_sym_ptr = reinterpret_cast<uint32_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mach_task_self_")));
            if (km_sym_ptr == nullptr && km_h_msvcrt != nullptr) km_sym_ptr = reinterpret_cast<uint32_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mach_task_self_")));
        }
    }
#else
    if (km_sym_ptr == nullptr) {
        km_sym_ptr = reinterpret_cast<uint32_t*>(dlsym(RTLD_DEFAULT, "mach_task_self_"));
    }
#endif
    uint32_t km_res = (km_sym_ptr != nullptr) ? *km_sym_ptr : 0;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_set_MACH_TASK_SELF_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t value = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    static uint32_t* km_sym_ptr = nullptr;
#ifdef _WIN32
    if (km_sym_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_sym_ptr = reinterpret_cast<uint32_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mach_task_self_")));
        if (km_sym_ptr == nullptr && km_h_ucrt != nullptr) km_sym_ptr = reinterpret_cast<uint32_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mach_task_self_")));
        if (km_sym_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_sym_ptr = reinterpret_cast<uint32_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mach_task_self_")));
            if (km_sym_ptr == nullptr && km_h_msvcrt != nullptr) km_sym_ptr = reinterpret_cast<uint32_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mach_task_self_")));
        }
    }
#else
    if (km_sym_ptr == nullptr) {
        km_sym_ptr = reinterpret_cast<uint32_t*>(dlsym(RTLD_DEFAULT, "mach_task_self_"));
    }
#endif
    if (km_sym_ptr != nullptr) {
        *km_sym_ptr = value;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_get_VM_PAGE_SIZE_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    static uint64_t* km_sym_ptr = nullptr;
#ifdef _WIN32
    if (km_sym_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_sym_ptr = reinterpret_cast<uint64_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "vm_page_size")));
        if (km_sym_ptr == nullptr && km_h_ucrt != nullptr) km_sym_ptr = reinterpret_cast<uint64_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_vm_page_size")));
        if (km_sym_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_sym_ptr = reinterpret_cast<uint64_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "vm_page_size")));
            if (km_sym_ptr == nullptr && km_h_msvcrt != nullptr) km_sym_ptr = reinterpret_cast<uint64_t*>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_vm_page_size")));
        }
    }
#else
    if (km_sym_ptr == nullptr) {
        km_sym_ptr = reinterpret_cast<uint64_t*>(dlsym(RTLD_DEFAULT, "vm_page_size"));
    }
#endif
    uint64_t km_res = (km_sym_ptr != nullptr) ? *km_sym_ptr : 0;
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_setgrent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setgrent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setgrent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setgrent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setgrent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setgrent"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr();
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_daemon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nochdir = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t noclose = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "daemon")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_daemon")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "daemon")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_daemon")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "daemon"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nochdir, noclose) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_semDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_destroy"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sem) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_semInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pshared = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t value = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_init"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sem, pshared, value) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_aioRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_read")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_read")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_read")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_read")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_read"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(aiocbp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_aioWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_write")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_write")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_write")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_write")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_write"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(aiocbp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_aioFsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t op = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_fsync")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_fsync")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_fsync")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_fsync")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_fsync"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(op, aiocbp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_aioError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_error")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_error")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_error")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_error")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_error"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(aiocbp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_aioReturn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_return")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_return")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_return")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_return")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_return"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(aiocbp) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_aioSuspend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocb_list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nitems = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_suspend")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_suspend")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_suspend")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_suspend")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_suspend"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(aiocb_list, nitems, timeout) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_aioCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_cancel")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_cancel")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_cancel")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_cancel")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_cancel"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, aiocbp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_chflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool path_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "chflags")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_chflags")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "chflags")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_chflags")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "chflags"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fchflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fchflags")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fchflags")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fchflags")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fchflags")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fchflags"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_clockGetres_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t clk_id = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_getres")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_getres")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_getres")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_getres")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_getres"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clk_id, tp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_clockGettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t clk_id = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_gettime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_gettime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_gettime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_gettime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_gettime"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clk_id, tp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_lioListio_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* aiocb_list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nitems = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sevp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "lio_listio")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lio_listio")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "lio_listio")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lio_listio")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "lio_listio"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mode, aiocb_list, nitems, sevp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_dirfd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dirp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "dirfd")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dirfd")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "dirfd")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dirfd")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "dirfd"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dirp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_lutimes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool file_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string file_str = file_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* file = file_null ? nullptr : file_str.c_str();
    void* times = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "lutimes")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lutimes")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "lutimes")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lutimes")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "lutimes"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file, times) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_gettimeofday_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "gettimeofday")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_gettimeofday")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "gettimeofday")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_gettimeofday")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "gettimeofday"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tp, tz) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getutxent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getutxent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getutxent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getutxent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getutxent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getutxent"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_getutxid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ut = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getutxid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getutxid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getutxid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getutxid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getutxid"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ut) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_getutxline_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ut = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getutxline")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getutxline")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getutxline")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getutxline")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getutxline"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ut) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_pututxline_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ut = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pututxline")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pututxline")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pututxline")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pututxline")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pututxline"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ut) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_setutxent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setutxent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setutxent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setutxent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setutxent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setutxent"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr();
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_endutxent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "endutxent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_endutxent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "endutxent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_endutxent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "endutxent"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr();
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_utmpxname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool file_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string file_str = file_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* file = file_null ? nullptr : file_str.c_str();
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "utmpxname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_utmpxname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "utmpxname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_utmpxname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "utmpxname"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_asctime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef char* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "asctime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_asctime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "asctime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_asctime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "asctime"));
    }
#endif
    char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tm) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_ctime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef char* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ctime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ctime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ctime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ctime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ctime"));
    }
#endif
    char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clock) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_getdate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool datestr_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string datestr_str = datestr_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* datestr = datestr_null ? nullptr : datestr_str.c_str();
    typedef void* (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getdate")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getdate")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getdate")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getdate")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getdate"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(datestr) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_strptime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool buf_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string buf_str = buf_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* buf = buf_null ? nullptr : buf_str.c_str();
    bool format_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string format_str = format_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* format = format_null ? nullptr : format_str.c_str();
    void* timeptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef char* (*km_fn_t)(const char*, const char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "strptime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_strptime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "strptime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_strptime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "strptime"));
    }
#endif
    char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buf, format, timeptr) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_asctimeR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* result = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef char* (*km_fn_t)(void*, char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "asctime_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_asctime_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "asctime_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_asctime_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "asctime_r"));
    }
#endif
    char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tm, result) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_ctimeR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* result = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef char* (*km_fn_t)(void*, char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ctime_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ctime_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ctime_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ctime_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ctime_r"));
    }
#endif
    char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clock, result) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_getnameinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t salen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    char* host = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t hostlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    char* serv = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t servlen = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint32_t, char*, uint32_t, char*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getnameinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getnameinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getnameinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getnameinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getnameinfo"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sa, salen, host, hostlen, serv, servlen, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_mincore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    char* vec = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mincore")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mincore")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mincore")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mincore")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mincore"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, len, vec) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_sysctlnametomib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    void* mibp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sizep = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sysctlnametomib")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sysctlnametomib")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sysctlnametomib")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sysctlnametomib")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sysctlnametomib"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, mibp, sizep) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_mprotect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t prot = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mprotect")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mprotect")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mprotect")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mprotect")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mprotect"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, len, prot) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_semget_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t key = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t nsems = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t semflg = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "semget")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_semget")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "semget")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_semget")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "semget"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(key, nsems, semflg) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_semctl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t semid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t semnum = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t cmd = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t km_vac = km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va1 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va2 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    int64_t km_va3 = km_info.Length() > 7 ? km_napi_arg_i64(km_info[7]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "semctl")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_semctl")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "semctl")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_semctl")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "semctl"));
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(semid, semnum, cmd); break;
            case 1: km_res = km_fn_ptr(semid, semnum, cmd, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(semid, semnum, cmd, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(semid, semnum, cmd, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(semid, semnum, cmd, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_semop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t semid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t nsops = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "semop")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_semop")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "semop")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_semop")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "semop"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(semid, sops, nsops) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_shmOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    int32_t oflag = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    typedef int32_t (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "shm_open")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_shm_open")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "shm_open")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_shm_open")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "shm_open"));
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(name, oflag); break;
            case 1: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_ftok_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool pathname_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string pathname_str = pathname_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* pathname = pathname_null ? nullptr : pathname_str.c_str();
    int32_t proj_id = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ftok")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ftok")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ftok")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ftok")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ftok"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pathname, proj_id) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_shmat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t shmid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* shmaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t shmflg = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef void* (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "shmat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_shmat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "shmat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_shmat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "shmat"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(shmid, shmaddr, shmflg) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_shmdt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* shmaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "shmdt")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_shmdt")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "shmdt")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_shmdt")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "shmdt"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(shmaddr) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_shmctl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t shmid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t cmd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "shmctl")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_shmctl")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "shmctl")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_shmctl")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "shmctl"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(shmid, cmd, buf) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_shmget_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t key = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t shmflg = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "shmget")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_shmget")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "shmget")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_shmget")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "shmget"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(key, size, shmflg) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_sysctl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t namelen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* oldp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* oldlenp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* newp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t newlen = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sysctl")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sysctl")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sysctl")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sysctl")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sysctl"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, namelen, oldp, oldlenp, newp, newlen) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_sysctlbyname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    void* oldp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldlenp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* newp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t newlen = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int32_t (*km_fn_t)(const char*, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sysctlbyname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sysctlbyname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sysctlbyname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sysctlbyname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sysctlbyname"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, oldp, oldlenp, newp, newlen) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_machAbsoluteTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef uint64_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mach_absolute_time")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mach_absolute_time")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mach_absolute_time")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mach_absolute_time")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mach_absolute_time"));
    }
#endif
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_machTimebaseInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mach_timebase_info")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mach_timebase_info")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mach_timebase_info")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mach_timebase_info")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mach_timebase_info"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(info) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_machHostSelf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef uint32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mach_host_self")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mach_host_self")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mach_host_self")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mach_host_self")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mach_host_self"));
    }
#endif
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_machThreadSelf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef uint32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mach_thread_self")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mach_thread_self")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mach_thread_self")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mach_thread_self")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mach_thread_self"));
    }
#endif
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cond = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_cond_timedwait_relative_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_cond_timedwait_relative_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_cond_timedwait_relative_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_cond_timedwait_relative_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_cond_timedwait_relative_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cond, lock, timeout) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadAttrGetscope_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* contentionscope = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_getscope")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_getscope")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_getscope")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_getscope")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_getscope"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, contentionscope) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadAttrGetstackaddr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stackaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_getstackaddr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_getstackaddr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_getstackaddr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_getstackaddr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_getstackaddr"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, stackaddr) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadAttrGetdetachstate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* detachstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_getdetachstate")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_getdetachstate")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_getdetachstate")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_getdetachstate")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_getdetachstate"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, detachstate) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadAttrSetscope_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t contentionscope = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_setscope")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_setscope")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_setscope")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_setscope")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_setscope"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, contentionscope) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadAttrSetstackaddr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stackaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_setstackaddr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_setstackaddr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_setstackaddr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_setstackaddr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_setstackaddr"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, stackaddr) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadSetnameNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_setname_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_setname_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_setname_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_setname_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_setname_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadGetnameNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* name = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(void*, char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_getname_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_getname_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_getname_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_getname_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_getname_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, name, len) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadMachThreadNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef uint32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_mach_thread_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_mach_thread_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_mach_thread_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_mach_thread_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_mach_thread_np"));
    }
#endif
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : 0;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadFromMachThreadNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t port = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef void* (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_from_mach_thread_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_from_mach_thread_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_from_mach_thread_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_from_mach_thread_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_from_mach_thread_np"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(port) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_pthreadGetStackaddrNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_get_stackaddr_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_get_stackaddr_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_get_stackaddr_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_get_stackaddr_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_get_stackaddr_np"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_pthreadGetStacksizeNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef uint64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_get_stacksize_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_get_stacksize_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_get_stacksize_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_get_stacksize_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_get_stacksize_np"));
    }
#endif
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : 0;
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_pthreadMainNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_main_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_main_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_main_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_main_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_main_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadThreadidNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* thread_id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_threadid_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_threadid_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_threadid_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_threadid_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_threadid_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, thread_id) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadJitWriteProtectNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t enabled = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef void (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_jit_write_protect_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_jit_write_protect_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_jit_write_protect_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_jit_write_protect_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_jit_write_protect_np"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(enabled);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_jit_write_protect_supported_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_jit_write_protect_supported_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_jit_write_protect_supported_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_jit_write_protect_supported_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_jit_write_protect_supported_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ctx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_jit_write_with_callback_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_jit_write_with_callback_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_jit_write_with_callback_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_jit_write_with_callback_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_jit_write_with_callback_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, ctx) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_jit_write_freeze_callbacks_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_jit_write_freeze_callbacks_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_jit_write_freeze_callbacks_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_jit_write_freeze_callbacks_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_jit_write_freeze_callbacks_np"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr();
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_pthreadCpuNumberNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cpu_number_out = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_cpu_number_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_cpu_number_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_cpu_number_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_cpu_number_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_cpu_number_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cpu_number_out) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_osSyncWaitOnAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t value = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_sync_wait_on_address")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_sync_wait_on_address")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_sync_wait_on_address")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_sync_wait_on_address")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_sync_wait_on_address"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, value, size, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t value = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t clockid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint64_t deadline = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t, uint64_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_sync_wait_on_address_with_deadline")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_sync_wait_on_address_with_deadline")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_sync_wait_on_address_with_deadline")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_sync_wait_on_address_with_deadline")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_sync_wait_on_address_with_deadline"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, value, size, flags, clockid, deadline) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t value = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t clockid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint64_t timeout_ns = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t, uint64_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_sync_wait_on_address_with_timeout")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_sync_wait_on_address_with_timeout")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_sync_wait_on_address_with_timeout")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_sync_wait_on_address_with_timeout")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_sync_wait_on_address_with_timeout"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, value, size, flags, clockid, timeout_ns) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_osSyncWakeByAddressAny_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_sync_wake_by_address_any")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_sync_wake_by_address_any")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_sync_wake_by_address_any")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_sync_wake_by_address_any")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_sync_wake_by_address_any"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, size, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_osSyncWakeByAddressAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_sync_wake_by_address_all")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_sync_wake_by_address_all")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_sync_wake_by_address_all")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_sync_wake_by_address_all")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_sync_wake_by_address_all"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr, size, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_osUnfairLockLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_unfair_lock_lock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_unfair_lock_lock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_unfair_lock_lock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_unfair_lock_lock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_unfair_lock_lock"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(lock);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_osUnfairLockTrylock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef bool (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_unfair_lock_trylock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_unfair_lock_trylock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_unfair_lock_trylock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_unfair_lock_trylock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_unfair_lock_trylock"));
    }
#endif
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lock) : false;
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value libc_unix_bsd_apple_osUnfairLockUnlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_unfair_lock_unlock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_unfair_lock_unlock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_unfair_lock_unlock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_unfair_lock_unlock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_unfair_lock_unlock"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(lock);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_osUnfairLockAssertOwner_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_unfair_lock_assert_owner")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_unfair_lock_assert_owner")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_unfair_lock_assert_owner")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_unfair_lock_assert_owner")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_unfair_lock_assert_owner"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(lock);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_osUnfairLockAssertNotOwner_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_unfair_lock_assert_not_owner")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_unfair_lock_assert_not_owner")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_unfair_lock_assert_not_owner")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_unfair_lock_assert_not_owner")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_unfair_lock_assert_not_owner"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(lock);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_osLogCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool subsystem_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string subsystem_str = subsystem_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* subsystem = subsystem_null ? nullptr : subsystem_str.c_str();
    bool category_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string category_str = category_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* category = category_null ? nullptr : category_str.c_str();
    typedef void* (*km_fn_t)(const char*, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_log_create")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_log_create")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_log_create")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_log_create")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_log_create"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystem, category) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_osLogTypeEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oslog = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t tpe = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef bool (*km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_log_type_enabled")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_log_type_enabled")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_log_type_enabled")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_log_type_enabled")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_log_type_enabled"));
    }
#endif
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oslog, tpe) : false;
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value libc_unix_bsd_apple_osSignpostIdMakeWithPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_log = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef uint64_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_signpost_id_make_with_pointer")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_signpost_id_make_with_pointer")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_signpost_id_make_with_pointer")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_signpost_id_make_with_pointer")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_signpost_id_make_with_pointer"));
    }
#endif
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_log, ptr) : 0;
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_osSignpostIdGenerate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_log = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef uint64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_signpost_id_generate")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_signpost_id_generate")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_signpost_id_generate")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_signpost_id_generate")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_signpost_id_generate"));
    }
#endif
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_log) : 0;
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_osSignpostEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_log = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef bool (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "os_signpost_enabled")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_os_signpost_enabled")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "os_signpost_enabled")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_os_signpost_enabled")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "os_signpost_enabled"));
    }
#endif
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_log) : false;
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value libc_unix_bsd_apple_threadPolicySet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flavor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* policy_info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "thread_policy_set")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_thread_policy_set")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "thread_policy_set")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_thread_policy_set")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "thread_policy_set"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, flavor, policy_info, count) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_threadPolicyGet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flavor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* policy_info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* get_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "thread_policy_get")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_thread_policy_get")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "thread_policy_get")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_thread_policy_get")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "thread_policy_get"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, flavor, policy_info, count, get_default) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_threadInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target_act = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t flavor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* thread_info_out = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* thread_info_outCnt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "thread_info")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_thread_info")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "thread_info")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_thread_info")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "thread_info"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target_act, flavor, thread_info_out, thread_info_outCnt) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_error_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__error")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__error")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__error"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_backtrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sz = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "backtrace")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_backtrace")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "backtrace")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_backtrace")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "backtrace"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buf, sz) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_backtraceSymbols_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addrs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sz = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef void* (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "backtrace_symbols")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_backtrace_symbols")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "backtrace_symbols")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_backtrace_symbols")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "backtrace_symbols"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addrs, sz) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_backtraceSymbolsFd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addrs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sz = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t fd = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef void (*km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "backtrace_symbols_fd")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_backtrace_symbols_fd")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "backtrace_symbols_fd")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_backtrace_symbols_fd")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "backtrace_symbols_fd"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(addrs, sz, fd);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_backtraceFromFp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* startfp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* array = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t size = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "backtrace_from_fp")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_backtrace_from_fp")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "backtrace_from_fp")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_backtrace_from_fp")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "backtrace_from_fp"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(startfp, array, size) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_backtraceImageOffsets_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* array = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image_offsets = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t size = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef void (*km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "backtrace_image_offsets")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_backtrace_image_offsets")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "backtrace_image_offsets")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_backtrace_image_offsets")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "backtrace_image_offsets"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(array, image_offsets, size);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_backtraceAsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* array = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* task_id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef uint64_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "backtrace_async")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_backtrace_async")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "backtrace_async")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_backtrace_async")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "backtrace_async"));
    }
#endif
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(array, length, task_id) : 0;
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_statfs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool path_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "statfs")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_statfs")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "statfs")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_statfs")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "statfs"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, buf) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fstatfs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fstatfs")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fstatfs")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fstatfs")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fstatfs")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fstatfs"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, buf) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_kevent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t kq = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* changelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nchanges = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* eventlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t nevents = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "kevent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_kevent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "kevent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_kevent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "kevent"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(kq, changelist, nchanges, eventlist, nevents, timeout) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_kevent64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t kq = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* changelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nchanges = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* eventlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t nevents = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "kevent64")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_kevent64")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "kevent64")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_kevent64")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "kevent64"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(kq, changelist, nchanges, eventlist, nevents, flags, timeout) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_mount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool src_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string src_str = src_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* src = src_null ? nullptr : src_str.c_str();
    bool target_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string target_str = target_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* target = target_null ? nullptr : target_str.c_str();
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(const char*, const char*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mount")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mount")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mount")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mount")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mount"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(src, target, flags, data) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fmount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool src_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string src_str = src_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* src = src_null ? nullptr : src_str.c_str();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(const char*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fmount")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fmount")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fmount")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fmount")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fmount"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(src, fd, flags, data) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_ptrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t request = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t pid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    char* addr = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t data = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ptrace")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ptrace")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ptrace")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ptrace")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ptrace"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(request, pid, addr, data) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_quotactl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool special_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string special_str = special_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* special = special_null ? nullptr : special_str.c_str();
    int32_t cmd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t id = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    char* data = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(const char*, int32_t, int32_t, char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "quotactl")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_quotactl")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "quotactl")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_quotactl")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "quotactl"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(special, cmd, id, data) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_sethostname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    int32_t len = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sethostname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sethostname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sethostname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sethostname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sethostname"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, len) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_sendfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t s = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t offset = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* len = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* hdtr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sendfile")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sendfile")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sendfile")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sendfile")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sendfile"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, s, offset, len, hdtr, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_futimens_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* times = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "futimens")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_futimens")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "futimens")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_futimens")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "futimens"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, times) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_utimensat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool path_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* times = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t flag = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "utimensat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_utimensat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "utimensat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_utimensat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "utimensat"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dirfd, path, times, flag) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_openpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* amaster = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* aslave = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    char* name = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* termp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* winp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, char*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "openpty")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_openpty")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "openpty")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_openpty")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "openpty"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(amaster, aslave, name, termp, winp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_forkpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* amaster = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* name = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* termp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* winp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, char*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "forkpty")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_forkpty")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "forkpty")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_forkpty")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "forkpty"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(amaster, name, termp, winp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_loginTty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "login_tty")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_login_tty")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "login_tty")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_login_tty")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "login_tty"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_duplocale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "duplocale")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_duplocale")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "duplocale")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_duplocale")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "duplocale"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(base) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_freelocale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "freelocale")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_freelocale")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "freelocale")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_freelocale")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "freelocale"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loc) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_localeconvL_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "localeconv_l")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_localeconv_l")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "localeconv_l")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_localeconv_l")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "localeconv_l"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loc) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_newlocale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mask = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool locale_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string locale_str = locale_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* locale = locale_null ? nullptr : locale_str.c_str();
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef void* (*km_fn_t)(int32_t, const char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "newlocale")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_newlocale")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "newlocale")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_newlocale")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "newlocale"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mask, locale, base) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_uselocale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "uselocale")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_uselocale")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "uselocale")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_uselocale")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "uselocale"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loc) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_querylocale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mask = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* loc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef const char* (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "querylocale")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_querylocale")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "querylocale")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_querylocale")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "querylocale"));
    }
#endif
    const char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mask, loc) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_getpriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t which = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t who = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getpriority")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getpriority")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getpriority")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getpriority")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getpriority"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(which, who) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_setpriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t which = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t who = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t prio = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setpriority")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setpriority")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setpriority")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setpriority")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setpriority"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(which, who, prio) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getdomainname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* name = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getdomainname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getdomainname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getdomainname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getdomainname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getdomainname"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, len) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_setdomainname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    int32_t len = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setdomainname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setdomainname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setdomainname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setdomainname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setdomainname"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, len) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_preadv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* iov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t iovcnt = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t offset = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "preadv")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_preadv")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "preadv")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_preadv")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "preadv"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, iov, iovcnt, offset) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_pwritev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* iov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t iovcnt = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t offset = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pwritev")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pwritev")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pwritev")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pwritev")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pwritev"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, iov, iovcnt, offset) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_getxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool path_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    bool name_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t position = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(const char*, const char*, void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getxattr"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, name, value, size, position, flags) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_fgetxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t filedes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool name_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t position = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(int32_t, const char*, void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fgetxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fgetxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fgetxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fgetxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fgetxattr"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filedes, name, value, size, position, flags) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_setxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool path_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    bool name_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t position = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, const char*, void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setxattr"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, name, value, size, position, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fsetxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t filedes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool name_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t position = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fsetxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fsetxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fsetxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fsetxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fsetxattr"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filedes, name, value, size, position, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_listxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool path_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    char* list = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(const char*, char*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "listxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_listxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "listxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_listxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "listxattr"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, list, size, flags) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_flistxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t filedes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    char* list = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(int32_t, char*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "flistxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_flistxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "flistxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_flistxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "flistxattr"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filedes, list, size, flags) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_removexattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool path_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    bool name_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "removexattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_removexattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "removexattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_removexattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "removexattr"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, name, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_renamexNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool from_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string from_str = from_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* from = from_null ? nullptr : from_str.c_str();
    bool to_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string to_str = to_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* to = to_null ? nullptr : to_str.c_str();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, const char*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "renamex_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_renamex_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "renamex_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_renamex_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "renamex_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(from, to, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_renameatxNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fromfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool from_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string from_str = from_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* from = from_null ? nullptr : from_str.c_str();
    int32_t tofd = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool to_null = (km_info.Length() <= 3 || km_info[3].IsNull() || km_info[3].IsUndefined());
    std::string to_str = to_null ? std::string() : km_info[3].ToString().Utf8Value();
    const char* to = to_null ? nullptr : to_str.c_str();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "renameatx_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_renameatx_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "renameatx_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_renameatx_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "renameatx_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fromfd, from, tofd, to, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fremovexattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t filedes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool name_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fremovexattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fremovexattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fremovexattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fremovexattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fremovexattr"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filedes, name, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getgrouplist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    int32_t basegid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* groups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ngroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(const char*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getgrouplist")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getgrouplist")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getgrouplist")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getgrouplist")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getgrouplist"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, basegid, groups, ngroups) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_initgroups_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool user_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string user_str = user_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* user = user_null ? nullptr : user_str.c_str();
    int32_t basegroup = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "initgroups")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_initgroups")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "initgroups")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_initgroups")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "initgroups"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(user, basegroup) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_waitid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t idtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* infop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t options = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "waitid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_waitid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "waitid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_waitid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "waitid"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(idtype, id, infop, options) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_brk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "brk")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_brk")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "brk")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_brk")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "brk"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(addr) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_sbrk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t increment = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef void* (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sbrk")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sbrk")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sbrk")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sbrk")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sbrk"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(increment) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_settimeofday_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "settimeofday")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_settimeofday")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "settimeofday")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_settimeofday")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "settimeofday"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tv, tz) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_dyldImageCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef uint32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dyld_image_count")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dyld_image_count")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_dyld_image_count"));
    }
#endif
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_dyldGetImageHeader_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t image_index = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef void* (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dyld_get_image_header")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dyld_get_image_header")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_dyld_get_image_header"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image_index) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_dyldGetImageVmaddrSlide_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t image_index = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dyld_get_image_vmaddr_slide")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dyld_get_image_vmaddr_slide")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_dyld_get_image_vmaddr_slide"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image_index) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_dyldGetImageName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t image_index = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef const char* (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dyld_get_image_name")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dyld_get_image_name")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_dyld_get_image_name"));
    }
#endif
    const char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image_index) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_posixSpawn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool path_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* file_actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* attrp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* argv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* envp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(void*, const char*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, path, file_actions, attrp, argv, envp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool file_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string file_str = file_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* file = file_null ? nullptr : file_str.c_str();
    void* file_actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* attrp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* argv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* envp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(void*, const char*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnp")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnp")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnp")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnp")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnp"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, file, file_actions, attrp, argv, envp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_init"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_destroy"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrGetsigdefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getsigdefault")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getsigdefault")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getsigdefault")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getsigdefault")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getsigdefault"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, arg_1_default) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrSetsigdefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setsigdefault")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setsigdefault")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setsigdefault")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setsigdefault")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setsigdefault"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, arg_1_default) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrGetsigmask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getsigmask")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getsigmask")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getsigmask")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getsigmask")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getsigmask"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, arg_1_default) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrSetsigmask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setsigmask")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setsigmask")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setsigmask")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setsigmask")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setsigmask"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, arg_1_default) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrGetflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getflags")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getflags")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getflags")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getflags")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getflags"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrSetflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t flags = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setflags")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setflags")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setflags")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setflags")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setflags"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrGetpgroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getpgroup")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getpgroup")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getpgroup")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getpgroup")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getpgroup"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrSetpgroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setpgroup")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setpgroup")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setpgroup")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setpgroup")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setpgroup"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrSetarchprefNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t count = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pref = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* subpref = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ocount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setarchpref_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setarchpref_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setarchpref_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setarchpref_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setarchpref_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, count, pref, subpref, ocount) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrGetarchprefNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t count = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pref = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* subpref = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ocount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getarchpref_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getarchpref_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getarchpref_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getarchpref_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getarchpref_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, count, pref, subpref, ocount) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrGetbinprefNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t count = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pref = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ocount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getbinpref_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getbinpref_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getbinpref_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getbinpref_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getbinpref_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, count, pref, ocount) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnattrSetbinprefNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t count = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pref = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ocount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setbinpref_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setbinpref_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setbinpref_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setbinpref_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setbinpref_np"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(attr, count, pref, ocount) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnFileActionsInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_init"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(actions) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnFileActionsDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_destroy"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(actions) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnFileActionsAddopen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool path_null = (km_info.Length() <= 2 || km_info[2].IsNull() || km_info[2].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[2].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    int32_t oflag = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint16_t mode = static_cast<uint16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t, const char*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_addopen")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_addopen")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_addopen")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_addopen")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_addopen"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(actions, fd, path, oflag, mode) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnFileActionsAddclose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_addclose")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_addclose")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_addclose")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_addclose")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_addclose"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(actions, fd) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_posixSpawnFileActionsAdddup2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t newfd = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_adddup2")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_adddup2")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_adddup2")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_adddup2")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_adddup2"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(actions, fd, newfd) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_uname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "uname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_uname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "uname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_uname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "uname"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buf) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_connectx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_socket = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* endpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t associd = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* iov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t iovcnt = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* len = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* connid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "connectx")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_connectx")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "connectx")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_connectx")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "connectx"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_socket, endpoints, associd, flags, iov, iovcnt, len, connid) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_disconnectx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_socket = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t associd = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t connid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "disconnectx")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_disconnectx")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "disconnectx")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_disconnectx")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "disconnectx"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_socket, associd, connid) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_ntpAdjtime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ntp_adjtime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ntp_adjtime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ntp_adjtime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ntp_adjtime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ntp_adjtime"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buf) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_ntpGettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ntp_gettime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ntp_gettime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ntp_gettime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ntp_gettime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ntp_gettime"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buf) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getmntinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mntbufp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getmntinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getmntinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getmntinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getmntinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getmntinfo"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mntbufp, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getfsstat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mntbufp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bufsize = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getfsstat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getfsstat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getfsstat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getfsstat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getfsstat"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mntbufp, bufsize, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_clonefile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool src_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string src_str = src_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* src = src_null ? nullptr : src_str.c_str();
    bool dst_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string dst_str = dst_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* dst = dst_null ? nullptr : dst_str.c_str();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, const char*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clonefile")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clonefile")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clonefile")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clonefile")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clonefile"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(src, dst, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_clonefileat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t src_dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool src_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string src_str = src_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* src = src_null ? nullptr : src_str.c_str();
    int32_t dst_dirfd = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool dst_null = (km_info.Length() <= 3 || km_info[3].IsNull() || km_info[3].IsUndefined());
    std::string dst_str = dst_null ? std::string() : km_info[3].ToString().Utf8Value();
    const char* dst = dst_null ? nullptr : dst_str.c_str();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clonefileat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clonefileat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clonefileat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clonefileat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clonefileat"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(src_dirfd, src, dst_dirfd, dst, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fclonefileat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t srcfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t dst_dirfd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool dst_null = (km_info.Length() <= 2 || km_info[2].IsNull() || km_info[2].IsUndefined());
    std::string dst_str = dst_null ? std::string() : km_info[2].ToString().Utf8Value();
    const char* dst = dst_null ? nullptr : dst_str.c_str();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fclonefileat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fclonefileat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fclonefileat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fclonefileat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fclonefileat"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(srcfd, dst_dirfd, dst, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_copyfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool from_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string from_str = from_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* from = from_null ? nullptr : from_str.c_str();
    bool to_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string to_str = to_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* to = to_null ? nullptr : to_str.c_str();
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, const char*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "copyfile")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_copyfile")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "copyfile")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_copyfile")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "copyfile"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(from, to, state, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fcopyfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t from = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t to = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fcopyfile")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fcopyfile")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fcopyfile")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fcopyfile")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fcopyfile"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(from, to, state, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_copyfileStateFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "copyfile_state_free")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_copyfile_state_free")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "copyfile_state_free")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_copyfile_state_free")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "copyfile_state_free"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_copyfileStateAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "copyfile_state_alloc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_copyfile_state_alloc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "copyfile_state_alloc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_copyfile_state_alloc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "copyfile_state_alloc"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_copyfileStateGet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* dst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "copyfile_state_get")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_copyfile_state_get")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "copyfile_state_get")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_copyfile_state_get")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "copyfile_state_get"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, flags, dst) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_copyfileStateSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* src = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "copyfile_state_set")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_copyfile_state_set")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "copyfile_state_set")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_copyfile_state_set")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "copyfile_state_set"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, flags, src) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_machErrorString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t error_value = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef char* (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mach_error_string")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mach_error_string")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mach_error_string")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mach_error_string")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mach_error_string"));
    }
#endif
    char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(error_value) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_memsetS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t smax = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t c = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t n = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "memset_s")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_memset_s")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "memset_s")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_memset_s")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "memset_s"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(s, smax, c, n) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_memsetPattern4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* b = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pattern4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef void (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "memset_pattern4")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_memset_pattern4")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "memset_pattern4")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_memset_pattern4")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "memset_pattern4"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(b, pattern4, len);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_memsetPattern8_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* b = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pattern8 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef void (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "memset_pattern8")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_memset_pattern8")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "memset_pattern8")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_memset_pattern8")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "memset_pattern8"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(b, pattern8, len);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_memsetPattern16_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* b = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pattern16 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef void (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "memset_pattern16")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_memset_pattern16")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "memset_pattern16")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_memset_pattern16")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "memset_pattern16"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(b, pattern16, len);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_strtonum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool arg_0_numstr_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string arg_0_numstr_str = arg_0_numstr_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* arg_0_numstr = arg_0_numstr_null ? nullptr : arg_0_numstr_str.c_str();
    int64_t arg_1_minval = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t arg_2_maxval = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* errstrp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int64_t (*km_fn_t)(const char*, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "strtonum")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_strtonum")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "strtonum")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_strtonum")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "strtonum"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_numstr, arg_1_minval, arg_2_maxval, errstrp) : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_mallocPrintf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool format_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string format_str = format_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* format = format_null ? nullptr : format_str.c_str();
    int32_t km_vac = km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t km_va1 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va2 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va3 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    typedef void (*km_fn_t)(const char*, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_printf")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_printf")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_printf")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_printf")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_printf"));
    }
#endif
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_fn_ptr(format); break;
            case 1: km_fn_ptr(format, static_cast<intptr_t>(km_va0)); break;
            case 2: km_fn_ptr(format, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_fn_ptr(format, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_fn_ptr(format, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_mallocZoneCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_check")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_check")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_check")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_check")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_check"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(zone) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_mallocZonePrint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t verbose = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef void (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_print")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_print")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_print")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_print")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_print"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(zone, verbose);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_mallocZoneStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef void (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_statistics")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_statistics")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_statistics")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_statistics")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_statistics"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(zone, stats);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_mallocZoneLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef void (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_log")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_log")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_log")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_log")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_log"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(zone, address);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_mallocZonePrintPtrInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_print_ptr_info")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_print_ptr_info")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_print_ptr_info")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_print_ptr_info")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_print_ptr_info"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(ptr);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_mallocDefaultZone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_default_zone")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_default_zone")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_default_zone")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_default_zone")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_default_zone"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_mallocZoneFromPtr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_from_ptr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_from_ptr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_from_ptr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_from_ptr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_from_ptr"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptr) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_mallocZoneMalloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef void* (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_malloc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_malloc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_malloc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_malloc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_malloc"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(zone, size) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_mallocZoneValloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef void* (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_valloc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_valloc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_valloc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_valloc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_valloc"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(zone, size) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_mallocZoneCalloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t num_items = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef void* (*km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_calloc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_calloc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_calloc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_calloc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_calloc"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(zone, num_items, size) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_mallocZoneRealloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef void* (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_realloc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_realloc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_realloc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_realloc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_realloc"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(zone, ptr, size) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_mallocZoneFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* zone = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef void (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_zone_free")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_zone_free")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_zone_free")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_zone_free")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_zone_free"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(zone, ptr);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_procListpids_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t t = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t typeinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t buffersize = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_listpids")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_listpids")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_listpids")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_listpids")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_listpids"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(t, typeinfo, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procListallpids_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t buffersize = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_listallpids")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_listallpids")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_listallpids")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_listallpids")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_listallpids"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procListpgrppids_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pgrpid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t buffersize = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_listpgrppids")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_listpgrppids")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_listpgrppids")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_listpgrppids")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_listpgrppids"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pgrpid, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procListchildpids_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t ppid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t buffersize = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_listchildpids")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_listchildpids")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_listchildpids")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_listchildpids")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_listchildpids"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppid, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procPidinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flavor = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t arg = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t buffersize = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_pidinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_pidinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_pidinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_pidinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_pidinfo"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, flavor, arg, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procPidfdinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t flavor = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t buffersize = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_pidfdinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_pidfdinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_pidfdinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_pidfdinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_pidfdinfo"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, fd, flavor, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procPidfileportinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t fileport = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t flavor = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t buffersize = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_pidfileportinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_pidfileportinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_pidfileportinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_pidfileportinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_pidfileportinfo"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, fileport, flavor, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procPidpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_pidpath")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_pidpath")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_pidpath")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_pidpath")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_pidpath"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_name")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_name")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_name")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_name")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_name"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procRegionfilename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_regionfilename")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_regionfilename")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_regionfilename")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_regionfilename")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_regionfilename"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, address, buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procKmsgbuf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_kmsgbuf")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_kmsgbuf")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_kmsgbuf")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_kmsgbuf")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_kmsgbuf"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer, buffersize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procLibversion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* major = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* minor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_libversion")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_libversion")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_libversion")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_libversion")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_libversion"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(major, minor) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procPidRusage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flavor = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_pid_rusage")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_pid_rusage")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_pid_rusage")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_pid_rusage")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_pid_rusage"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pid, flavor, buffer) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procSetNoSmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_set_no_smt")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_set_no_smt")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_set_no_smt")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_set_no_smt")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_set_no_smt"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procSetthreadNoSmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_setthread_no_smt")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_setthread_no_smt")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_setthread_no_smt")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_setthread_no_smt")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_setthread_no_smt"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procSetCsm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_set_csm")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_set_csm")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_set_csm")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_set_csm")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_set_csm"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_procSetthreadCsm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "proc_setthread_csm")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_proc_setthread_csm")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "proc_setthread_csm")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_proc_setthread_csm")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "proc_setthread_csm"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_gethostuuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "gethostuuid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_gethostuuid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "gethostuuid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_gethostuuid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "gethostuuid"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, timeout) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_gethostid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int64_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "gethostid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_gethostid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "gethostid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_gethostid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "gethostid"));
    }
#endif
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_sethostid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hostid = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    typedef void (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sethostid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sethostid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sethostid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sethostid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sethostid"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(hostid);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_cCRandomGenerateBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "CCRandomGenerateBytes")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_CCRandomGenerateBytes")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "CCRandomGenerateBytes")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_CCRandomGenerateBytes")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "CCRandomGenerateBytes"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bytes, size) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getentropy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t buflen = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getentropy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getentropy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getentropy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getentropy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getentropy"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buf, buflen) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_nsgetExecutablePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bufsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_NSGetExecutablePath")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_NSGetExecutablePath")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_NSGetExecutablePath"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buf, bufsize) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_nsgetArgv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_NSGetArgv")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_NSGetArgv")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_NSGetArgv"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_nsgetArgc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_NSGetArgc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_NSGetArgc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_NSGetArgc"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_nsgetEnviron_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_NSGetEnviron")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_NSGetEnviron")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_NSGetEnviron"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_nsgetProgname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_NSGetProgname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_NSGetProgname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_NSGetProgname"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_machVmMap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* target_task = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t mask = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t object = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint64_t offset = km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0;
    int32_t copy = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t cur_protection = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    int32_t max_protection = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    uint32_t inheritance = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, void*, uint64_t, uint64_t, int32_t, uint32_t, uint64_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mach_vm_map")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mach_vm_map")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mach_vm_map")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mach_vm_map")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mach_vm_map"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target_task, address, size, mask, flags, object, offset, copy, cur_protection, max_protection, inheritance) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_vmAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* target_task = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "vm_allocate")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_vm_allocate")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "vm_allocate")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_vm_allocate")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "vm_allocate"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target_task, address, size, flags) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_vmDeallocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* target_task = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t address = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "vm_deallocate")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_vm_deallocate")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "vm_deallocate")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_vm_deallocate")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "vm_deallocate"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target_task, address, size) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_hostStatistics64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t host_priv = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flavor = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* host_info64_out = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* host_info64_outCnt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "host_statistics64")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_host_statistics64")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "host_statistics64")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_host_statistics64")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "host_statistics64"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(host_priv, flavor, host_info64_out, host_info64_outCnt) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_hostProcessorInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t host = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flavor = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* out_processor_count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* out_processor_info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* out_processor_infoCnt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "host_processor_info")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_host_processor_info")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "host_processor_info")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_host_processor_info")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "host_processor_info"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(host, flavor, out_processor_count, out_processor_info, out_processor_infoCnt) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_taskForPid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t host = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t pid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* task = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "task_for_pid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_task_for_pid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "task_for_pid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_task_for_pid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "task_for_pid"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(host, pid, task) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_taskInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t host = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t flavor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* task_info_out = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* task_info_count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "task_info")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_task_info")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "task_info")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_task_info")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "task_info"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(host, flavor, task_info_out, task_info_count) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_taskCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target_task = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ledgers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ledgersCnt = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t inherit_memory = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* child_task = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "task_create")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_task_create")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "task_create")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_task_create")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "task_create"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target_task, ledgers, ledgersCnt, inherit_memory, child_task) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_taskTerminate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target_task = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "task_terminate")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_task_terminate")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "task_terminate")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_task_terminate")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "task_terminate"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target_task) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_taskThreads_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target_task = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* act_list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* act_listCnt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "task_threads")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_task_threads")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "task_threads")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_task_threads")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "task_threads"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target_task, act_list, act_listCnt) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_hostStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t host_priv = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flavor = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* host_info_out = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* host_info_outCnt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "host_statistics")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_host_statistics")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "host_statistics")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_host_statistics")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "host_statistics"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(host_priv, flavor, host_info_out, host_info_outCnt) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t state = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    char* path = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef uint32_t (*km_fn_t)(uint32_t, char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sysdir_get_next_search_path_enumeration")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sysdir_get_next_search_path_enumeration")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sysdir_get_next_search_path_enumeration")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sysdir_get_next_search_path_enumeration")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sysdir_get_next_search_path_enumeration"));
    }
#endif
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(state, path) : 0;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getattrlist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool path_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* attrList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* attrBuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t attrBufSize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getattrlist")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getattrlist")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getattrlist")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getattrlist")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getattrlist"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, attrList, attrBuf, attrBufSize, options) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fgetattrlist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* attrList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* attrBuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t attrBufSize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fgetattrlist")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fgetattrlist")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fgetattrlist")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fgetattrlist")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fgetattrlist"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, attrList, attrBuf, attrBufSize, options) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getattrlistat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool path_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* attrList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* attrBuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t attrBufSize = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint64_t options = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, const char*, void*, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getattrlistat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getattrlistat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getattrlistat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getattrlistat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getattrlistat"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, path, attrList, attrBuf, attrBufSize, options) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_setattrlist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool path_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* attrList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* attrBuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t attrBufSize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setattrlist")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setattrlist")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setattrlist")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setattrlist")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setattrlist"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, attrList, attrBuf, attrBufSize, options) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_fsetattrlist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* attrList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* attrBuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t attrBufSize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fsetattrlist")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fsetattrlist")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fsetattrlist")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fsetattrlist")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fsetattrlist"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, attrList, attrBuf, attrBufSize, options) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_setattrlistat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dir_fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool path_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* attrList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* attrBuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t attrBufSize = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setattrlistat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setattrlistat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setattrlistat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setattrlistat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setattrlistat"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dir_fd, path, attrList, attrBuf, attrBufSize, options) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_getattrlistbulk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* attrList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* attrBuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t attrBufSize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t options = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, void*, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getattrlistbulk")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getattrlistbulk")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getattrlistbulk")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getattrlistbulk")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getattrlistbulk"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dirfd, attrList, attrBuf, attrBufSize, options) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_mallocSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef uint64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_size")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_size")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_size")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_size")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_size"));
    }
#endif
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptr) : 0;
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_mallocGoodSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    typedef uint64_t (*km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "malloc_good_size")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_malloc_good_size")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "malloc_good_size")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_malloc_good_size")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "malloc_good_size"));
    }
#endif
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size) : 0;
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_dirname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* path = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "dirname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dirname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "dirname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dirname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "dirname"));
    }
#endif
    char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_basename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* path = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "basename")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_basename")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "basename")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_basename")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "basename"));
    }
#endif
    char* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_mkfifoat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool pathname_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string pathname_str = pathname_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* pathname = pathname_null ? nullptr : pathname_str.c_str();
    uint16_t mode = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mkfifoat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mkfifoat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mkfifoat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mkfifoat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mkfifoat"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dirfd, pathname, mode) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_mknodat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool pathname_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string pathname_str = pathname_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* pathname = pathname_null ? nullptr : pathname_str.c_str();
    uint16_t mode = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t dev = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mknodat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mknodat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mknodat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mknodat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mknodat"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dirfd, pathname, mode, dev) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_freadlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "freadlink")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_freadlink")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "freadlink")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_freadlink")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "freadlink"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fd, buf, size) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_execvP_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool file_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string file_str = file_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* file = file_null ? nullptr : file_str.c_str();
    bool search_path_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string search_path_str = search_path_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* search_path = search_path_null ? nullptr : search_path_str.c_str();
    void* argv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(const char*, const char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "execvP")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_execvP")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "execvP")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_execvP")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "execvP"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file, search_path, argv) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_qsortR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t num = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* arg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* compar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef void (*km_fn_t)(void*, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "qsort_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_qsort_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "qsort_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_qsort_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "qsort_r"));
    }
#endif
    if (km_fn_ptr != nullptr) km_fn_ptr(base, num, size, arg, compar);
    return km_env.Undefined();
}

static Napi::Value libc_unix_bsd_apple_clockSettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t clock_id = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_settime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_settime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_settime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_settime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_settime"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clock_id, tp) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_memmem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* haystack = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t haystacklen = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* needle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t needlelen = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef void* (*km_fn_t)(void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "memmem")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_memmem")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "memmem")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_memmem")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "memmem"));
    }
#endif
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(haystack, haystacklen, needle, needlelen) : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_taskSetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target_task = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t flavor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* task_info_in = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t task_info_inCnt = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "task_set_info")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_task_set_info")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "task_set_info")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_task_set_info")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "task_set_info"));
    }
#endif
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target_task, flavor, task_info_in, task_info_inCnt) : -1;
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_bsd_apple_iconvOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool tocode_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string tocode_str = tocode_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* tocode = tocode_null ? nullptr : tocode_str.c_str();
    bool fromcode_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string fromcode_str = fromcode_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* fromcode = fromcode_null ? nullptr : fromcode_str.c_str();
    typedef void* (*km_fn_t)(const char*, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "iconv_open")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_iconv_open")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "iconv_open")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_iconv_open")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "iconv_open"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_iconv = nullptr;
            if (km_h_iconv == nullptr) km_h_iconv = dlopen("/usr/lib/libiconv.dylib", RTLD_LAZY | RTLD_LOCAL);
            if (km_h_iconv != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_iconv, "iconv_open"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tocode, fromcode);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_bsd_apple_iconv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* inbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* inbytesleft = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* outbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* outbytesleft = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef uint64_t (*km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "iconv")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_iconv")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "iconv")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_iconv")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "iconv"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_iconv = nullptr;
            if (km_h_iconv == nullptr) km_h_iconv = dlopen("/usr/lib/libiconv.dylib", RTLD_LAZY | RTLD_LOCAL);
            if (km_h_iconv != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_iconv, "iconv"));
        }
#endif
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cd, inbuf, inbytesleft, outbuf, outbytesleft);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_bsd_apple_iconvClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "iconv_close")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_iconv_close")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "iconv_close")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_iconv_close")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "iconv_close"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_iconv = nullptr;
            if (km_h_iconv == nullptr) km_h_iconv = dlopen("/usr/lib/libiconv.dylib", RTLD_LAZY | RTLD_LOCAL);
            if (km_h_iconv != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_iconv, "iconv_close"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_unix_bsd_apple_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("libc_unix_bsd_apple_get_MACH_TASK_SELF", Napi::Function::New(env, libc_unix_bsd_apple_get_MACH_TASK_SELF_napi));
    exports.Set("libc_unix_bsd_apple_set_MACH_TASK_SELF", Napi::Function::New(env, libc_unix_bsd_apple_set_MACH_TASK_SELF_napi));
    exports.Set("libc_unix_bsd_apple_get_VM_PAGE_SIZE", Napi::Function::New(env, libc_unix_bsd_apple_get_VM_PAGE_SIZE_napi));
    exports.Set("libc_unix_bsd_apple_setgrent", Napi::Function::New(env, libc_unix_bsd_apple_setgrent_napi));
    exports.Set("libc_unix_bsd_apple_daemon", Napi::Function::New(env, libc_unix_bsd_apple_daemon_napi));
    exports.Set("libc_unix_bsd_apple_semDestroy", Napi::Function::New(env, libc_unix_bsd_apple_semDestroy_napi));
    exports.Set("libc_unix_bsd_apple_semInit", Napi::Function::New(env, libc_unix_bsd_apple_semInit_napi));
    exports.Set("libc_unix_bsd_apple_aioRead", Napi::Function::New(env, libc_unix_bsd_apple_aioRead_napi));
    exports.Set("libc_unix_bsd_apple_aioWrite", Napi::Function::New(env, libc_unix_bsd_apple_aioWrite_napi));
    exports.Set("libc_unix_bsd_apple_aioFsync", Napi::Function::New(env, libc_unix_bsd_apple_aioFsync_napi));
    exports.Set("libc_unix_bsd_apple_aioError", Napi::Function::New(env, libc_unix_bsd_apple_aioError_napi));
    exports.Set("libc_unix_bsd_apple_aioReturn", Napi::Function::New(env, libc_unix_bsd_apple_aioReturn_napi));
    exports.Set("libc_unix_bsd_apple_aioSuspend", Napi::Function::New(env, libc_unix_bsd_apple_aioSuspend_napi));
    exports.Set("libc_unix_bsd_apple_aioCancel", Napi::Function::New(env, libc_unix_bsd_apple_aioCancel_napi));
    exports.Set("libc_unix_bsd_apple_chflags", Napi::Function::New(env, libc_unix_bsd_apple_chflags_napi));
    exports.Set("libc_unix_bsd_apple_fchflags", Napi::Function::New(env, libc_unix_bsd_apple_fchflags_napi));
    exports.Set("libc_unix_bsd_apple_clockGetres", Napi::Function::New(env, libc_unix_bsd_apple_clockGetres_napi));
    exports.Set("libc_unix_bsd_apple_clockGettime", Napi::Function::New(env, libc_unix_bsd_apple_clockGettime_napi));
    exports.Set("libc_unix_bsd_apple_lioListio", Napi::Function::New(env, libc_unix_bsd_apple_lioListio_napi));
    exports.Set("libc_unix_bsd_apple_dirfd", Napi::Function::New(env, libc_unix_bsd_apple_dirfd_napi));
    exports.Set("libc_unix_bsd_apple_lutimes", Napi::Function::New(env, libc_unix_bsd_apple_lutimes_napi));
    exports.Set("libc_unix_bsd_apple_gettimeofday", Napi::Function::New(env, libc_unix_bsd_apple_gettimeofday_napi));
    exports.Set("libc_unix_bsd_apple_getutxent", Napi::Function::New(env, libc_unix_bsd_apple_getutxent_napi));
    exports.Set("libc_unix_bsd_apple_getutxid", Napi::Function::New(env, libc_unix_bsd_apple_getutxid_napi));
    exports.Set("libc_unix_bsd_apple_getutxline", Napi::Function::New(env, libc_unix_bsd_apple_getutxline_napi));
    exports.Set("libc_unix_bsd_apple_pututxline", Napi::Function::New(env, libc_unix_bsd_apple_pututxline_napi));
    exports.Set("libc_unix_bsd_apple_setutxent", Napi::Function::New(env, libc_unix_bsd_apple_setutxent_napi));
    exports.Set("libc_unix_bsd_apple_endutxent", Napi::Function::New(env, libc_unix_bsd_apple_endutxent_napi));
    exports.Set("libc_unix_bsd_apple_utmpxname", Napi::Function::New(env, libc_unix_bsd_apple_utmpxname_napi));
    exports.Set("libc_unix_bsd_apple_asctime", Napi::Function::New(env, libc_unix_bsd_apple_asctime_napi));
    exports.Set("libc_unix_bsd_apple_ctime", Napi::Function::New(env, libc_unix_bsd_apple_ctime_napi));
    exports.Set("libc_unix_bsd_apple_getdate", Napi::Function::New(env, libc_unix_bsd_apple_getdate_napi));
    exports.Set("libc_unix_bsd_apple_strptime", Napi::Function::New(env, libc_unix_bsd_apple_strptime_napi));
    exports.Set("libc_unix_bsd_apple_asctimeR", Napi::Function::New(env, libc_unix_bsd_apple_asctimeR_napi));
    exports.Set("libc_unix_bsd_apple_ctimeR", Napi::Function::New(env, libc_unix_bsd_apple_ctimeR_napi));
    exports.Set("libc_unix_bsd_apple_getnameinfo", Napi::Function::New(env, libc_unix_bsd_apple_getnameinfo_napi));
    exports.Set("libc_unix_bsd_apple_mincore", Napi::Function::New(env, libc_unix_bsd_apple_mincore_napi));
    exports.Set("libc_unix_bsd_apple_sysctlnametomib", Napi::Function::New(env, libc_unix_bsd_apple_sysctlnametomib_napi));
    exports.Set("libc_unix_bsd_apple_mprotect", Napi::Function::New(env, libc_unix_bsd_apple_mprotect_napi));
    exports.Set("libc_unix_bsd_apple_semget", Napi::Function::New(env, libc_unix_bsd_apple_semget_napi));
    exports.Set("libc_unix_bsd_apple_semctl", Napi::Function::New(env, libc_unix_bsd_apple_semctl_napi));
    exports.Set("libc_unix_bsd_apple_semop", Napi::Function::New(env, libc_unix_bsd_apple_semop_napi));
    exports.Set("libc_unix_bsd_apple_shmOpen", Napi::Function::New(env, libc_unix_bsd_apple_shmOpen_napi));
    exports.Set("libc_unix_bsd_apple_ftok", Napi::Function::New(env, libc_unix_bsd_apple_ftok_napi));
    exports.Set("libc_unix_bsd_apple_shmat", Napi::Function::New(env, libc_unix_bsd_apple_shmat_napi));
    exports.Set("libc_unix_bsd_apple_shmdt", Napi::Function::New(env, libc_unix_bsd_apple_shmdt_napi));
    exports.Set("libc_unix_bsd_apple_shmctl", Napi::Function::New(env, libc_unix_bsd_apple_shmctl_napi));
    exports.Set("libc_unix_bsd_apple_shmget", Napi::Function::New(env, libc_unix_bsd_apple_shmget_napi));
    exports.Set("libc_unix_bsd_apple_sysctl", Napi::Function::New(env, libc_unix_bsd_apple_sysctl_napi));
    exports.Set("libc_unix_bsd_apple_sysctlbyname", Napi::Function::New(env, libc_unix_bsd_apple_sysctlbyname_napi));
    exports.Set("libc_unix_bsd_apple_machAbsoluteTime", Napi::Function::New(env, libc_unix_bsd_apple_machAbsoluteTime_napi));
    exports.Set("libc_unix_bsd_apple_machTimebaseInfo", Napi::Function::New(env, libc_unix_bsd_apple_machTimebaseInfo_napi));
    exports.Set("libc_unix_bsd_apple_machHostSelf", Napi::Function::New(env, libc_unix_bsd_apple_machHostSelf_napi));
    exports.Set("libc_unix_bsd_apple_machThreadSelf", Napi::Function::New(env, libc_unix_bsd_apple_machThreadSelf_napi));
    exports.Set("libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadAttrGetscope", Napi::Function::New(env, libc_unix_bsd_apple_pthreadAttrGetscope_napi));
    exports.Set("libc_unix_bsd_apple_pthreadAttrGetstackaddr", Napi::Function::New(env, libc_unix_bsd_apple_pthreadAttrGetstackaddr_napi));
    exports.Set("libc_unix_bsd_apple_pthreadAttrGetdetachstate", Napi::Function::New(env, libc_unix_bsd_apple_pthreadAttrGetdetachstate_napi));
    exports.Set("libc_unix_bsd_apple_pthreadAttrSetscope", Napi::Function::New(env, libc_unix_bsd_apple_pthreadAttrSetscope_napi));
    exports.Set("libc_unix_bsd_apple_pthreadAttrSetstackaddr", Napi::Function::New(env, libc_unix_bsd_apple_pthreadAttrSetstackaddr_napi));
    exports.Set("libc_unix_bsd_apple_pthreadSetnameNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadSetnameNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadGetnameNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadGetnameNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadMachThreadNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadMachThreadNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadFromMachThreadNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadFromMachThreadNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadGetStackaddrNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadGetStackaddrNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadGetStacksizeNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadGetStacksizeNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadMainNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadMainNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadThreadidNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadThreadidNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadJitWriteProtectNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadJitWriteProtectNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp_napi));
    exports.Set("libc_unix_bsd_apple_pthreadCpuNumberNp", Napi::Function::New(env, libc_unix_bsd_apple_pthreadCpuNumberNp_napi));
    exports.Set("libc_unix_bsd_apple_osSyncWaitOnAddress", Napi::Function::New(env, libc_unix_bsd_apple_osSyncWaitOnAddress_napi));
    exports.Set("libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline", Napi::Function::New(env, libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline_napi));
    exports.Set("libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout", Napi::Function::New(env, libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout_napi));
    exports.Set("libc_unix_bsd_apple_osSyncWakeByAddressAny", Napi::Function::New(env, libc_unix_bsd_apple_osSyncWakeByAddressAny_napi));
    exports.Set("libc_unix_bsd_apple_osSyncWakeByAddressAll", Napi::Function::New(env, libc_unix_bsd_apple_osSyncWakeByAddressAll_napi));
    exports.Set("libc_unix_bsd_apple_osUnfairLockLock", Napi::Function::New(env, libc_unix_bsd_apple_osUnfairLockLock_napi));
    exports.Set("libc_unix_bsd_apple_osUnfairLockTrylock", Napi::Function::New(env, libc_unix_bsd_apple_osUnfairLockTrylock_napi));
    exports.Set("libc_unix_bsd_apple_osUnfairLockUnlock", Napi::Function::New(env, libc_unix_bsd_apple_osUnfairLockUnlock_napi));
    exports.Set("libc_unix_bsd_apple_osUnfairLockAssertOwner", Napi::Function::New(env, libc_unix_bsd_apple_osUnfairLockAssertOwner_napi));
    exports.Set("libc_unix_bsd_apple_osUnfairLockAssertNotOwner", Napi::Function::New(env, libc_unix_bsd_apple_osUnfairLockAssertNotOwner_napi));
    exports.Set("libc_unix_bsd_apple_osLogCreate", Napi::Function::New(env, libc_unix_bsd_apple_osLogCreate_napi));
    exports.Set("libc_unix_bsd_apple_osLogTypeEnabled", Napi::Function::New(env, libc_unix_bsd_apple_osLogTypeEnabled_napi));
    exports.Set("libc_unix_bsd_apple_osSignpostIdMakeWithPointer", Napi::Function::New(env, libc_unix_bsd_apple_osSignpostIdMakeWithPointer_napi));
    exports.Set("libc_unix_bsd_apple_osSignpostIdGenerate", Napi::Function::New(env, libc_unix_bsd_apple_osSignpostIdGenerate_napi));
    exports.Set("libc_unix_bsd_apple_osSignpostEnabled", Napi::Function::New(env, libc_unix_bsd_apple_osSignpostEnabled_napi));
    exports.Set("libc_unix_bsd_apple_threadPolicySet", Napi::Function::New(env, libc_unix_bsd_apple_threadPolicySet_napi));
    exports.Set("libc_unix_bsd_apple_threadPolicyGet", Napi::Function::New(env, libc_unix_bsd_apple_threadPolicyGet_napi));
    exports.Set("libc_unix_bsd_apple_threadInfo", Napi::Function::New(env, libc_unix_bsd_apple_threadInfo_napi));
    exports.Set("libc_unix_bsd_apple_error", Napi::Function::New(env, libc_unix_bsd_apple_error_napi));
    exports.Set("libc_unix_bsd_apple_backtrace", Napi::Function::New(env, libc_unix_bsd_apple_backtrace_napi));
    exports.Set("libc_unix_bsd_apple_backtraceSymbols", Napi::Function::New(env, libc_unix_bsd_apple_backtraceSymbols_napi));
    exports.Set("libc_unix_bsd_apple_backtraceSymbolsFd", Napi::Function::New(env, libc_unix_bsd_apple_backtraceSymbolsFd_napi));
    exports.Set("libc_unix_bsd_apple_backtraceFromFp", Napi::Function::New(env, libc_unix_bsd_apple_backtraceFromFp_napi));
    exports.Set("libc_unix_bsd_apple_backtraceImageOffsets", Napi::Function::New(env, libc_unix_bsd_apple_backtraceImageOffsets_napi));
    exports.Set("libc_unix_bsd_apple_backtraceAsync", Napi::Function::New(env, libc_unix_bsd_apple_backtraceAsync_napi));
    exports.Set("libc_unix_bsd_apple_statfs", Napi::Function::New(env, libc_unix_bsd_apple_statfs_napi));
    exports.Set("libc_unix_bsd_apple_fstatfs", Napi::Function::New(env, libc_unix_bsd_apple_fstatfs_napi));
    exports.Set("libc_unix_bsd_apple_kevent", Napi::Function::New(env, libc_unix_bsd_apple_kevent_napi));
    exports.Set("libc_unix_bsd_apple_kevent64", Napi::Function::New(env, libc_unix_bsd_apple_kevent64_napi));
    exports.Set("libc_unix_bsd_apple_mount", Napi::Function::New(env, libc_unix_bsd_apple_mount_napi));
    exports.Set("libc_unix_bsd_apple_fmount", Napi::Function::New(env, libc_unix_bsd_apple_fmount_napi));
    exports.Set("libc_unix_bsd_apple_ptrace", Napi::Function::New(env, libc_unix_bsd_apple_ptrace_napi));
    exports.Set("libc_unix_bsd_apple_quotactl", Napi::Function::New(env, libc_unix_bsd_apple_quotactl_napi));
    exports.Set("libc_unix_bsd_apple_sethostname", Napi::Function::New(env, libc_unix_bsd_apple_sethostname_napi));
    exports.Set("libc_unix_bsd_apple_sendfile", Napi::Function::New(env, libc_unix_bsd_apple_sendfile_napi));
    exports.Set("libc_unix_bsd_apple_futimens", Napi::Function::New(env, libc_unix_bsd_apple_futimens_napi));
    exports.Set("libc_unix_bsd_apple_utimensat", Napi::Function::New(env, libc_unix_bsd_apple_utimensat_napi));
    exports.Set("libc_unix_bsd_apple_openpty", Napi::Function::New(env, libc_unix_bsd_apple_openpty_napi));
    exports.Set("libc_unix_bsd_apple_forkpty", Napi::Function::New(env, libc_unix_bsd_apple_forkpty_napi));
    exports.Set("libc_unix_bsd_apple_loginTty", Napi::Function::New(env, libc_unix_bsd_apple_loginTty_napi));
    exports.Set("libc_unix_bsd_apple_duplocale", Napi::Function::New(env, libc_unix_bsd_apple_duplocale_napi));
    exports.Set("libc_unix_bsd_apple_freelocale", Napi::Function::New(env, libc_unix_bsd_apple_freelocale_napi));
    exports.Set("libc_unix_bsd_apple_localeconvL", Napi::Function::New(env, libc_unix_bsd_apple_localeconvL_napi));
    exports.Set("libc_unix_bsd_apple_newlocale", Napi::Function::New(env, libc_unix_bsd_apple_newlocale_napi));
    exports.Set("libc_unix_bsd_apple_uselocale", Napi::Function::New(env, libc_unix_bsd_apple_uselocale_napi));
    exports.Set("libc_unix_bsd_apple_querylocale", Napi::Function::New(env, libc_unix_bsd_apple_querylocale_napi));
    exports.Set("libc_unix_bsd_apple_getpriority", Napi::Function::New(env, libc_unix_bsd_apple_getpriority_napi));
    exports.Set("libc_unix_bsd_apple_setpriority", Napi::Function::New(env, libc_unix_bsd_apple_setpriority_napi));
    exports.Set("libc_unix_bsd_apple_getdomainname", Napi::Function::New(env, libc_unix_bsd_apple_getdomainname_napi));
    exports.Set("libc_unix_bsd_apple_setdomainname", Napi::Function::New(env, libc_unix_bsd_apple_setdomainname_napi));
    exports.Set("libc_unix_bsd_apple_preadv", Napi::Function::New(env, libc_unix_bsd_apple_preadv_napi));
    exports.Set("libc_unix_bsd_apple_pwritev", Napi::Function::New(env, libc_unix_bsd_apple_pwritev_napi));
    exports.Set("libc_unix_bsd_apple_getxattr", Napi::Function::New(env, libc_unix_bsd_apple_getxattr_napi));
    exports.Set("libc_unix_bsd_apple_fgetxattr", Napi::Function::New(env, libc_unix_bsd_apple_fgetxattr_napi));
    exports.Set("libc_unix_bsd_apple_setxattr", Napi::Function::New(env, libc_unix_bsd_apple_setxattr_napi));
    exports.Set("libc_unix_bsd_apple_fsetxattr", Napi::Function::New(env, libc_unix_bsd_apple_fsetxattr_napi));
    exports.Set("libc_unix_bsd_apple_listxattr", Napi::Function::New(env, libc_unix_bsd_apple_listxattr_napi));
    exports.Set("libc_unix_bsd_apple_flistxattr", Napi::Function::New(env, libc_unix_bsd_apple_flistxattr_napi));
    exports.Set("libc_unix_bsd_apple_removexattr", Napi::Function::New(env, libc_unix_bsd_apple_removexattr_napi));
    exports.Set("libc_unix_bsd_apple_renamexNp", Napi::Function::New(env, libc_unix_bsd_apple_renamexNp_napi));
    exports.Set("libc_unix_bsd_apple_renameatxNp", Napi::Function::New(env, libc_unix_bsd_apple_renameatxNp_napi));
    exports.Set("libc_unix_bsd_apple_fremovexattr", Napi::Function::New(env, libc_unix_bsd_apple_fremovexattr_napi));
    exports.Set("libc_unix_bsd_apple_getgrouplist", Napi::Function::New(env, libc_unix_bsd_apple_getgrouplist_napi));
    exports.Set("libc_unix_bsd_apple_initgroups", Napi::Function::New(env, libc_unix_bsd_apple_initgroups_napi));
    exports.Set("libc_unix_bsd_apple_waitid", Napi::Function::New(env, libc_unix_bsd_apple_waitid_napi));
    exports.Set("libc_unix_bsd_apple_brk", Napi::Function::New(env, libc_unix_bsd_apple_brk_napi));
    exports.Set("libc_unix_bsd_apple_sbrk", Napi::Function::New(env, libc_unix_bsd_apple_sbrk_napi));
    exports.Set("libc_unix_bsd_apple_settimeofday", Napi::Function::New(env, libc_unix_bsd_apple_settimeofday_napi));
    exports.Set("libc_unix_bsd_apple_dyldImageCount", Napi::Function::New(env, libc_unix_bsd_apple_dyldImageCount_napi));
    exports.Set("libc_unix_bsd_apple_dyldGetImageHeader", Napi::Function::New(env, libc_unix_bsd_apple_dyldGetImageHeader_napi));
    exports.Set("libc_unix_bsd_apple_dyldGetImageVmaddrSlide", Napi::Function::New(env, libc_unix_bsd_apple_dyldGetImageVmaddrSlide_napi));
    exports.Set("libc_unix_bsd_apple_dyldGetImageName", Napi::Function::New(env, libc_unix_bsd_apple_dyldGetImageName_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawn", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawn_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnp", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnp_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrInit", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrInit_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrDestroy", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrDestroy_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrGetsigdefault", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrGetsigdefault_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrSetsigdefault", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrSetsigdefault_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrGetsigmask", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrGetsigmask_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrSetsigmask", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrSetsigmask_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrGetflags", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrGetflags_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrSetflags", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrSetflags_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrGetpgroup", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrGetpgroup_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrSetpgroup", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrSetpgroup_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrSetarchprefNp", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrSetarchprefNp_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrGetarchprefNp", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrGetarchprefNp_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrGetbinprefNp", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrGetbinprefNp_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnattrSetbinprefNp", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnattrSetbinprefNp_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnFileActionsInit", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnFileActionsInit_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnFileActionsDestroy", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnFileActionsDestroy_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnFileActionsAddopen", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnFileActionsAddopen_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnFileActionsAddclose", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnFileActionsAddclose_napi));
    exports.Set("libc_unix_bsd_apple_posixSpawnFileActionsAdddup2", Napi::Function::New(env, libc_unix_bsd_apple_posixSpawnFileActionsAdddup2_napi));
    exports.Set("libc_unix_bsd_apple_uname", Napi::Function::New(env, libc_unix_bsd_apple_uname_napi));
    exports.Set("libc_unix_bsd_apple_connectx", Napi::Function::New(env, libc_unix_bsd_apple_connectx_napi));
    exports.Set("libc_unix_bsd_apple_disconnectx", Napi::Function::New(env, libc_unix_bsd_apple_disconnectx_napi));
    exports.Set("libc_unix_bsd_apple_ntpAdjtime", Napi::Function::New(env, libc_unix_bsd_apple_ntpAdjtime_napi));
    exports.Set("libc_unix_bsd_apple_ntpGettime", Napi::Function::New(env, libc_unix_bsd_apple_ntpGettime_napi));
    exports.Set("libc_unix_bsd_apple_getmntinfo", Napi::Function::New(env, libc_unix_bsd_apple_getmntinfo_napi));
    exports.Set("libc_unix_bsd_apple_getfsstat", Napi::Function::New(env, libc_unix_bsd_apple_getfsstat_napi));
    exports.Set("libc_unix_bsd_apple_clonefile", Napi::Function::New(env, libc_unix_bsd_apple_clonefile_napi));
    exports.Set("libc_unix_bsd_apple_clonefileat", Napi::Function::New(env, libc_unix_bsd_apple_clonefileat_napi));
    exports.Set("libc_unix_bsd_apple_fclonefileat", Napi::Function::New(env, libc_unix_bsd_apple_fclonefileat_napi));
    exports.Set("libc_unix_bsd_apple_copyfile", Napi::Function::New(env, libc_unix_bsd_apple_copyfile_napi));
    exports.Set("libc_unix_bsd_apple_fcopyfile", Napi::Function::New(env, libc_unix_bsd_apple_fcopyfile_napi));
    exports.Set("libc_unix_bsd_apple_copyfileStateFree", Napi::Function::New(env, libc_unix_bsd_apple_copyfileStateFree_napi));
    exports.Set("libc_unix_bsd_apple_copyfileStateAlloc", Napi::Function::New(env, libc_unix_bsd_apple_copyfileStateAlloc_napi));
    exports.Set("libc_unix_bsd_apple_copyfileStateGet", Napi::Function::New(env, libc_unix_bsd_apple_copyfileStateGet_napi));
    exports.Set("libc_unix_bsd_apple_copyfileStateSet", Napi::Function::New(env, libc_unix_bsd_apple_copyfileStateSet_napi));
    exports.Set("libc_unix_bsd_apple_machErrorString", Napi::Function::New(env, libc_unix_bsd_apple_machErrorString_napi));
    exports.Set("libc_unix_bsd_apple_memsetS", Napi::Function::New(env, libc_unix_bsd_apple_memsetS_napi));
    exports.Set("libc_unix_bsd_apple_memsetPattern4", Napi::Function::New(env, libc_unix_bsd_apple_memsetPattern4_napi));
    exports.Set("libc_unix_bsd_apple_memsetPattern8", Napi::Function::New(env, libc_unix_bsd_apple_memsetPattern8_napi));
    exports.Set("libc_unix_bsd_apple_memsetPattern16", Napi::Function::New(env, libc_unix_bsd_apple_memsetPattern16_napi));
    exports.Set("libc_unix_bsd_apple_strtonum", Napi::Function::New(env, libc_unix_bsd_apple_strtonum_napi));
    exports.Set("libc_unix_bsd_apple_mallocPrintf", Napi::Function::New(env, libc_unix_bsd_apple_mallocPrintf_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneCheck", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneCheck_napi));
    exports.Set("libc_unix_bsd_apple_mallocZonePrint", Napi::Function::New(env, libc_unix_bsd_apple_mallocZonePrint_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneStatistics", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneStatistics_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneLog", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneLog_napi));
    exports.Set("libc_unix_bsd_apple_mallocZonePrintPtrInfo", Napi::Function::New(env, libc_unix_bsd_apple_mallocZonePrintPtrInfo_napi));
    exports.Set("libc_unix_bsd_apple_mallocDefaultZone", Napi::Function::New(env, libc_unix_bsd_apple_mallocDefaultZone_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneFromPtr", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneFromPtr_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneMalloc", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneMalloc_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneValloc", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneValloc_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneCalloc", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneCalloc_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneRealloc", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneRealloc_napi));
    exports.Set("libc_unix_bsd_apple_mallocZoneFree", Napi::Function::New(env, libc_unix_bsd_apple_mallocZoneFree_napi));
    exports.Set("libc_unix_bsd_apple_procListpids", Napi::Function::New(env, libc_unix_bsd_apple_procListpids_napi));
    exports.Set("libc_unix_bsd_apple_procListallpids", Napi::Function::New(env, libc_unix_bsd_apple_procListallpids_napi));
    exports.Set("libc_unix_bsd_apple_procListpgrppids", Napi::Function::New(env, libc_unix_bsd_apple_procListpgrppids_napi));
    exports.Set("libc_unix_bsd_apple_procListchildpids", Napi::Function::New(env, libc_unix_bsd_apple_procListchildpids_napi));
    exports.Set("libc_unix_bsd_apple_procPidinfo", Napi::Function::New(env, libc_unix_bsd_apple_procPidinfo_napi));
    exports.Set("libc_unix_bsd_apple_procPidfdinfo", Napi::Function::New(env, libc_unix_bsd_apple_procPidfdinfo_napi));
    exports.Set("libc_unix_bsd_apple_procPidfileportinfo", Napi::Function::New(env, libc_unix_bsd_apple_procPidfileportinfo_napi));
    exports.Set("libc_unix_bsd_apple_procPidpath", Napi::Function::New(env, libc_unix_bsd_apple_procPidpath_napi));
    exports.Set("libc_unix_bsd_apple_procName", Napi::Function::New(env, libc_unix_bsd_apple_procName_napi));
    exports.Set("libc_unix_bsd_apple_procRegionfilename", Napi::Function::New(env, libc_unix_bsd_apple_procRegionfilename_napi));
    exports.Set("libc_unix_bsd_apple_procKmsgbuf", Napi::Function::New(env, libc_unix_bsd_apple_procKmsgbuf_napi));
    exports.Set("libc_unix_bsd_apple_procLibversion", Napi::Function::New(env, libc_unix_bsd_apple_procLibversion_napi));
    exports.Set("libc_unix_bsd_apple_procPidRusage", Napi::Function::New(env, libc_unix_bsd_apple_procPidRusage_napi));
    exports.Set("libc_unix_bsd_apple_procSetNoSmt", Napi::Function::New(env, libc_unix_bsd_apple_procSetNoSmt_napi));
    exports.Set("libc_unix_bsd_apple_procSetthreadNoSmt", Napi::Function::New(env, libc_unix_bsd_apple_procSetthreadNoSmt_napi));
    exports.Set("libc_unix_bsd_apple_procSetCsm", Napi::Function::New(env, libc_unix_bsd_apple_procSetCsm_napi));
    exports.Set("libc_unix_bsd_apple_procSetthreadCsm", Napi::Function::New(env, libc_unix_bsd_apple_procSetthreadCsm_napi));
    exports.Set("libc_unix_bsd_apple_gethostuuid", Napi::Function::New(env, libc_unix_bsd_apple_gethostuuid_napi));
    exports.Set("libc_unix_bsd_apple_gethostid", Napi::Function::New(env, libc_unix_bsd_apple_gethostid_napi));
    exports.Set("libc_unix_bsd_apple_sethostid", Napi::Function::New(env, libc_unix_bsd_apple_sethostid_napi));
    exports.Set("libc_unix_bsd_apple_cCRandomGenerateBytes", Napi::Function::New(env, libc_unix_bsd_apple_cCRandomGenerateBytes_napi));
    exports.Set("libc_unix_bsd_apple_getentropy", Napi::Function::New(env, libc_unix_bsd_apple_getentropy_napi));
    exports.Set("libc_unix_bsd_apple_nsgetExecutablePath", Napi::Function::New(env, libc_unix_bsd_apple_nsgetExecutablePath_napi));
    exports.Set("libc_unix_bsd_apple_nsgetArgv", Napi::Function::New(env, libc_unix_bsd_apple_nsgetArgv_napi));
    exports.Set("libc_unix_bsd_apple_nsgetArgc", Napi::Function::New(env, libc_unix_bsd_apple_nsgetArgc_napi));
    exports.Set("libc_unix_bsd_apple_nsgetEnviron", Napi::Function::New(env, libc_unix_bsd_apple_nsgetEnviron_napi));
    exports.Set("libc_unix_bsd_apple_nsgetProgname", Napi::Function::New(env, libc_unix_bsd_apple_nsgetProgname_napi));
    exports.Set("libc_unix_bsd_apple_machVmMap", Napi::Function::New(env, libc_unix_bsd_apple_machVmMap_napi));
    exports.Set("libc_unix_bsd_apple_vmAllocate", Napi::Function::New(env, libc_unix_bsd_apple_vmAllocate_napi));
    exports.Set("libc_unix_bsd_apple_vmDeallocate", Napi::Function::New(env, libc_unix_bsd_apple_vmDeallocate_napi));
    exports.Set("libc_unix_bsd_apple_hostStatistics64", Napi::Function::New(env, libc_unix_bsd_apple_hostStatistics64_napi));
    exports.Set("libc_unix_bsd_apple_hostProcessorInfo", Napi::Function::New(env, libc_unix_bsd_apple_hostProcessorInfo_napi));
    exports.Set("libc_unix_bsd_apple_taskForPid", Napi::Function::New(env, libc_unix_bsd_apple_taskForPid_napi));
    exports.Set("libc_unix_bsd_apple_taskInfo", Napi::Function::New(env, libc_unix_bsd_apple_taskInfo_napi));
    exports.Set("libc_unix_bsd_apple_taskCreate", Napi::Function::New(env, libc_unix_bsd_apple_taskCreate_napi));
    exports.Set("libc_unix_bsd_apple_taskTerminate", Napi::Function::New(env, libc_unix_bsd_apple_taskTerminate_napi));
    exports.Set("libc_unix_bsd_apple_taskThreads", Napi::Function::New(env, libc_unix_bsd_apple_taskThreads_napi));
    exports.Set("libc_unix_bsd_apple_hostStatistics", Napi::Function::New(env, libc_unix_bsd_apple_hostStatistics_napi));
    exports.Set("libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration", Napi::Function::New(env, libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration_napi));
    exports.Set("libc_unix_bsd_apple_getattrlist", Napi::Function::New(env, libc_unix_bsd_apple_getattrlist_napi));
    exports.Set("libc_unix_bsd_apple_fgetattrlist", Napi::Function::New(env, libc_unix_bsd_apple_fgetattrlist_napi));
    exports.Set("libc_unix_bsd_apple_getattrlistat", Napi::Function::New(env, libc_unix_bsd_apple_getattrlistat_napi));
    exports.Set("libc_unix_bsd_apple_setattrlist", Napi::Function::New(env, libc_unix_bsd_apple_setattrlist_napi));
    exports.Set("libc_unix_bsd_apple_fsetattrlist", Napi::Function::New(env, libc_unix_bsd_apple_fsetattrlist_napi));
    exports.Set("libc_unix_bsd_apple_setattrlistat", Napi::Function::New(env, libc_unix_bsd_apple_setattrlistat_napi));
    exports.Set("libc_unix_bsd_apple_getattrlistbulk", Napi::Function::New(env, libc_unix_bsd_apple_getattrlistbulk_napi));
    exports.Set("libc_unix_bsd_apple_mallocSize", Napi::Function::New(env, libc_unix_bsd_apple_mallocSize_napi));
    exports.Set("libc_unix_bsd_apple_mallocGoodSize", Napi::Function::New(env, libc_unix_bsd_apple_mallocGoodSize_napi));
    exports.Set("libc_unix_bsd_apple_dirname", Napi::Function::New(env, libc_unix_bsd_apple_dirname_napi));
    exports.Set("libc_unix_bsd_apple_basename", Napi::Function::New(env, libc_unix_bsd_apple_basename_napi));
    exports.Set("libc_unix_bsd_apple_mkfifoat", Napi::Function::New(env, libc_unix_bsd_apple_mkfifoat_napi));
    exports.Set("libc_unix_bsd_apple_mknodat", Napi::Function::New(env, libc_unix_bsd_apple_mknodat_napi));
    exports.Set("libc_unix_bsd_apple_freadlink", Napi::Function::New(env, libc_unix_bsd_apple_freadlink_napi));
    exports.Set("libc_unix_bsd_apple_execvP", Napi::Function::New(env, libc_unix_bsd_apple_execvP_napi));
    exports.Set("libc_unix_bsd_apple_qsortR", Napi::Function::New(env, libc_unix_bsd_apple_qsortR_napi));
    exports.Set("libc_unix_bsd_apple_clockSettime", Napi::Function::New(env, libc_unix_bsd_apple_clockSettime_napi));
    exports.Set("libc_unix_bsd_apple_memmem", Napi::Function::New(env, libc_unix_bsd_apple_memmem_napi));
    exports.Set("libc_unix_bsd_apple_taskSetInfo", Napi::Function::New(env, libc_unix_bsd_apple_taskSetInfo_napi));
    exports.Set("libc_unix_bsd_apple_iconvOpen", Napi::Function::New(env, libc_unix_bsd_apple_iconvOpen_napi));
    exports.Set("libc_unix_bsd_apple_iconv", Napi::Function::New(env, libc_unix_bsd_apple_iconv_napi));
    exports.Set("libc_unix_bsd_apple_iconvClose", Napi::Function::New(env, libc_unix_bsd_apple_iconvClose_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_unix_bsd_apple_napi, nullptr };
struct KmNapiAutoRegister {
    KmNapiAutoRegister() {
        registrar_node.next = km_napi_registrar_head;
        km_napi_registrar_head = &registrar_node;
    }
};
static KmNapiAutoRegister auto_register_instance;

} // namespace

#ifdef KM_NAPI_STANDALONE_MODULE
#if defined(__GNUC__) || defined(__clang__)
__attribute__((visibility("hidden")))
#endif
KmNapiRegistrarNode* km_napi_registrar_head = nullptr;
static Napi::Object KmNapiStandaloneInit(Napi::Env env, Napi::Object exports) {
    for (KmNapiRegistrarNode* cur = km_napi_registrar_head; cur != nullptr; cur = cur->next) {
        cur->register_fn(env, exports);
    }
    return exports;
}
NODE_API_MODULE(NODE_GYP_MODULE_NAME, KmNapiStandaloneInit)
#endif
