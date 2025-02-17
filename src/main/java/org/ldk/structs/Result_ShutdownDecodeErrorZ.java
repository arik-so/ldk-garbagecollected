package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

public class Result_ShutdownDecodeErrorZ extends CommonBase {
	private Result_ShutdownDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_ShutdownDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_ShutdownDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_ShutdownDecodeErrorZ_result_ok(ptr)) {
			return new Result_ShutdownDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_ShutdownDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_ShutdownDecodeErrorZ_OK extends Result_ShutdownDecodeErrorZ {
		public final Shutdown res;
		private Result_ShutdownDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_ShutdownDecodeErrorZ_get_ok(ptr);
			Shutdown res_hu_conv = new Shutdown(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_ShutdownDecodeErrorZ_OK(Shutdown res) {
			this(null, bindings.CResult_ShutdownDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_ShutdownDecodeErrorZ_Err extends Result_ShutdownDecodeErrorZ {
		public final DecodeError err;
		private Result_ShutdownDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_ShutdownDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_ShutdownDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_ShutdownDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
