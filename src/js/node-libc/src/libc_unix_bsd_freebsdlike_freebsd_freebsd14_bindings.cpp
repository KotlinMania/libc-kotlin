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

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addr, len, prot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(loc);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t msqid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* msgp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgsz = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int64_t msgtyp = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int32_t msgflg = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "msgrcv")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_msgrcv")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "msgrcv")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_msgrcv")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "msgrcv"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(msqid, msgp, msgsz, msgtyp, msgflg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t level = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t which = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t id = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint64_t setsize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "cpuset_getdomain")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_getdomain")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "cpuset_getdomain")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_getdomain")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "cpuset_getdomain"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(level, which, id, setsize, mask, policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t level = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t which = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t id = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint64_t setsize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t policy = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int64_t, uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "cpuset_setdomain")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_setdomain")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "cpuset_setdomain")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_setdomain")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "cpuset_setdomain"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(level, which, id, setsize, mask, policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname_napi(const Napi::CallbackInfo& km_info) {
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
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename_napi(const Napi::CallbackInfo& km_info) {
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
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* base = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t num = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* compar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* arg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(base, num, size, compar, arg);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* kd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "kvm_kerndisp")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_kvm_kerndisp")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "kvm_kerndisp")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_kvm_kerndisp")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "kvm_kerndisp"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_kvm = nullptr;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("/usr/lib/libkvm.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_kvm, "kvm_kerndisp"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_kvm = nullptr;
            static bool km_h_kvm_init = false;
            if (!km_h_kvm_init) {
                km_h_kvm_init = true;
                km_h_kvm = dlopen("libkvm.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_kvm != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_kvm, "kvm_kerndisp"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(kd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static void register_unix_bsd_freebsdlike_freebsd_freebsd14_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR_napi));
    exports.Set("libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp", Napi::Function::New(env, libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_unix_bsd_freebsdlike_freebsd_freebsd14_napi, nullptr };
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
