package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

public class Result_RoutingFeesDecodeErrorZ extends CommonBase {
	private Result_RoutingFeesDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_RoutingFeesDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_RoutingFeesDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_RoutingFeesDecodeErrorZ_result_ok(ptr)) {
			return new Result_RoutingFeesDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_RoutingFeesDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_RoutingFeesDecodeErrorZ_OK extends Result_RoutingFeesDecodeErrorZ {
		public final RoutingFees res;
		private Result_RoutingFeesDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_RoutingFeesDecodeErrorZ_get_ok(ptr);
			RoutingFees res_hu_conv = new RoutingFees(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_RoutingFeesDecodeErrorZ_OK(RoutingFees res) {
			this(null, bindings.CResult_RoutingFeesDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_RoutingFeesDecodeErrorZ_Err extends Result_RoutingFeesDecodeErrorZ {
		public final DecodeError err;
		private Result_RoutingFeesDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_RoutingFeesDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_RoutingFeesDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_RoutingFeesDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
