
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class Result_UpdateFailMalformedHTLCDecodeErrorZ extends CommonBase {
	private Result_UpdateFailMalformedHTLCDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_UpdateFailMalformedHTLCDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_UpdateFailMalformedHTLCDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_UpdateFailMalformedHTLCDecodeErrorZ_result_ok(ptr)) {
			return new Result_UpdateFailMalformedHTLCDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_UpdateFailMalformedHTLCDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_UpdateFailMalformedHTLCDecodeErrorZ_OK extends Result_UpdateFailMalformedHTLCDecodeErrorZ {
		public final UpdateFailMalformedHTLC res;
		private Result_UpdateFailMalformedHTLCDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number res = bindings.LDKCResult_UpdateFailMalformedHTLCDecodeErrorZ_get_ok(ptr);
			const res_hu_conv: UpdateFailMalformedHTLC = new UpdateFailMalformedHTLC(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_UpdateFailMalformedHTLCDecodeErrorZ_OK(UpdateFailMalformedHTLC res) {
			this(null, bindings.CResult_UpdateFailMalformedHTLCDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_UpdateFailMalformedHTLCDecodeErrorZ_Err extends Result_UpdateFailMalformedHTLCDecodeErrorZ {
		public final DecodeError err;
		private Result_UpdateFailMalformedHTLCDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number err = bindings.LDKCResult_UpdateFailMalformedHTLCDecodeErrorZ_get_err(ptr);
			const err_hu_conv: DecodeError = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_UpdateFailMalformedHTLCDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_UpdateFailMalformedHTLCDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
