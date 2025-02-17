package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

public class Result_ChannelMonitorUpdateDecodeErrorZ extends CommonBase {
	private Result_ChannelMonitorUpdateDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_ChannelMonitorUpdateDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_ChannelMonitorUpdateDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_ChannelMonitorUpdateDecodeErrorZ_result_ok(ptr)) {
			return new Result_ChannelMonitorUpdateDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_ChannelMonitorUpdateDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_ChannelMonitorUpdateDecodeErrorZ_OK extends Result_ChannelMonitorUpdateDecodeErrorZ {
		public final ChannelMonitorUpdate res;
		private Result_ChannelMonitorUpdateDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_ChannelMonitorUpdateDecodeErrorZ_get_ok(ptr);
			ChannelMonitorUpdate res_hu_conv = new ChannelMonitorUpdate(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_ChannelMonitorUpdateDecodeErrorZ_OK(ChannelMonitorUpdate res) {
			this(null, bindings.CResult_ChannelMonitorUpdateDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_ChannelMonitorUpdateDecodeErrorZ_Err extends Result_ChannelMonitorUpdateDecodeErrorZ {
		public final DecodeError err;
		private Result_ChannelMonitorUpdateDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_ChannelMonitorUpdateDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_ChannelMonitorUpdateDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_ChannelMonitorUpdateDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
