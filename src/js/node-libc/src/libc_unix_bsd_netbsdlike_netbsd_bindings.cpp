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

static Napi::Value libcUnixBsdNetbsdlikeNetbsdClockNanosleep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clkId = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rqtp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rmtp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_nanosleep")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_nanosleep")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_nanosleep")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_nanosleep")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_nanosleep"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clkId, flags, rqtp, rmtp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdReallocarr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t number = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "reallocarr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_reallocarr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "reallocarr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_reallocarr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "reallocarr"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ptr, number, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdChflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t flags = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(const char*, uint64_t);
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdFchflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint64_t flags = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, uint64_t);
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLchflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t flags = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(const char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "lchflags")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lchflags")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "lchflags")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lchflags")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "lchflags"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrListFd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t nbytes = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(int32_t, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_list_fd")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_list_fd")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_list_fd")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_list_fd")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_list_fd"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, attrnamespace, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrListFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t nbytes = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(const char*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_list_file")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_list_file")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_list_file")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_list_file")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_list_file"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, attrnamespace, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrListLink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t nbytes = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(const char*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_list_link")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_list_link")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_list_link")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_list_link")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_list_link"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, attrnamespace, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_delete_fd")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_delete_fd")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_delete_fd")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_delete_fd")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_delete_fd"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, attrnamespace, attrname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(const char*, int32_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_delete_file")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_delete_file")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_delete_file")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_delete_file")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_delete_file"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, attrnamespace, attrname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(const char*, int32_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_delete_link")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_delete_link")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_delete_link")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_delete_link")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_delete_link"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, attrnamespace, attrname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrGetFd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t nbytes = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int64_t (*km_fn_t)(int32_t, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_get_fd")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_get_fd")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_get_fd")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_get_fd")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_get_fd"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, attrnamespace, attrname, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrGetFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t nbytes = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int64_t (*km_fn_t)(const char*, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_get_file")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_get_file")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_get_file")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_get_file")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_get_file"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, attrnamespace, attrname, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrGetLink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t nbytes = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int64_t (*km_fn_t)(const char*, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_get_link")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_get_link")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_get_link")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_get_link")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_get_link"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, attrnamespace, attrname, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_namespace_to_string")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_namespace_to_string")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_namespace_to_string")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_namespace_to_string")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_namespace_to_string"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attrnamespace, string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrSetFd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t nbytes = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_set_fd")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_set_fd")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_set_fd")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_set_fd")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_set_fd"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, attrnamespace, attrname, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrSetFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t nbytes = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int32_t (*km_fn_t)(const char*, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_set_file")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_set_file")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_set_file")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_set_file")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_set_file"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, attrnamespace, attrname, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrSetLink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attrnamespace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* attrname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t nbytes = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int32_t (*km_fn_t)(const char*, int32_t, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_set_link")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_set_link")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_set_link")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_set_link")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_set_link"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, attrnamespace, attrname, data, nbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* string = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* attrnamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "extattr_string_to_namespace")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_extattr_string_to_namespace")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "extattr_string_to_namespace")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_extattr_string_to_namespace")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "extattr_string_to_namespace"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(string, attrnamespace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdOpenpty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(amaster, aslave, name, termp, winp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdForkpty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(amaster, name, termp, winp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPtsnameR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buflen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ptsname_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ptsname_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ptsname_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ptsname_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ptsname_r"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, buf, buflen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLutimes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* file = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* times = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__lutimes50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__lutimes50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__lutimes50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(file, times);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGettimeofday_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__gettimeofday50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__gettimeofday50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__gettimeofday50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tp, tz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetnameinfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sa, salen, host, hostlen, serv, servlen, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMprotect_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSysctl_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, namelen, oldp, oldlenp, newp, newlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSysctlbyname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, oldp, oldlenp, newp, newlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSysctlnametomib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* sname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* namelenp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sname, name, namelenp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdKevent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t kq = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* changelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t nchanges = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* eventlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t nevents = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__kevent50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__kevent50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__kevent50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(kq, changelist, nchanges, eventlist, nevents, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* src = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* target = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t size = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int32_t (*km_fn_t)(const char*, const char*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__mount50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__mount50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__mount50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(src, target, flags, data, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t oflag = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    typedef void* (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_open")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_open")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_open")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_open")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_open"));
    }
#endif
    void* km_res = nullptr;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(name, oflag); break;
            case 1: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    } else {
        errno = ENOSYS;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_close")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_close")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_close")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_close")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_close"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mqd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqGetattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_getattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_getattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_getattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_getattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_getattr"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mqd, attr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* notification = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_notify")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_notify")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_notify")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_notify")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_notify"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mqd, notification);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* msgPtr = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgLen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* msgPrio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int64_t (*km_fn_t)(void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_receive")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_receive")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_receive")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_receive")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_receive"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mqd, msgPtr, msgLen, msgPrio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqSend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* msgPtr = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgLen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t msgPrio = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_send")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_send")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_send")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_send")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_send"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mqd, msgPtr, msgLen, msgPrio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqSetattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_setattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_setattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_setattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_setattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_setattr"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mqd, newattr, oldattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqTimedreceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* msgPtr = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgLen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* msgPrio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* absTimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int64_t (*km_fn_t)(void*, char*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__mq_timedreceive50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__mq_timedreceive50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__mq_timedreceive50"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mqd, msgPtr, msgLen, msgPrio, absTimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqTimedsend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* msgPtr = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgLen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t msgPrio = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* absTimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__mq_timedsend50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__mq_timedsend50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__mq_timedsend50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mqd, msgPtr, msgLen, msgPrio, absTimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMqUnlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_unlink")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_unlink")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_unlink")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_unlink")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_unlink"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPtrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t request = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t pid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t data = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, int32_t);
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(request, pid, addr, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdUtrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* label = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "utrace")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_utrace")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "utrace")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_utrace")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "utrace"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(label, addr, len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* t = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(t, name, len);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* t = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* arg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, const char*, void*);
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(t, name, arg);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_get_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_get_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_get_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_get_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_get_np"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, attr);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* native = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_getattr_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_getattr_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_getattr_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_getattr_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_getattr_np"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(native, attr);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* guardsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_getguardsize")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_getguardsize")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_getguardsize")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_getguardsize")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_getguardsize"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, guardsize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t guardsize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_setguardsize")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_setguardsize")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_setguardsize")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_setguardsize")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_setguardsize"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, guardsize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stackaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* stacksize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_getstack")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_getstack")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_getstack")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_getstack")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_getstack"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, stackaddr, stacksize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_getaffinity_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_getaffinity_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_getaffinity_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_getaffinity_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_getaffinity_np"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, size, set);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_setaffinity_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_setaffinity_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_setaffinity_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_setaffinity_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_setaffinity_np"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, size, set);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdCpusetCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_create")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_create")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_cpuset_create"));
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdCpusetDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_cpuset_destroy"));
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(set);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdCpusetClr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t cpu = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_clr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_clr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_cpuset_clr"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cpu, set);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdCpusetSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t cpu = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_set")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_set")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_cpuset_set"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cpu, set);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdCpusetIsset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t cpu = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_isset")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_isset")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_cpuset_isset"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cpu, set);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdCpusetSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef uint64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_size")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_size")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_cpuset_size"));
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(set);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdCpusetZero_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_cpuset_zero")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_cpuset_zero")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_cpuset_zero"));
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(set);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSigtimedwait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__sigtimedwait50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__sigtimedwait50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__sigtimedwait50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(set, info, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSigwaitinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sigwaitinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sigwaitinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sigwaitinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sigwaitinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sigwaitinfo"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(set, info);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdDuplocale_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(base);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdFreelocale_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLocaleconvL_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(loc);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdNewlocale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mask = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* locale = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mask, locale, base);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSettimeofday_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__settimeofday50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__settimeofday50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__settimeofday50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tv, tz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdDup3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t src = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t dst = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "dup3")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dup3")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "dup3")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dup3")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "dup3"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(src, dst, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdKqueue1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t flags = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "kqueue1")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_kqueue1")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "kqueue1")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_kqueue1")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "kqueue1"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLwpSelf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lwp_self")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lwp_self")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_lwp_self"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMemmem_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(haystack, haystacklen, needle, needlelen);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "dl_iterate_phdr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dl_iterate_phdr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "dl_iterate_phdr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dl_iterate_phdr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "dl_iterate_phdr"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callback, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdDlauxinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dlauxinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dlauxinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_dlauxinfo"));
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdIconvOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* tocode = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* fromcode = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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

static Napi::Value libcUnixBsdNetbsdlikeNetbsdIconv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixBsdNetbsdlikeNetbsdIconvClose_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixBsdNetbsdlikeNetbsdTimerCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clockid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sevp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* timerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "timer_create")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_timer_create")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "timer_create")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_timer_create")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "timer_create"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clockid, sevp, timerid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdTimerDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "timer_delete")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_timer_delete")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "timer_delete")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_timer_delete")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "timer_delete"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "timer_getoverrun")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_timer_getoverrun")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "timer_getoverrun")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_timer_getoverrun")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "timer_getoverrun"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdTimerGettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* currValue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__timer_gettime50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__timer_gettime50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__timer_gettime50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerid, currValue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdTimerSettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newValue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* oldValue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__timer_settime50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__timer_settime50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__timer_settime50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(timerid, flags, newValue, oldValue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdDlvsym_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* symbol = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    const char* version = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef void* (*km_fn_t)(void*, const char*, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "dlvsym")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dlvsym")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "dlvsym")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dlvsym")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "dlvsym"));
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handle, symbol, version);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdExplicitMemset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* b = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t c = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef void (*km_fn_t)(void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "explicit_memset")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_explicit_memset")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "explicit_memset")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_explicit_memset")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "explicit_memset"));
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(b, c, len);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* a = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* b = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "consttime_memequal")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_consttime_memequal")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "consttime_memequal")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_consttime_memequal")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "consttime_memequal"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(a, b, len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSetproctitle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* fmt = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setproctitle")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setproctitle")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setproctitle")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setproctitle")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setproctitle"));
    }
#endif
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_fn_ptr(fmt); break;
            case 1: km_fn_ptr(fmt, static_cast<intptr_t>(km_va0)); break;
            case 2: km_fn_ptr(fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_fn_ptr(fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_fn_ptr(fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdMremap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oldp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t oldsize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* newp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t newsize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef void* (*km_fn_t)(void*, uint64_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mremap")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mremap")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mremap")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mremap")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mremap"));
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oldp, oldsize, newp, newsize, flags);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* t = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__sched_rr_get_interval50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__sched_rr_get_interval50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__sched_rr_get_interval50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, t);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSchedSetparam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_setparam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_setparam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_setparam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_setparam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_setparam"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSchedGetparam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_getparam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_getparam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_getparam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_getparam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_getparam"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_getscheduler")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_getscheduler")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_getscheduler")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_getscheduler")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_getscheduler"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t policy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_setscheduler")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_setscheduler")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_setscheduler")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_setscheduler")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_setscheduler"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, policy, param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdPollts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nfds = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sigmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__pollts50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__pollts50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__pollts50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fds, nfds, ts, sigmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetrandom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t buflen = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getrandom")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getrandom")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getrandom")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getrandom")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getrandom"));
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, buflen, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdReboot_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    char* bootstr = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "reboot")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_reboot")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "reboot")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_reboot")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "reboot"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mode, bootstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLwpPark_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clock = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t unpark = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* hint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* unparkhint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "___lwp_park60")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "___lwp_park60")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "___lwp_park60"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clock, flags, ts, unpark, hint, unparkhint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLwpUnpark_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t lwp = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lwp_unpark")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lwp_unpark")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_lwp_unpark"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lwp, hint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targets = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ntargets = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* hint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lwp_unpark_all")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lwp_unpark_all")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "_lwp_unpark_all"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(targets, ntargets, hint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetmntinfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mntbufp, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetvfsstat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t bufsize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getvfsstat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getvfsstat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getvfsstat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getvfsstat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getvfsstat"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, bufsize, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEventfd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t val = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "eventfd")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_eventfd")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "eventfd")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_eventfd")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "eventfd"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(val, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEventfdRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t efd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* valp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "eventfd_read")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_eventfd_read")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "eventfd_read")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_eventfd_read")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "eventfd_read"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(efd, valp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEventfdWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t efd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint64_t val = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "eventfd_write")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_eventfd_write")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "eventfd_write")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_eventfd_write")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "eventfd_write"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(efd, val);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdTimerfdCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clockid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "timerfd_create")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_timerfd_create")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "timerfd_create")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_timerfd_create")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "timerfd_create"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clockid, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdTimerfdGettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* currValue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "timerfd_gettime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_timerfd_gettime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "timerfd_gettime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_timerfd_gettime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "timerfd_gettime"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, currValue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdTimerfdSettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newValue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* oldValue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "timerfd_settime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_timerfd_settime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "timerfd_settime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_timerfd_settime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "timerfd_settime"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, flags, newValue, oldValue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdQsortR_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixBsdNetbsdlikeNetbsdAioRead_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdAioWrite_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdAioFsync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(op, aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdAioError_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdAioReturn_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdAioSuspend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocbList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nitems = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__aio_suspend50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__aio_suspend50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__aio_suspend50"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(aiocbList, nitems, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdAioCancel_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLioListio_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* aiocbList = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mode, aiocbList, nitems, sevp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetpwentR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buflen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__getpwent_r50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__getpwent_r50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__getpwent_r50"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "__getpwent_r50"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "__getpwent_r50"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwd, buf, buflen, result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetgrentR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* grp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buflen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getgrent_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getgrent_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getgrent_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getgrent_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getgrent_r"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getgrent_r"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getgrent_r"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(grp, buf, buflen, result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEmalloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t n = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    typedef void* (*km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "emalloc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_emalloc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "emalloc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_emalloc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "emalloc"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "emalloc"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "emalloc"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(n);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEcalloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t n = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t c = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef void* (*km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ecalloc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ecalloc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ecalloc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ecalloc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ecalloc"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "ecalloc"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "ecalloc"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(n, c);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdErealloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* p = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t n = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef void* (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "erealloc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_erealloc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "erealloc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_erealloc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "erealloc"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "erealloc"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "erealloc"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(p, n);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEreallocarr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* p = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t n = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t s = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef void (*km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ereallocarr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ereallocarr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ereallocarr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ereallocarr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ereallocarr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "ereallocarr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "ereallocarr"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(p, n, s);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEstrdup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* s = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef char* (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "estrdup")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_estrdup")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "estrdup")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_estrdup")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "estrdup"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrdup"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrdup"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(s);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEstrndup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* s = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef char* (*km_fn_t)(const char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "estrndup")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_estrndup")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "estrndup")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_estrndup")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "estrndup"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrndup"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrndup"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(s, len);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEstrlcpy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* dst = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* src = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef uint64_t (*km_fn_t)(char*, const char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "estrlcpy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_estrlcpy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "estrlcpy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_estrlcpy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "estrlcpy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrlcpy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrlcpy"));
        }
#endif
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dst, src, len);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEstrlcat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* dst = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* src = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef uint64_t (*km_fn_t)(char*, const char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "estrlcat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_estrlcat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "estrlcat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_estrlcat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "estrlcat"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrlcat"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrlcat"));
        }
#endif
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dst, src, len);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEstrtoi_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* nptr = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t base = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t lo = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t hi = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(const char*, int32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "estrtoi")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_estrtoi")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "estrtoi")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_estrtoi")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "estrtoi"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrtoi"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrtoi"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(nptr, base, lo, hi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEstrtou_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* nptr = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t base = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t lo = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t hi = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef uint64_t (*km_fn_t)(const char*, int32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "estrtou")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_estrtou")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "estrtou")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_estrtou")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "estrtou"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrtou"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "estrtou"));
        }
#endif
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(nptr, base, lo, hi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEasprintf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* fmt = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    typedef int32_t (*km_fn_t)(void*, const char*, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "easprintf")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_easprintf")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "easprintf")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_easprintf")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "easprintf"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "easprintf"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "easprintf"));
        }
#endif
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(string, fmt); break;
            case 1: km_res = km_fn_ptr(string, fmt, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(string, fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(string, fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(string, fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    } else {
        errno = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEvasprintf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* fmt = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    typedef int32_t (*km_fn_t)(void*, const char*, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "evasprintf")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_evasprintf")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "evasprintf")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_evasprintf")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "evasprintf"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "evasprintf"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "evasprintf"));
        }
#endif
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(string, fmt); break;
            case 1: km_res = km_fn_ptr(string, fmt, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(string, fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(string, fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(string, fmt, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    } else {
        errno = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdEsetfunc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void* (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "esetfunc")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_esetfunc")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "esetfunc")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_esetfunc")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "esetfunc"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "esetfunc"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "esetfunc"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cb);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSecurePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "secure_path")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_secure_path")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "secure_path")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_secure_path")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "secure_path"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "secure_path"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "secure_path"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSnprintb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t buflen = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    const char* fmt = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t val = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int32_t (*km_fn_t)(char*, uint64_t, const char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "snprintb")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_snprintb")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "snprintb")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_snprintb")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "snprintb"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "snprintb"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "snprintb"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, buflen, fmt, val);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSnprintbM_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t buflen = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    const char* fmt = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t val = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t max = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef int32_t (*km_fn_t)(char*, uint64_t, const char*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "snprintb_m")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_snprintb_m")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "snprintb_m")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_snprintb_m")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "snprintb_m"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "snprintb_m"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "snprintb_m"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, buflen, fmt, val, max);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetbootfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef const char* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getbootfile")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getbootfile")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getbootfile")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getbootfile")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getbootfile"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getbootfile"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getbootfile"));
        }
#endif
    }
#endif
    const char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetbyteorder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getbyteorder")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getbyteorder")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getbyteorder")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getbyteorder")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getbyteorder"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getbyteorder"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getbyteorder"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetdiskrawname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t buflen = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef const char* (*km_fn_t)(char*, uint64_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getdiskrawname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getdiskrawname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getdiskrawname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getdiskrawname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getdiskrawname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getdiskrawname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getdiskrawname"));
        }
#endif
    }
#endif
    const char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, buflen, name);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t buflen = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef const char* (*km_fn_t)(char*, uint64_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getdiskcookedname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getdiskcookedname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getdiskcookedname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getdiskcookedname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getdiskcookedname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getdiskcookedname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getdiskcookedname"));
        }
#endif
    }
#endif
    const char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, buflen, name);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetfsspecname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t buflen = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    const char* spec = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef const char* (*km_fn_t)(char*, uint64_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getfsspecname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getfsspecname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getfsspecname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getfsspecname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getfsspecname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getfsspecname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getfsspecname"));
        }
#endif
    }
#endif
    const char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, buflen, spec);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdStrpct_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t bufsiz = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t numerator = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t denominator = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t precision = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef char* (*km_fn_t)(char*, uint64_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "strpct")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_strpct")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "strpct")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_strpct")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "strpct"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "strpct"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "strpct"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, bufsiz, numerator, denominator, precision);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdStrspct_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t bufsiz = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int64_t numerator = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t denominator = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    uint64_t precision = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    typedef char* (*km_fn_t)(char*, uint64_t, int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "strspct")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_strspct")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "strspct")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_strspct")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "strspct"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "strspct"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "strspct"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf, bufsiz, numerator, denominator, precision);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLogin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ut = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__login50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__login50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__login50"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "__login50"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "__login50"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ut);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLoginx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ut = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__loginx50")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__loginx50")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__loginx50"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "__loginx50"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "__loginx50"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ut);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLogout_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* line = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "logout")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_logout")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "logout")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_logout")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "logout"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "logout"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "logout"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(line);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLogoutx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* line = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t status = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t tpe = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef void (*km_fn_t)(const char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "logoutx")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_logoutx")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "logoutx")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_logoutx")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "logoutx"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "logoutx"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "logoutx"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(line, status, tpe);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLogwtmp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* line = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    const char* host = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef void (*km_fn_t)(const char*, const char*, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "logwtmp")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_logwtmp")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "logwtmp")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_logwtmp")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "logwtmp"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "logwtmp"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "logwtmp"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(line, name, host);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLogwtmpx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* line = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    const char* host = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t status = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t tpe = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef void (*km_fn_t)(const char*, const char*, const char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "logwtmpx")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_logwtmpx")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "logwtmpx")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_logwtmpx")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "logwtmpx"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "logwtmpx"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "logwtmpx"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(line, name, host, status, tpe);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdGetxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(const char*, const char*, void*, uint64_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "getxattr"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, name, value, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLgetxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(const char*, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "lgetxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lgetxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "lgetxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lgetxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "lgetxattr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "lgetxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "lgetxattr"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, name, value, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdFgetxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t filedes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(int32_t, const char*, void*, uint64_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "fgetxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "fgetxattr"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filedes, name, value, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdSetxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int32_t (*km_fn_t)(const char*, const char*, void*, uint64_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "setxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "setxattr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, name, value, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLsetxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int32_t (*km_fn_t)(const char*, const char*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "lsetxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lsetxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "lsetxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lsetxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "lsetxattr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "lsetxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "lsetxattr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, name, value, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdFsetxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t filedes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, void*, uint64_t, int32_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "fsetxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "fsetxattr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filedes, name, value, size, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdListxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* list = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int64_t (*km_fn_t)(const char*, char*, uint64_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "listxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "listxattr"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, list, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLlistxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* list = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int64_t (*km_fn_t)(const char*, char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "llistxattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_llistxattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "llistxattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_llistxattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "llistxattr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "llistxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "llistxattr"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, list, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdFlistxattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t filedes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    char* list = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int64_t (*km_fn_t)(int32_t, char*, uint64_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "flistxattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "flistxattr"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(filedes, list, size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdRemovexattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(const char*, const char*);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "removexattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "removexattr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdLremovexattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(const char*, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "lremovexattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lremovexattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "lremovexattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lremovexattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "lremovexattr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "lremovexattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "lremovexattr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(path, name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdFremovexattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, const char*, const char*);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "fremovexattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "fremovexattr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, path, name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdStringToFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringP = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* setp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clrp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "string_to_flags")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_string_to_flags")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "string_to_flags")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_string_to_flags")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "string_to_flags"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "string_to_flags"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "string_to_flags"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(stringP, setp, clrp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdFlagsToString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t flags = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    const char* def = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(uint64_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "flags_to_string")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_flags_to_string")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "flags_to_string")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_flags_to_string")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "flags_to_string"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "flags_to_string"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "flags_to_string"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(flags, def);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* cntp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef void* (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "kinfo_getvmmap")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_kinfo_getvmmap")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "kinfo_getvmmap")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_kinfo_getvmmap")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "kinfo_getvmmap"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("/usr/lib/libutil.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "kinfo_getvmmap"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_util = nullptr;
            static bool km_h_util_init = false;
            if (!km_h_util_init) {
                km_h_util_init = true;
                km_h_util = dlopen("libutil.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_util != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_util, "kinfo_getvmmap"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, cntp);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdBacktrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addrlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef uint64_t (*km_fn_t)(void*, uint64_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("/usr/lib/libexecinfo.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("libexecinfo.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace"));
        }
#endif
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addrlist, len);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addrlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef void* (*km_fn_t)(void*, uint64_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("/usr/lib/libexecinfo.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace_symbols"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("libexecinfo.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace_symbols"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addrlist, len);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addrlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t fd = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
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
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("/usr/lib/libexecinfo.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace_symbols_fd"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("libexecinfo.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace_symbols_fd"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addrlist, len, fd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addrlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    const char* fmt = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef void* (*km_fn_t)(void*, uint64_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "backtrace_symbols_fmt")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_backtrace_symbols_fmt")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "backtrace_symbols_fmt")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_backtrace_symbols_fmt")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "backtrace_symbols_fmt"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("/usr/lib/libexecinfo.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace_symbols_fmt"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("libexecinfo.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace_symbols_fmt"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addrlist, len, fmt);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addrlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t fd = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    const char* fmt = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "backtrace_symbols_fd_fmt")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_backtrace_symbols_fd_fmt")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "backtrace_symbols_fd_fmt")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_backtrace_symbols_fd_fmt")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "backtrace_symbols_fd_fmt"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("/usr/lib/libexecinfo.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace_symbols_fd_fmt"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_execinfo = nullptr;
            static bool km_h_execinfo_init = false;
            if (!km_h_execinfo_init) {
                km_h_execinfo_init = true;
                km_h_execinfo = dlopen("libexecinfo.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_execinfo != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_execinfo, "backtrace_symbols_fd_fmt"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addrlist, len, fd, fmt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_unix_bsd_netbsdlike_netbsd_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("libcUnixBsdNetbsdlikeNetbsdClockNanosleep", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdClockNanosleep_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdReallocarr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdReallocarr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdChflags", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdChflags_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdFchflags", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdFchflags_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLchflags", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLchflags_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrListFd", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrListFd_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrListFile", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrListFile_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrListLink", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrListLink_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrGetFd", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrGetFd_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrGetFile", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrGetFile_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrGetLink", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrGetLink_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrSetFd", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrSetFd_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrSetFile", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrSetFile_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrSetLink", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrSetLink_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdOpenpty", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdOpenpty_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdForkpty", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdForkpty_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPtsnameR", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPtsnameR_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLutimes", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLutimes_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGettimeofday", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGettimeofday_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetnameinfo", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetnameinfo_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMprotect", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMprotect_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSysctl", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSysctl_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSysctlbyname", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSysctlbyname_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSysctlnametomib", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSysctlnametomib_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdKevent", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdKevent_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMount", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMount_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqOpen", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqOpen_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqClose", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqClose_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqGetattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqGetattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqNotify", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqNotify_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqReceive", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqReceive_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqSend", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqSend_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqSetattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqSetattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqTimedreceive", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqTimedreceive_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqTimedsend", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqTimedsend_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMqUnlink", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMqUnlink_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPtrace", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPtrace_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdUtrace", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdUtrace_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdCpusetCreate", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdCpusetCreate_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdCpusetDestroy", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdCpusetDestroy_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdCpusetClr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdCpusetClr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdCpusetSet", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdCpusetSet_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdCpusetIsset", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdCpusetIsset_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdCpusetSize", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdCpusetSize_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdCpusetZero", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdCpusetZero_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSigtimedwait", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSigtimedwait_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSigwaitinfo", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSigwaitinfo_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdDuplocale", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdDuplocale_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdFreelocale", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdFreelocale_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLocaleconvL", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLocaleconvL_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdNewlocale", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdNewlocale_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSettimeofday", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSettimeofday_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdDup3", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdDup3_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdKqueue1", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdKqueue1_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLwpSelf", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLwpSelf_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMemmem", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMemmem_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdDlauxinfo", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdDlauxinfo_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdIconvOpen", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdIconvOpen_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdIconv", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdIconv_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdIconvClose", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdIconvClose_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdTimerCreate", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdTimerCreate_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdTimerDelete", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdTimerDelete_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdTimerGettime", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdTimerGettime_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdTimerSettime", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdTimerSettime_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdDlvsym", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdDlvsym_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdExplicitMemset", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdExplicitMemset_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSetproctitle", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSetproctitle_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdMremap", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdMremap_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSchedSetparam", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSchedSetparam_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSchedGetparam", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSchedGetparam_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdPollts", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdPollts_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetrandom", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetrandom_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdReboot", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdReboot_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLwpPark", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLwpPark_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLwpUnpark", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLwpUnpark_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetmntinfo", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetmntinfo_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetvfsstat", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetvfsstat_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEventfd", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEventfd_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEventfdRead", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEventfdRead_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEventfdWrite", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEventfdWrite_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdTimerfdCreate", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdTimerfdCreate_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdTimerfdGettime", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdTimerfdGettime_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdTimerfdSettime", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdTimerfdSettime_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdQsortR", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdQsortR_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdAioRead", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdAioRead_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdAioWrite", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdAioWrite_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdAioFsync", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdAioFsync_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdAioError", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdAioError_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdAioReturn", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdAioReturn_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdAioSuspend", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdAioSuspend_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdAioCancel", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdAioCancel_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLioListio", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLioListio_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetpwentR", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetpwentR_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetgrentR", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetgrentR_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEmalloc", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEmalloc_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEcalloc", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEcalloc_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdErealloc", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdErealloc_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEreallocarr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEreallocarr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEstrdup", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEstrdup_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEstrndup", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEstrndup_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEstrlcpy", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEstrlcpy_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEstrlcat", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEstrlcat_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEstrtoi", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEstrtoi_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEstrtou", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEstrtou_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEasprintf", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEasprintf_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEvasprintf", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEvasprintf_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdEsetfunc", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdEsetfunc_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSecurePath", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSecurePath_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSnprintb", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSnprintb_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSnprintbM", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSnprintbM_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetbootfile", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetbootfile_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetbyteorder", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetbyteorder_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetdiskrawname", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetdiskrawname_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetfsspecname", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetfsspecname_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdStrpct", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdStrpct_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdStrspct", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdStrspct_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLogin", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLogin_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLoginx", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLoginx_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLogout", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLogout_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLogoutx", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLogoutx_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLogwtmp", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLogwtmp_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLogwtmpx", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLogwtmpx_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdGetxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdGetxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLgetxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLgetxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdFgetxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdFgetxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdSetxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdSetxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLsetxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLsetxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdFsetxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdFsetxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdListxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdListxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLlistxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLlistxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdFlistxattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdFlistxattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdRemovexattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdRemovexattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdLremovexattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdLremovexattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdFremovexattr", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdFremovexattr_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdStringToFlags", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdStringToFlags_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdFlagsToString", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdFlagsToString_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdBacktrace", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdBacktrace_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt_napi));
    exports.Set("libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt", Napi::Function::New(env, libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_unix_bsd_netbsdlike_netbsd_napi, nullptr };
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
