package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

public class Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ extends CommonBase {
	private Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_result_ok(ptr)) {
			return new Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_OK extends Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ {
		public final TwoTuple<byte[], ChannelMonitor> res;
		private Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_get_ok(ptr);
			byte[] res_a = bindings.LDKC2Tuple_BlockHashChannelMonitorZ_get_a(res);
			long res_b = bindings.LDKC2Tuple_BlockHashChannelMonitorZ_get_b(res);
			ChannelMonitor res_b_hu_conv = new ChannelMonitor(null, res_b);
			res_b_hu_conv.ptrs_to.add(this);;
			TwoTuple<byte[], ChannelMonitor> res_conv = new TwoTuple<byte[], ChannelMonitor>(res_a, res_b_hu_conv, () -> {
				bindings.C2Tuple_BlockHashChannelMonitorZ_free(res);
			});
			res_b_hu_conv.ptrs_to.add(res_conv);
			this.res = res_conv;
		}
		public Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_OK(TwoTuple<byte[], ChannelMonitor> res) {
			this(null, bindings.CResult_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_ok(bindings.C2Tuple_BlockHashChannelMonitorZ_new(res.a, res.b == null ? 0 : res.b.ptr & ~1)));
			this.ptrs_to.add(res.b);
		}
	}

	public static final class Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_Err extends Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ {
		public final DecodeError err;
		private Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
