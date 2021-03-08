package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

public class Result_FundingCreatedDecodeErrorZ extends CommonBase {
	private Result_FundingCreatedDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_FundingCreatedDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_FundingCreatedDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_FundingCreatedDecodeErrorZ_result_ok(ptr)) {
			return new Result_FundingCreatedDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_FundingCreatedDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_FundingCreatedDecodeErrorZ_OK extends Result_FundingCreatedDecodeErrorZ {
		public final FundingCreated res;
		private Result_FundingCreatedDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_FundingCreatedDecodeErrorZ_get_ok(ptr);
			FundingCreated res_hu_conv = new FundingCreated(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_FundingCreatedDecodeErrorZ_OK(FundingCreated res) {
			this(null, bindings.CResult_FundingCreatedDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_FundingCreatedDecodeErrorZ_Err extends Result_FundingCreatedDecodeErrorZ {
		public final DecodeError err;
		private Result_FundingCreatedDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_FundingCreatedDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_FundingCreatedDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_FundingCreatedDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
