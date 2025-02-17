package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

public class Result_ChannelReestablishDecodeErrorZ extends CommonBase {
	private Result_ChannelReestablishDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_ChannelReestablishDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_ChannelReestablishDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_ChannelReestablishDecodeErrorZ_result_ok(ptr)) {
			return new Result_ChannelReestablishDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_ChannelReestablishDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_ChannelReestablishDecodeErrorZ_OK extends Result_ChannelReestablishDecodeErrorZ {
		public final ChannelReestablish res;
		private Result_ChannelReestablishDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_ChannelReestablishDecodeErrorZ_get_ok(ptr);
			ChannelReestablish res_hu_conv = new ChannelReestablish(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_ChannelReestablishDecodeErrorZ_OK(ChannelReestablish res) {
			this(null, bindings.CResult_ChannelReestablishDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_ChannelReestablishDecodeErrorZ_Err extends Result_ChannelReestablishDecodeErrorZ {
		public final DecodeError err;
		private Result_ChannelReestablishDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_ChannelReestablishDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_ChannelReestablishDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_ChannelReestablishDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
