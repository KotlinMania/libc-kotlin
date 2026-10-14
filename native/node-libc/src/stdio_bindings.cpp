// stdio_bindings.cpp — N-API wrappers for C stdio.h functions
#include <napi.h>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <cerrno>

static FILE* g_files[256] = {nullptr};

static int alloc_file_slot(FILE* fp) {
    if (!fp) return 0;
    for (int i = 1; i < 256; i++) {
        if (!g_files[i]) {
            g_files[i] = fp;
            return i;
        }
    }
    ::fclose(fp);
    errno = EMFILE;
    return 0;
}

static FILE* get_file_slot(int slot) {
    if (slot <= 0 || slot >= 256) return nullptr;
    return g_files[slot];
}

void RegisterStdioBindings(Napi::Env env, Napi::Object exports) {
    // fopen — returns 1-based slot index (or 0 on failure)
    exports.Set("fopen", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "fopen requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        std::string path = info[0].As<Napi::String>().Utf8Value();
        std::string mode = info[1].As<Napi::String>().Utf8Value();
        FILE* fp = ::fopen(path.c_str(), mode.c_str());
        return Napi::Number::New(env, alloc_file_slot(fp));
    }));

    // fclose
    exports.Set("fclose", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "fclose requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int slot = info[0].As<Napi::Number>().Int32Value();
        FILE* fp = get_file_slot(slot);
        if (!fp) {
            errno = EBADF;
            return Napi::Number::New(env, -1);
        }
        g_files[slot] = nullptr;
        return Napi::Number::New(env, ::fclose(fp));
    }));

    // fread — returns number of items read
    exports.Set("fread", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 4) {
            Napi::TypeError::New(env, "fread requires 4 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        auto buffer = info[0].As<Napi::Uint8Array>();
        size_t size = info[1].As<Napi::Number>().Int64Value();
        size_t count = info[2].As<Napi::Number>().Int64Value();
        FILE* fp = get_file_slot(info[3].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, 0);
        size_t result = ::fread(buffer.Data(), size, count, fp);
        return Napi::Number::New(env, result);
    }));

    // fwrite — returns number of items written
    exports.Set("fwrite", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 4) {
            Napi::TypeError::New(env, "fwrite requires 4 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        auto buffer = info[0].As<Napi::Uint8Array>();
        size_t size = info[1].As<Napi::Number>().Int64Value();
        size_t count = info[2].As<Napi::Number>().Int64Value();
        FILE* fp = get_file_slot(info[3].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, 0);
        size_t result = ::fwrite(buffer.Data(), size, count, fp);
        return Napi::Number::New(env, result);
    }));

    // fseek
    exports.Set("fseek", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "fseek requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        FILE* fp = get_file_slot(info[0].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, -1);
        long offset = info[1].As<Napi::Number>().Int64Value();
        int whence = info[2].As<Napi::Number>().Int32Value();
        return Napi::Number::New(env, ::fseek(fp, offset, whence));
    }));

    // ftell
    exports.Set("ftell", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "ftell requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        FILE* fp = get_file_slot(info[0].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, -1);
        return Napi::Number::New(env, ::ftell(fp));
    }));

    // fflush
    exports.Set("fflush", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "fflush requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int slot = info[0].As<Napi::Number>().Int32Value();
        if (slot == 0) return Napi::Number::New(env, ::fflush(nullptr));
        FILE* fp = get_file_slot(slot);
        if (!fp) return Napi::Number::New(env, -1);
        return Napi::Number::New(env, ::fflush(fp));
    }));

    // fgetc
    exports.Set("fgetc", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return Napi::Number::New(env, -1);
        FILE* fp = get_file_slot(info[0].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, -1);
        return Napi::Number::New(env, ::fgetc(fp));
    }));

    // fputc
    exports.Set("fputc", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) return Napi::Number::New(env, -1);
        int c = info[0].As<Napi::Number>().Int32Value();
        FILE* fp = get_file_slot(info[1].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, -1);
        return Napi::Number::New(env, ::fputc(c, fp));
    }));

    // fgets(n, fp)
    exports.Set("fgets", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) return env.Null();
        int n = info[0].As<Napi::Number>().Int32Value();
        FILE* fp = get_file_slot(info[1].As<Napi::Number>().Int32Value());
        if (!fp || n <= 0) return env.Null();
        char* buf = static_cast<char*>(::malloc(static_cast<size_t>(n) + 1));
        if (!buf) return env.Null();
        char* res = ::fgets(buf, n, fp);
        Napi::Value out = res ? Napi::String::New(env, res) : env.Null();
        ::free(buf);
        return out;
    }));

    // fputs(s, fp)
    exports.Set("fputs", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) return Napi::Number::New(env, -1);
        std::string s = info[0].As<Napi::String>().Utf8Value();
        FILE* fp = get_file_slot(info[1].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, -1);
        return Napi::Number::New(env, ::fputs(s.c_str(), fp));
    }));

    // feof(fp)
    exports.Set("feof", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return Napi::Number::New(env, 0);
        FILE* fp = get_file_slot(info[0].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, 0);
        return Napi::Number::New(env, ::feof(fp));
    }));

    // ferror(fp)
    exports.Set("ferror", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return Napi::Number::New(env, 0);
        FILE* fp = get_file_slot(info[0].As<Napi::Number>().Int32Value());
        if (!fp) return Napi::Number::New(env, 0);
        return Napi::Number::New(env, ::ferror(fp));
    }));

    // clearerr(fp)
    exports.Set("clearerr", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() >= 1) {
            FILE* fp = get_file_slot(info[0].As<Napi::Number>().Int32Value());
            if (fp) ::clearerr(fp);
        }
        return Napi::Number::New(env, 0);
    }));

    // popen(command, mode)
    exports.Set("popen", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) return Napi::Number::New(env, 0);
        std::string cmd = info[0].As<Napi::String>().Utf8Value();
        std::string mode = info[1].As<Napi::String>().Utf8Value();
#ifdef _WIN32
        FILE* fp = ::_popen(cmd.c_str(), mode.c_str());
#else
        FILE* fp = ::popen(cmd.c_str(), mode.c_str());
#endif
        return Napi::Number::New(env, alloc_file_slot(fp));
    }));

    // pclose(fp)
    exports.Set("pclose", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return Napi::Number::New(env, -1);
        int slot = info[0].As<Napi::Number>().Int32Value();
        FILE* fp = get_file_slot(slot);
        if (!fp) {
            errno = EBADF;
            return Napi::Number::New(env, -1);
        }
        g_files[slot] = nullptr;
#ifdef _WIN32
        return Napi::Number::New(env, ::_pclose(fp));
#else
        return Napi::Number::New(env, ::pclose(fp));
#endif
    }));

    // remove(filename)
    exports.Set("remove", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return Napi::Number::New(env, -1);
        std::string path = info[0].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::remove(path.c_str()));
    }));

    // rename(oldname, newname)
    exports.Set("rename", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) return Napi::Number::New(env, -1);
        std::string oldname = info[0].As<Napi::String>().Utf8Value();
        std::string newname = info[1].As<Napi::String>().Utf8Value();
        return Napi::Number::New(env, ::rename(oldname.c_str(), newname.c_str()));
    }));

    // printf (simplified — writes to stdout)
    exports.Set("printf", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return Napi::Number::New(env, 0);
        std::string str = info[0].As<Napi::String>().Utf8Value();
        int result = ::printf("%s", str.c_str());
        return Napi::Number::New(env, result);
    }));
}